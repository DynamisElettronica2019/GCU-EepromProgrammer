package front_end;

import java.util.Observable;

import back_end.Acceleration;
import back_end.Autocross;

public class AutocrossObserver extends MyObserver {

	public AutocrossObserver(View myView) {
		super(myView);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		myView.UpdateAutocross((Autocross)o);
	}

}
