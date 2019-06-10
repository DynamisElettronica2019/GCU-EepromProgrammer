package back_end;

import java.util.ArrayList;

import configuration.Channels;
import front_end.View;

public class Antistall extends DataElem {
	
	public Antistall(ArrayList<View> myViews) {
		super(myViews);
		elementSize = Channels.ANTISTALL_SIZE;
		for(View v: myViews) this.addObserver(v.getAntiObs());
		
		/*
		 * Element names init
		 */
		for(int i = Channels.PAGE11_INDEX_START; i < Channels.PAGE11_INDEX_END + 1; i++) {
			elementNames.add(Channels.getChannelNames().get(i));
			elementValues.add("No value");
			elementIsUpdated.add(false);
			elementMap.put(Channels.getChannelNames().get(i), elementNames.size()-1); //First element is 0
		}
	}
}
