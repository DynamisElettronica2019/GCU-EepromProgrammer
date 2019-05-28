package configuration;

import java.util.ArrayList;

public class Channels {
	private static ArrayList<String> channelNames = new ArrayList<String>();
	
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
	
	/*
	 * Page 7 channel names
	 */
	
	/*
	 * Page indexes
	 */
	public static final int PAGE0_SIZE = 4;
	public static final int PAGE1_SIZE = 8;
	public static final int PAGE2_SIZE = 8;
	public static final int PAGE3_SIZE = 7;
	public static final int PAGE4_SIZE = 0;
	public static final int PAGE5_SIZE = 8;
	public static final int PAGE6_SIZE = 4;
	public static final int PAGE7_SIZE = 0;
	
	public static final int PAGE0_INDEX_START = 0;
	public static final int PAGE0_INDEX_END = PAGE0_INDEX_START + PAGE0_SIZE;
	public static final int PAGE1_INDEX_START = PAGE0_INDEX_END + 1;
	public static final int PAGE1_INDEX_END = PAGE1_INDEX_START + PAGE1_SIZE;
	public static final int PAGE2_INDEX_START = PAGE1_INDEX_END + 1;
	public static final int PAGE2_INDEX_END = PAGE2_INDEX_START + PAGE2_SIZE;
	public static final int PAGE3_INDEX_START = PAGE2_INDEX_END + 1;
	public static final int PAGE3_INDEX_END = PAGE3_INDEX_START + PAGE3_SIZE;
	public static final int PAGE4_INDEX_START = PAGE3_INDEX_END + 1;
	public static final int PAGE4_INDEX_END = PAGE4_INDEX_START + PAGE4_SIZE;
	public static final int PAGE5_INDEX_START = PAGE4_INDEX_END + 1;
	public static final int PAGE5_INDEX_END = PAGE5_INDEX_START + PAGE5_SIZE;
	public static final int PAGE6_INDEX_START = PAGE5_INDEX_END + 1;
	public static final int PAGE6_INDEX_END = PAGE6_INDEX_START + PAGE6_SIZE;
	public static final int PAGE7_INDEX_START = PAGE6_INDEX_END + 1;
	public static final int PAGE7_INDEX_END = PAGE7_INDEX_START + PAGE7_SIZE;
	
	
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
	}

	public static ArrayList<String> getChannelNames() {
		return channelNames;
	}

	public static void setChannelNames(ArrayList<String> channelNames) {
		Channels.channelNames = channelNames;
	}
	
	
}
