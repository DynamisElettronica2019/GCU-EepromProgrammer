package configuration;

import java.util.ArrayList;

public class Channels {
	private static ArrayList<String> channelNames = new ArrayList<String>();
	/*
	 * Message types
	 */
	public static final char READ_ID = 'R';
	public static final char WRITE_ID = 'W';
	public static final char LOAD_ID = 'L';
	public static final char ERROR_ID = 'E';
	
	/*
	 * Page types
	 */
	public static final char PAGE_0_ID = 0;
	public static final char PAGE_1_ID = 1;
	public static final char PAGE_2_ID = 2;
	public static final char PAGE_3_ID = 3;
	public static final char PAGE_4_ID = 4;
	public static final char PAGE_5_ID = 5;
	public static final char PAGE_6_ID = 6;
	public static final char PAGE_7_ID = 7;
	public static final char PAGE_8_ID = 8;
	public static final char PAGE_9_ID = 9;
	public static final char PAGE_10_ID = 10;
	public static final char PAGE_11_ID = 11;
	
	/*
	 * Send costants
	 */
	public static final byte STRING_SIZE = 20;
	public static final byte DATA_SIZE = 16;
	public static final int HEADER_ID_START = 0;
	public static final int HEADER_ID_END = 3;
	
	/*
	 * Page 0 channel names
	 */
	public static final String EEPROM_STATE_NAME = "EEPROM_STATE";
	public static final String EEPROM_LAST_COM_NAME = "EEPROM_LAST_COM";
	public static final String EEPROM_READ_COUNTER_NAME = "EEPROM_READ_COUNTER";
	public static final String EEPROM_WRITE_COUNTER_NAME = "EEPROM_WRITE_COUNTER";
	
	/*
	 * Page 1 channel names
	 */
	public static final String NT_PUSH_1_N_NAME = "NT_PUSH_1_N";
	public static final String NT_CLUTCH_1_N_NAME = "NT_CLUTCH_1_N";
	public static final String NT_REBOUND_1_N_NAME = "NT_REBOUND_1_N";
	public static final String NT_BRAKE_1_N_NAME = "NT_BRAKE_1_N";
	public static final String NT_PUSH_2_N_NAME = "NT_PUSH_2_N";
	public static final String NT_CLUTCH_2_N_NAME = "NT_CLUTCH_2_N";
	public static final String NT_REBOUND_2_N_NAME = "NT_REBOUND_2_N";
	public static final String NT_BRAKE_2_N_NAME = "NT_BRAKE_2_N";
	
	/*
	 * Page 2 channel names
	 */
	public static final String DN_PUSH_NAME = "DN_PUSH";
	public static final String CLUTCH_NAME = "CLUTCH";
	public static final String DN_REBOUND_NAME = "DN_REBOUND";
	public static final String DN_BRAKE_NAME = "DN_BRAKE";
	public static final String UP_PUSH_1_2_NAME = "UP_PUSH_1_2";
	public static final String UP_PUSH_2_3_NAME = "UP_PUSH_2_3";
	public static final String UP_PUSH_3_4_NAME = "UP_PUSH_3_4";
	public static final String UP_PUSH_4_5_NAME = "UP_PUSH_4_5";
	
	/*
	 * Page 3 channel names
	 */
	public static final String DELAY_NAME = "DELAY";
	public static final String UP_REBOUND_NAME = "UP_REBOUND";
	public static final String UP_BRAKE_NAME = "UP_BRAKE";
	public static final String NT_CLUTCH_DELAY_NAME = "NT_CLUTCH_DELAY";
	public static final String DOWN_TIME_CHECK_NAME = "DOWN_TIME_CHECK";
	public static final String UP_TIME_CHECK_NAME = "UP_TIME_CHECK";
	public static final String MAX_TRIES_NAME = "MAX_TRIES";
	
	/*
	 * Page 4 channel names
	 */
	
	/*
	 * Page 5 channel names
	 */
	public static final String RAMP_START_NAME = "RAMP_START";
	public static final String RAMP_END_NAME = "RAMP_END";
	public static final String RAMP_TIME_NAME = "RAMP_TIME";
	public static final String RPM_LIMIT_1_2_NAME = "RPM_LIMIT_1_2";
	public static final String RPM_LIMIT_2_3_NAME = "RPM_LIMIT_2_3";
	public static final String RPM_LIMIT_3_4_NAME = "RPM_LIMIT_3_4";
	public static final String RPM_LIMIT_4_5_NAME = "RPM_LIMIT_4_5";
	public static final String SPEED_LIMIT_1_2_NAME = "SPEED_LIMIT_1_2";
	
