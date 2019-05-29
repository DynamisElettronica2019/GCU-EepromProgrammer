package back_end.sender;

import java.util.ArrayList;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage1 extends Sender {

	public SenderPage1(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Get the elements from the backend, concatenate them and send
	 */
	@Override
	public void Send(DataElem element) {
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE1_INDEX_START - Channels.PAGE1_INDEX_START, Channels.PAGE1_INDEX_END - Channels.PAGE1_INDEX_START);
		StringBuilder strToSend = new StringBuilder();
		strToSend.append(Channels.WRITE_ID);
		strToSend.append(Channels.PAGE_1_ID);
		strToSend.append('0'); //CELL READING
		strToSend.append(Channels.DATA_SIZE);
		for(String str : strings) {
			strToSend.append(str);
		}
		receiver.send(strToSend.toString());
	}

}
