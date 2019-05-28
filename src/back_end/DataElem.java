package back_end;

import java.util.ArrayList;
import java.util.Observable;

import front_end.View;

public class DataElem extends Observable{
	public DataElem(ArrayList<View> myViews) {
		//TODO
	}

	/*
	 * Notify view
	 */
	public void load() {
		setChanged();
		notifyObservers(true);
	}
}
