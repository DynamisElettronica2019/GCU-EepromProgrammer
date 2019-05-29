package back_end;

import java.util.ArrayList;

import configuration.Channels;
import front_end.View;

public class Debug extends DataElem {

	public Debug(ArrayList<View> myViews) {
		super(myViews);
		elementSize = Channels.DEBUG_SIZE;
		
		/*
		 * Element names init
		 */
		for(int i = Channels.PAGE0_INDEX_START; i < Channels.PAGE0_INDEX_END; i++) {
			elementNames.add(Channels.getChannelNames().get(i));
			elementValues.add("No value");
			elementIsUpdated.add(false);
			elementMap.put(Channels.getChannelNames().get(i), elementNames.size()-1); //First element is 0
		}
	}

}