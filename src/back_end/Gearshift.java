package back_end;

import java.util.ArrayList;

import front_end.View;

public class Gearshift extends DataElem {
	private final int ACC_ELEMENT_SIZE = 10;

	public Gearshift(ArrayList<View> myViews) {
		super(myViews);
		elementValues = new String[ACC_ELEMENT_SIZE];
		elementNames = new String[ACC_ELEMENT_SIZE];
		elementIsUpdated = new Boolean[ACC_ELEMENT_SIZE];
	}

}