	/*
	 * Page 6 channel names
	 */
	public static final String SPEED_LIMIT_2_3_NAME = "SPEED_LIMIT_2_3";
	public static final String SPEED_LIMIT_3_4_NAME = "SPEED_LIMIT_3_4";
	public static final String SPEED_LIMIT_4_5_NAME = "SPEED_LIMIT_4_5";
	public static final String TPS_START_LIMIT_NAME = "TPS_START_LIMIT";
	public static final String END_GEAR_AC_NAME = "END_GEAR_AC";
	
	/*
	 * Page 7 channel names
	 */
	
	/*
	 * Page 8 channel names
	 */
	public static final String RAMP_START_AU_NAME = "RAMP_START_AU";
	public static final String RAMP_END_AU_NAME = "RAMP_END_AU";
	public static final String RAMP_TIME_AU_NAME = "RAMP_TIME_AU";
	public static final String RPM_LIMIT_AU_1_2_NAME = "RPM_LIMIT_AU_1_2";
	public static final String RPM_LIMIT_AU_2_3_NAME = "RPM_LIMIT_AU_2_3";
	public static final String RPM_LIMIT_AU_3_4_NAME = "RPM_LIMIT_AU_3_4";
	public static final String RPM_LIMIT_AU_4_5_NAME = "RPM_LIMIT_AU_4_5";
	public static final String SPEED_LIMIT_AU_1_2_NAME = "SPEED_LIMIT_AU_1_2";
	
	/*
	 * Page 9 channel names
	 */
	public static final String SPEED_LIMIT_AU_2_3_NAME = "SPEED_LIMIT_AU_2_3";
	public static final String SPEED_LIMIT_AU_3_4_NAME = "SPEED_LIMIT_AU_3_4";
	public static final String SPEED_LIMIT_AU_4_5_NAME = "SPEED_LIMIT_AU_4_5";
	public static final String TPS_START_AU_LIMIT_NAME = "TPS_START_LIMIT_AU";
	public static final String END_GEAR_AU_NAME = "END_GEAR_AU";
	
	/*
	 * Page 10 channel names
	 */
	
	/*
	 * Page 11 channel names
	 */
	public static final String RPM_TRESHOLD_NAME = "RPM_TRESHOLD";
	public static final String DELTA_RPM_TRESHOLD_NAME = "DELTA_RPM_TRESHOLD";
	public static final String GEAR_TRESHOLD_NAME = "GEAR_TRESHOLD";
	
	/*
	 * Page indexes
	 */
	public static final int PAGE0_SIZE = 4;
	public static final int PAGE1_SIZE = 8;
	public static final int PAGE2_SIZE = 8;
	public static final int PAGE3_SIZE = 7;
	public static final int PAGE4_SIZE = 0;
	public static final int PAGE5_SIZE = 8;
	public static final int PAGE6_SIZE = 5;
	public static final int PAGE7_SIZE = 0;
	public static final int PAGE8_SIZE = 8;
	public static final int PAGE9_SIZE = 5;
	public static final int PAGE10_SIZE = 0;
	public static final int PAGE11_SIZE = 3;
	
