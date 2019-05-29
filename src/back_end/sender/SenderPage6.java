package back_end.sender;

import java.util.ArrayList;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage6 extends Sender {

	public SenderPage6(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(DataElem element) {
		ArrayList<String> strings = element.GetPageStrings(Channels.PAGE6_INDEX_START - Channels.PAGE5_INDEX_START, Channels.PAGE6_INDEX_END - Channels.PAGE5_INDEX_START);
		String strToSend = new String();
		for(String str : strings) {
			strToSend.concat(str);
		}
		receiver.send(strToSend);
	}

}
