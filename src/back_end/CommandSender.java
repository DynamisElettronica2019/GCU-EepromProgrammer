package back_end;

import java.util.ArrayList;

import com.fazecast.jSerialComm.SerialPort;

import back_end.sender.SenderPage1;
import back_end.sender.SenderPage2;
import back_end.sender.SenderPage3;
import back_end.sender.SenderPage4;
import back_end.sender.SenderPage5;
import back_end.sender.SenderPage6;
import back_end.sender.SenderPage7;
import configuration.Channels;
import front_end.View;

public class CommandSender {
	private Receiver receiver;
	private Data data;

	/*
	 * Create a new command sender associated with a specific 'receiver' and a specific 'data'. Set the command sender as command sender of all views
	 */
	public CommandSender(Receiver receiver, Data data, ArrayList<View> myViews) {
		this.receiver=receiver;
		this.data=data;
		for(View v: myViews){
			v.setCommandSender(this);
		}
	}
	
	/*
	 * Call receiver send function
	 */
	public void sendCommand(String comm) {
		receiver.send(comm);
	}
	
	/*
	 * Read page
	 */
	public void sendReadRequest(char page) {
		StringBuilder string = new StringBuilder();
		string.append(Channels.READ_ID);
		string.append(page);
		// Missing cell to read from
		for(int i=0; i<Channels.DATA_SIZE; i++) {
			string.append('0');
		}
		receiver.send(string.toString());
	}
	
	/*
	 * Send acceleration page
	 */
	public void sendNewDataPage1() {
		SenderPage1 sender = new SenderPage1(receiver);
		sender.Send(data.getGearshift());
	}
	
	public void sendNewDataPage2() {
		SenderPage2 sender = new SenderPage2(receiver);
		sender.Send(data.getGearshift());
	}
	
	public void sendNewDataPage3() {
		SenderPage3 sender = new SenderPage3(receiver);
		sender.Send(data.getGearshift());
	}
	
	public void sendNewDataPage4() {
		SenderPage4 sender = new SenderPage4(receiver);
		sender.Send(data.getGearshift());
	}
	
	/*
	 * Send gearshift page
	 */
	public void sendNewDataPage5() {
		SenderPage5 sender = new SenderPage5(receiver);
		sender.Send(data.getGearshift());
	}
	
	public void sendNewDataPage6() {
		SenderPage6 sender = new SenderPage6(receiver);
		sender.Send(data.getGearshift());
	}
	
	public void sendNewDataPage7() {
		SenderPage7 sender = new SenderPage7(receiver);
		sender.Send(data.getGearshift());
	}
}