	public static final int PAGE0_INDEX_START = 0;
	public static final int PAGE0_INDEX_END = PAGE0_INDEX_START + PAGE0_SIZE - 1;
	public static final int PAGE1_INDEX_START = PAGE0_INDEX_END + 1;
	public static final int PAGE1_INDEX_END = PAGE1_INDEX_START + PAGE1_SIZE - 1;
	public static final int PAGE2_INDEX_START = PAGE1_INDEX_END + 1;
	public static final int PAGE2_INDEX_END = PAGE2_INDEX_START + PAGE2_SIZE - 1;
	public static final int PAGE3_INDEX_START = PAGE2_INDEX_END + 1;
	public static final int PAGE3_INDEX_END = PAGE3_INDEX_START + PAGE3_SIZE - 1;
	public static final int PAGE4_INDEX_START = PAGE3_INDEX_END + 1;
	public static final int PAGE4_INDEX_END = PAGE4_INDEX_START + PAGE4_SIZE - 1;
	public static final int PAGE5_INDEX_START = PAGE4_INDEX_END + 1;
	public static final int PAGE5_INDEX_END = PAGE5_INDEX_START + PAGE5_SIZE - 1;
	public static final int PAGE6_INDEX_START = PAGE5_INDEX_END + 1;
	public static final int PAGE6_INDEX_END = PAGE6_INDEX_START + PAGE6_SIZE - 1;
	public static final int PAGE7_INDEX_START = PAGE6_INDEX_END + 1;
	public static final int PAGE7_INDEX_END = PAGE7_INDEX_START + PAGE7_SIZE - 1;
	public static final int PAGE8_INDEX_START = PAGE7_INDEX_END + 1;
	public static final int PAGE8_INDEX_END = PAGE8_INDEX_START + PAGE8_SIZE - 1;
	public static final int PAGE9_INDEX_START = PAGE8_INDEX_END + 1;
	public static final int PAGE9_INDEX_END = PAGE9_INDEX_START + PAGE9_SIZE - 1;
	public static final int PAGE10_INDEX_START = PAGE9_INDEX_END + 1;
	public static final int PAGE10_INDEX_END = PAGE10_INDEX_START + PAGE10_SIZE - 1;
	public static final int PAGE11_INDEX_START = PAGE10_INDEX_END + 1;
	public static final int PAGE11_INDEX_END = PAGE11_INDEX_START + PAGE11_SIZE - 1;
	
	/*
	 * Type sizes
	 */
	
	public static final int DEBUG_SIZE = PAGE0_SIZE;
	public static final int GEARSHIFT_SIZE = PAGE1_SIZE + PAGE2_SIZE + PAGE3_SIZE + PAGE4_SIZE;
	public static final int ACCELERATION_SIZE = PAGE5_SIZE + PAGE6_SIZE + PAGE7_SIZE;
	public static final int AUTOCROSS_SIZE = PAGE8_SIZE + PAGE9_SIZE + PAGE10_SIZE;
	public static final int ANTISTALL_SIZE = PAGE11_SIZE;
	
	/*
	 * Page 0 indexes
	 */
	public static final int EEPROM_STATE_START = 0;
	public static final int EEPROM_STATE_END = 1;
	public static final int EEPROM_LAST_COM_START = 2;
	public static final int EEPROM_LAST_COM_END = 3;
	public static final int EEPROM_READ_COUNTER_START = 4;
	public static final int EEPROM_READ_COUNTER_END = 5;
	public static final int EEPROM_WRITE_COUNTER_START = 7;
	public static final int EEPROM_WRITE_COUNTER_END = 8;
	
	/*
	 * Page 1 indexes
	 */
	public static final int NT_PUSH_1_N_START = 0;
	public static final int NT_PUSH_1_N_END = 1;
	public static final int NT_CLUTCH_1_N_START = 2;
	public static final int NT_CLUTCH_1_N_END = 3;
	public static final int NT_REBOUND_1_N_START = 4;
	public static final int NT_REBOUND_1_N_END = 5;
	public static final int NT_BRAKE_1_N_START = 6;
	public static final int NT_BRAKE_1_N_END = 7;
	public static final int NT_PUSH_2_N_START = 8;
	public static final int NT_PUSH_2_N_END = 9;
	public static final int NT_CLUTCH_2_N_START = 10;
	public static final int NT_CLUTCH_2_N_END = 11;
	public static final int NT_REBOUND_2_N_START = 12;
	public static final int NT_REBOUND_2_N_END = 13;
	public static final int NT_BRAKE_2_N_START = 14;
	public static final int NT_BRAKE_2_N_END = 15;
	
	/*
	 * Page 2 indexes
	 */
	public static final int DN_PUSH_START = 0;
	public static final int DN_PUSH_END = 1;
	public static final int CLUTCH_START = 2;
	public static final int CLUTCH_END = 3;
	public static final int DN_REBOUND_START = 4;
	public static final int DN_REBOUND_END = 5;
	public static final int DN_BRAKE_START = 6;
	public static final int DN_BRAKE_END = 7;
	public static final int UP_PUSH_1_2_START = 8;
	public static final int UP_PUSH_1_2_END = 9;
	public static final int UP_PUSH_2_3_START = 10;
	public static final int UP_PUSH_2_3_END = 11;
	public static final int UP_PUSH_3_4_START = 12;
	public static final int UP_PUSH_3_4_END = 13;
	public static final int UP_PUSH_4_5_START = 14;
	public static final int UP_PUSH_4_5_END = 15;
	
