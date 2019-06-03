package back_end.sender;

import java.util.ArrayList;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage7 extends Sender {

	public SenderPage7(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(DataElem element) {
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE7_INDEX_START - Channels.PAGE5_INDEX_START, Channels.PAGE7_INDEX_END - Channels.PAGE5_INDEX_START + 1);
		StringBuilder strToSend = new StringBuilder();
		strToSend.append(Channels.WRITE_ID);
		strToSend.append(Channels.PAGE_7_ID);
		strToSend.append((char) 0); //CELL READING
		strToSend.append((char) Channels.DATA_SIZE);
		for(String str : strings) {
			strToSend.append(str);
		}
		while(strToSend.toString().length() < Channels.STRING_SIZE) {
			strToSend.append((char) 0);
		}
		receiver.send(strToSend.toString());
	}

}
