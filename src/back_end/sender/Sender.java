package back_end.sender;

import back_end.DataElem;
import back_end.Receiver;

public abstract class Sender {
	protected Receiver receiver;
	
	public Sender(Receiver rec) {
		this.receiver = rec;
	}
	
	public abstract void Send(DataElem element, Integer page);
}
