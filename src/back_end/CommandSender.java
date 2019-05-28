package back_end;

import java.util.ArrayList;

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
}
