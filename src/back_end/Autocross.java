package back_end;

import java.util.ArrayList;

import configuration.Channels;
import front_end.View;

public class Autocross extends DataElem {
	
	public Autocross(ArrayList<View> myViews) {
		super(myViews);
		elementSize = Channels.AUTOCROSS_SIZE;
		for(View v: myViews) this.addObserver(v.getAccObs());
		
		/*
		 * Element names init
		 */
		for(int i = Channels.PAGE8_INDEX_START; i < Channels.PAGE10_INDEX_END + 1; i++) {
			elementNames.add(Channels.getChannelNames().get(i));
			elementValues.add("No value");
			elementIsUpdated.add(false);
			elementMap.put(Channels.getChannelNames().get(i), elementNames.size()-1); //First element is 0
		}
	}
}
