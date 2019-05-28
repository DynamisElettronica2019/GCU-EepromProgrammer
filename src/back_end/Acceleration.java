package back_end;

import java.util.ArrayList;
import front_end.View;

public class Acceleration extends DataElem {
	private final int ACC_ELEMENT_SIZE = 12;
	
	private final String EEPROM_STATE_NAME = "EEPROM_STATE";
	private final String EEPROM_LAST_COM_NAME = "EEPROM_LAST_COM";
	private final String EEPROM_READ_COUNTER_NAME = "EEPROM_READ_COUNTER";
	private final String EEPROM_WRITE_COUNTER_NAME = "EEPROM_WRITE_COUNTER";

	public Acceleration(ArrayList<View> myViews) {
		super(myViews);
		elementValues = new String[ACC_ELEMENT_SIZE];
		elementNames = new String[ACC_ELEMENT_SIZE];
		elementIsUpdated = new Boolean[ACC_ELEMENT_SIZE];
		
		/*
		 * Element names init
		 */
		elementNames[0] = EEPROM_STATE_NAME;
		elementNames[1] = EEPROM_LAST_COM_NAME;
		elementNames[2] = EEPROM_READ_COUNTER_NAME;
		elementNames[3] = EEPROM_WRITE_COUNTER_NAME;
	}
}
