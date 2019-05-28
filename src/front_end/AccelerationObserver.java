package front_end;

import java.util.Observable;

import back_end.Acceleration;

public class AccelerationObserver extends MyObserver {

	public AccelerationObserver(View myView) {
		super(myView);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		myView.UpdateAcceleration((Acceleration)o);
	}

}
