package back_end.sender;

import back_end.DataElem;
import back_end.Receiver;
import configuration.Channels;

public class SenderPage0 extends Sender {

	public SenderPage0(Receiver rec) {
		super(rec);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Send(DataElem element) {
		element.GetPageStrings(Channels.PAGE0_INDEX_START, Channels.PAGE0_INDEX_END);
	}

}
