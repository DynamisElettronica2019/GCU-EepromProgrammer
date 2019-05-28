package front_end;

import java.util.Observable;

import back_end.Gearshift;

public class GearshiftObserver extends MyObserver {

	public GearshiftObserver(View myView) {
		super(myView);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Observable o, Object arg) {
		myView.UpdateGearshift((Gearshift)o);
	}

}
