package front_end;

import java.util.Observable;

import back_end.Acceleration;
import back_end.Antistall;
import back_end.Autocross;

public class AntistallObserver extends MyObserver {

	public AntistallObserver(View myView) {
		super(myView);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		myView.UpdateAntistall((Antistall)o);
	}

}