	/*
	 * Page 3 indexes
	 */
	public static final int DELAY_START = 0;
	public static final int DELAY_END = 1;
	public static final int UP_REBOUND_START = 2;
	public static final int UP_REBOUND_END = 3;
	public static final int UP_BRAKE_START = 4;
	public static final int UP_BRAKE_END = 5;
	public static final int NT_CLUTCH_DELAY_START = 6;
	public static final int NT_CLUTCH_DELAY_END = 7;
	public static final int DOWN_TIME_CHECK_START = 8;
	public static final int DOWN_TIME_CHECK_END = 9;
	public static final int UP_TIME_CHECK_START = 10;
	public static final int UP_TIME_CHECK_END = 11;
	public static final int MAX_TRIES_START = 12;
	public static final int MAX_TRIES_END = 13;
	
	/*
	 * Page 4 indexes
	 */
	
	/*
	 * Page 5 indexes
	 */
	public static final int RAMP_START_START = 0;
	public static final int RAMP_START_END = 1;
	public static final int RAMP_END_START = 2;
	public static final int RAMP_END_END = 3;
	public static final int RAMP_TIME_START = 4;
	public static final int RAMP_TIME_END = 5;
	public static final int RPM_LIMIT_1_2_START = 6;
	public static final int RPM_LIMIT_1_2_END = 7;
	public static final int RPM_LIMIT_2_3_START = 8;
	public static final int RPM_LIMIT_2_3_END = 9;
	public static final int RPM_LIMIT_3_4_START = 10;
	public static final int RPM_LIMIT_3_4_END = 11;
	public static final int RPM_LIMIT_4_5_START = 12;
	public static final int RPM_LIMIT_4_5_END = 13;
	public static final int SPEED_LIMIT_1_2_START = 14;
	public static final int SPEED_LIMIT_1_2_END = 15;
	
	/*
	 * Page 6 indexes
	 */
	public static final int SPEED_LIMIT_2_3_START = 0;
	public static final int SPEED_LIMIT_2_3_END = 1;
	public static final int SPEED_LIMIT_3_4_START = 2;
	public static final int SPEED_LIMIT_3_4_END = 3;
	public static final int SPEED_LIMIT_4_5_START = 4;
	public static final int SPEED_LIMIT_4_5_END = 5;
	public static final int TPS_START_LIMIT_START = 6;
	public static final int TPS_START_LIMIT_END = 7;
	public static final int END_GEAR_AC_START = 8;
	public static final int END_GEAR_AC_END = 9;
	
	/*
	 * Page 7 indexes
	 */
	
	/*
	 * Page 8 indexes
	 */
	public static final int RAMP_START_AU_START = 0;
	public static final int RAMP_START_AU_END = 1;
	public static final int RAMP_END_AU_START = 2;
	public static final int RAMP_END_AU_END = 3;
	public static final int RAMP_TIME_AU_START = 4;
	public static final int RAMP_TIME_AU_END = 5;
	public static final int RPM_LIMIT_AU_1_2_START = 6;
	public static final int RPM_LIMIT_AU_1_2_END = 7;
	public static final int RPM_LIMIT_AU_2_3_START = 8;
	public static final int RPM_LIMIT_AU_2_3_END = 9;
	public static final int RPM_LIMIT_AU_3_4_START = 10;
	public static final int RPM_LIMIT_AU_3_4_END = 11;
	public static final int RPM_LIMIT_AU_4_5_START = 12;
	public static final int RPM_LIMIT_AU_4_5_END = 13;
	public static final int SPEED_LIMIT_AU_1_2_START = 14;
	public static final int SPEED_LIMIT_AU_1_2_END = 15;
	
	/*
	 * Page 9 indexes
	 */
	public static final int SPEED_LIMIT_AU_2_3_START = 0;
	public static final int SPEED_LIMIT_AU_2_3_END = 1;
	public static final int SPEED_LIMIT_AU_3_4_START = 2;
	public static final int SPEED_LIMIT_AU_3_4_END = 3;
	public static final int SPEED_LIMIT_AU_4_5_START = 4;
	public static final int SPEED_LIMIT_AU_4_5_END = 5;
	public static final int TPS_START_LIMIT_AU_START = 6;
	public static final int TPS_START_LIMIT_AU_END = 7;
	public static final int END_GEAR_AU_START = 8;
	public static final int END_GEAR_AU_END = 9;
	
	/*
	 * Page 10 indexes
	 */
	
