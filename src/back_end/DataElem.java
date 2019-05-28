package back_end;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import front_end.View;

public class DataElem extends Observable{
	protected String[] elementValues;
	protected String[] elementNames;
	protected Boolean[] elementIsUpdated;
	protected Map<String, Integer> elementMap = new HashMap<>();
	
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
