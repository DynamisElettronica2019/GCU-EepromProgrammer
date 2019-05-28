package back_end;

import java.util.concurrent.TimeUnit;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortEvent;
import com.fazecast.jSerialComm.SerialPortPacketListener;

public class Receiver {
	private Parser parser;
	private Data data;
	private char[] strRead; // Where read data are saved
	private SerialPort comPort; // Com port object, null when closed
	private int baudRate;
	private String portName; // Ex: COM5
	private int strIndex; // Primo free element of the array
	private int startIndex; // Start of the string after finding "epr" index
	private int closeIndex; // End of the string index, 19 bytes after start
	private int state; // 0 for none, 1 for 'e', 2 for 'p', 3 for 'r' receive all 19 following bytes
	private int dataCounter;
	private String strToSend; // String to send to parser
	
	/*
	 * Constructor. Selezionare modalità car ("C") o lap ("L"). La modalità L non ha il command sender
	 */
	public Receiver(Data data, Parser parser) {
		this.data = data;
		this.parser = parser;
		
		strRead = new char[50];
		strIndex = 0;
		startIndex = -1;
		baudRate = 115200;
		portName = "COM5";	
		state = 0;
	}
	
	/*
	 * Send data through serial, string is the parameter
	 */
	public void send(String toSend) {
		toSend = "epr"+toSend;
		comPort.writeBytes(toSend.getBytes(), toSend.getBytes().length);
	}
	
	/*
	 * Open serial, receive data and put them into the buffer
	 */
	public final class PacketListener implements SerialPortPacketListener {
		
		@Override
		public int getListeningEvents() {
			return SerialPort.LISTENING_EVENT_DATA_RECEIVED; // Verifica la presenza di dati da leggere
		}

		@Override
		public int getPacketSize() {
			return 1;
		}

		@Override
		public void serialEvent(SerialPortEvent event) { // Callback function
			try {
				byte[] newData = event.getReceivedData();
				for (int i = 0; i < newData.length; ++i) {
					strRead[strIndex] = (char) newData[i]; // Salva i byte letti nell'array
					if ((state == 0) && (strRead[strIndex] == 'e')) { // Salva l'indice della parentesi aperta
						state = 1;
						strIndex++;
					}
					else if ((state == 1) && (strRead[strIndex] == 'p')) { // Salva l'indice della parentesi aperta
						state = 2;
						strIndex++;
					}
					else if ((state == 2) && (strRead[strIndex] == 'r')) { // Salva l'indice della parentesi aperta
						state = 3;
						strIndex++;
						startIndex = strIndex;
					}
					else if (state == 3) { // Salva l'indice della parentesi aperta
						if(dataCounter < 19) {
							dataCounter++;
							strIndex++;
						}
						else {
							closeIndex = strIndex;
							createString(); // Call string processing function
						}	
					}
					else {
						state = 0;
						strIndex = 0;
						startIndex = -1;
					}
					if (strIndex==49) {
						strIndex = 0;
						startIndex = -1;
					}
				}
			}
			catch (Exception e) { //check errore
				e.printStackTrace();
			}
		}
	}
		
		
	/*
	 * Create receiver on new thread, currently retrying to connect every 2 seconds
	 * Need to manage connection/disconnection?
	 * Eventually use function comPort.closePort()
	 */
	public void Reader() {
		comPort = SerialPort.getCommPort(portName);
		Thread portListener = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					if((comPort.isOpen() == false)) {
						comPort.openPort(); //Open port
						if((comPort.isOpen() == true)) {
							System.out.println("Connected on "+portName);
						}
					}
					try {
						TimeUnit.SECONDS.sleep(2); //Wait
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		portListener.start();
		comPort.setBaudRate(baudRate);
		PacketListener listener = new PacketListener();
		comPort.addDataListener(listener);
	}
	
	/*
	 * Create string to pass to parser, without "epr"
	 */
	private void createString() {
		strToSend = String.valueOf(strRead, startIndex, closeIndex);
		strIndex = 0;
		startIndex = -1;
		closeIndex = -1;
		parser.parseString(strToSend); // Pass string to parse to parser
	}
}
