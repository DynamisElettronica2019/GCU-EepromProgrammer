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
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE4_INDEX_START - Channels.PAGE1_INDEX_START, Channels.PAGE4_INDEX_END - Channels.PAGE1_INDEX_START);
		StringBuilder strToSend = new StringBuilder();
		strToSend.append(Channels.WRITE_ID);
		strToSend.append(Channels.PAGE_4_ID);
		for(String str : strings) {
			strToSend.append(str);
		}
		receiver.send(strToSend.toString());
	}

}
