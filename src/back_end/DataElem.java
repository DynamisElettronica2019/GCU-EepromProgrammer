package back_end;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

import back_end.parsed.Parsed;
import front_end.View;

public class DataElem extends Observable{
	protected ArrayList<String> elementValues;
	protected ArrayList<String> elementNames;
	protected ArrayList<Boolean> elementIsUpdated;
	protected Map<String, Integer> elementMap = new HashMap<>(); // Map name to element index
	
	public DataElem(ArrayList<View> myViews) {
		elementValues = new ArrayList<String>();
		elementNames = new ArrayList<String>();
		elementIsUpdated = new ArrayList<Boolean>();
	}
	
	public void UpdatePage(Parsed newData) {
		for(String name : newData.getParsedName()) {
			elementValues.set(elementMap.get(name), newData.getParsed().get(newData.getParsedMap().get(name)));
			elementIsUpdated.set(elementMap.get(name), true);
		}
	}

	/*
	 * Notify view
	 */
	public void load() {
		setChanged();
		notifyObservers(true);
	}
}
