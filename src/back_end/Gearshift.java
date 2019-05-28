package back_end;

import java.util.ArrayList;

import front_end.View;

public class Gearshift extends DataElem {
	private final int GEAR_ELEMENT_SIZE = 10;
	
	private final String EEPROM_STATE_NAME = "EEPROM_STATE";
	private final String EEPROM_LAST_COM_NAME = "EEPROM_LAST_COM";
	private final String EEPROM_READ_COUNTER_NAME = "EEPROM_READ_COUNTER";
	private final String EEPROM_WRITE_COUNTER_NAME = "EEPROM_WRITE_COUNTER";
	private final String NT_PUSH_1_N_NAME = "NT_PUSH_1_N";
	private final String NT_CLUTCH_1_N_NAME = "NT_CLUTCH_1_N";
	private final String NT_REBOUND_1_N_NAME = "NT_REBOUND_1_N";
	private final String NT_BRAKE_1_N_NAME = "NT_BRAKE_1_N";
	private final String NT_PUSH_2_N_NAME = "NT_PUSH_2_N";
	private final String NT_CLUTCH_2_N_NAME = "NT_CLUTCH_2_N";
	private final String NT_REBOUND_2_N_NAME = "NT_REBOUND_2_N";
	private final String NT_BRAKE_2_N_NAME = "NT_BRAKE_2_N";

	public Gearshift(ArrayList<View> myViews) {
		super(myViews);
		elementValues = new String[GEAR_ELEMENT_SIZE];
		elementNames = new String[GEAR_ELEMENT_SIZE];
		elementIsUpdated = new Boolean[GEAR_ELEMENT_SIZE];
		
		/*
		 * Element names init
		 */
		elementNames[0] = EEPROM_STATE_NAME;
		elementNames[1] = EEPROM_LAST_COM_NAME;
		elementNames[2] = EEPROM_READ_COUNTER_NAME;
		elementNames[3] = EEPROM_WRITE_COUNTER_NAME;
		elementNames[4] = NT_PUSH_1_N_NAME;
		elementNames[5] = NT_CLUTCH_1_N_NAME;
		elementNames[6] = NT_REBOUND_1_N_NAME;
		elementNames[7] = NT_BRAKE_1_N_NAME;
		elementNames[8] = NT_PUSH_2_N_NAME;
		elementNames[9] = NT_CLUTCH_2_N_NAME;
		elementNames[10] = NT_REBOUND_2_N_NAME;
		elementNames[11] = NT_BRAKE_2_N_NAME;
	}

}