	/*
	 * Page 11 indexes
	 */
	public static final int RPM_TRESHOLD_START = 0;
	public static final int RPM_TRESHOLD_END = 1;
	public static final int DELTA_RPM_TRESHOLD_START = 2;
	public static final int DELTA_RPM_TRESHOLD_END = 3;
	public static final int GEAR_TRESHOLD_START = 4;
	public static final int GEAR_TRESHOLD_END = 5;
	
	
	public Channels() {
		/*
		 * Adding all names to channelnames
		 */
		channelNames.add(EEPROM_STATE_NAME);
		channelNames.add(EEPROM_LAST_COM_NAME);
		channelNames.add(EEPROM_READ_COUNTER_NAME);
		channelNames.add(EEPROM_WRITE_COUNTER_NAME);
		
		channelNames.add(NT_PUSH_1_N_NAME);
		channelNames.add(NT_CLUTCH_1_N_NAME);
		channelNames.add(NT_REBOUND_1_N_NAME);
		channelNames.add(NT_BRAKE_1_N_NAME);
		channelNames.add(NT_PUSH_2_N_NAME);
		channelNames.add(NT_CLUTCH_2_N_NAME);
		channelNames.add(NT_REBOUND_2_N_NAME);
		channelNames.add(NT_BRAKE_2_N_NAME);
		
		channelNames.add(DN_PUSH_NAME);
		channelNames.add(CLUTCH_NAME);
		channelNames.add(DN_REBOUND_NAME);
		channelNames.add(DN_BRAKE_NAME);
		channelNames.add(UP_PUSH_1_2_NAME);
		channelNames.add(UP_PUSH_2_3_NAME);
		channelNames.add(UP_PUSH_3_4_NAME);
		channelNames.add(UP_PUSH_4_5_NAME);
		
		channelNames.add(DELAY_NAME);
		channelNames.add(UP_REBOUND_NAME);
		channelNames.add(UP_BRAKE_NAME);
		channelNames.add(NT_CLUTCH_DELAY_NAME);
		channelNames.add(DOWN_TIME_CHECK_NAME);
		channelNames.add(UP_TIME_CHECK_NAME);
		channelNames.add(MAX_TRIES_NAME);
		
		channelNames.add(RAMP_START_NAME);
		channelNames.add(RAMP_END_NAME);
		channelNames.add(RAMP_TIME_NAME);
		channelNames.add(RPM_LIMIT_1_2_NAME);
		channelNames.add(RPM_LIMIT_2_3_NAME);
		channelNames.add(RPM_LIMIT_3_4_NAME);
		channelNames.add(RPM_LIMIT_4_5_NAME);
		channelNames.add(SPEED_LIMIT_1_2_NAME);
		
		channelNames.add(SPEED_LIMIT_2_3_NAME);
		channelNames.add(SPEED_LIMIT_3_4_NAME);
		channelNames.add(SPEED_LIMIT_4_5_NAME);
		channelNames.add(TPS_START_LIMIT_NAME);
		channelNames.add(END_GEAR_AC_NAME);
		
		channelNames.add(RAMP_START_AU_NAME);
		channelNames.add(RAMP_END_AU_NAME);
		channelNames.add(RAMP_TIME_AU_NAME);
		channelNames.add(RPM_LIMIT_AU_1_2_NAME);
		channelNames.add(RPM_LIMIT_AU_2_3_NAME);
		channelNames.add(RPM_LIMIT_AU_3_4_NAME);
		channelNames.add(RPM_LIMIT_AU_4_5_NAME);
		channelNames.add(SPEED_LIMIT_AU_1_2_NAME);
		
		channelNames.add(SPEED_LIMIT_AU_2_3_NAME);
		channelNames.add(SPEED_LIMIT_AU_3_4_NAME);
		channelNames.add(SPEED_LIMIT_AU_4_5_NAME);
		channelNames.add(TPS_START_AU_LIMIT_NAME);
		channelNames.add(END_GEAR_AU_NAME);
		
		channelNames.add(RPM_TRESHOLD_NAME);
		channelNames.add(DELTA_RPM_TRESHOLD_NAME);
		channelNames.add(GEAR_TRESHOLD_NAME);
	}

	public static ArrayList<String> getChannelNames() {
		return channelNames;
	}

	public static void setChannelNames(ArrayList<String> channelNames) {
		Channels.channelNames = channelNames;
	}
	
	
}
