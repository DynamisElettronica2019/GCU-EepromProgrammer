package back_end;

import java.util.ArrayList;

import configuration.Channels;
import front_end.View;

public class Gearshift extends DataElem {
	
	public Gearshift(ArrayList<View> myViews) {
		super(myViews);
		elementSize = Channels.GEARSHIFT_SIZE;
		
		/*
		 * Element names init
		 */
		for(int i = Channels.PAGE1_INDEX_START; i < Channels.PAGE4_INDEX_END; i++) {
			elementNames.add(Channels.getChannelNames().get(i));
			elementValues.add("No value");
			elementIsUpdated.add(false);
			elementMap.put(Channels.getChannelNames().get(i), elementNames.size()-1); //First element is 0
		}
	}

}
