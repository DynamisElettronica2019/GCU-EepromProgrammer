package back_end;

import java.util.ArrayList;

import back_end.sender.SenderPage1;
import configuration.Channels;
import front_end.View;

public class CommandSender {
	private Receiver receiver;
	@SuppressWarnings("unused")
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
	 * Send acceleration page
	 */
	public void sendNewDataPage1() {
		SenderPage1 sender = new SenderPage1(receiver);
		sender.Send(data.getGearshift());
	}
}
