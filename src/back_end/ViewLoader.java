package back_end;

public class ViewLoader {
	private Data data;

	public ViewLoader(Data data) {
		this.data=data;
	}
	
	/*
	 * Call notify method for all channel(and thresholdChannel),state,debug,command,laptimer
	 */
	public void load(){
		data.getAcceleration().load();
		data.getGearshift().load();
		data.getAutocross().load();
		data.getAntistall().load();
	}
}
