package back_end.sender;

import java.util.ArrayList;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage4 extends Sender {

	public SenderPage4(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(DataElem element) {
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE4_INDEX_START - Channels.PAGE1_INDEX_START, Channels.PAGE4_INDEX_END - Channels.PAGE1_INDEX_START + 1);
		StringBuilder strToSend = new StringBuilder();
		strToSend.append(Channels.WRITE_ID);
		strToSend.append(Channels.PAGE_4_ID);
		strToSend.append('0'); //CELL READING
		strToSend.append((char) Channels.DATA_SIZE);
		for(String str : strings) {
			strToSend.append(str);
		}
		while(strToSend.toString().length() < Channels.STRING_SIZE) {
			strToSend.append('0');
		}
		receiver.send(strToSend.toString());
	}

}
