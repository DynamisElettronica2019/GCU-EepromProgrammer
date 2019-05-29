package front_end;

import java.util.Observable;

import back_end.Debug;

public class DebugObserver extends MyObserver {

	public DebugObserver(View myView) {
		super(myView);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable o, Object arg) {
		myView.UpdateDebug((Debug)o);
	}

}
