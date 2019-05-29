package back_end.sender;

import java.util.ArrayList;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage2 extends Sender {

	public SenderPage2(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(DataElem element) {
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE2_INDEX_START - Channels.PAGE1_INDEX_START, Channels.PAGE2_INDEX_END - Channels.PAGE1_INDEX_START);
		String strToSend = new String();
		for(String str : strings) {
			strToSend.concat(str);
		}
		receiver.send(strToSend);
	}

}
