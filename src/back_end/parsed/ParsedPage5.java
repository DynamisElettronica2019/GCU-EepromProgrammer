package back_end.parsed;

import configuration.Channels;

public class ParsedPage5 extends Parsed {

	public ParsedPage5(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.RAMP_START_START, Channels.RAMP_START_END));
		parsedName.add(Channels.RAMP_START_NAME);
		parsedMap.put(Channels.RAMP_START_NAME, 0);
		parsed.add(string.substring(Channels.RAMP_END_START, Channels.RAMP_END_END));
		parsedName.add(Channels.RAMP_END_NAME);
		parsedMap.put(Channels.RAMP_END_NAME, 1);
		parsed.add(string.substring(Channels.RAMP_TIME_START, Channels.RAMP_TIME_END));
		parsedName.add(Channels.RAMP_TIME_NAME);
		parsedMap.put(Channels.RAMP_TIME_NAME, 2);
		parsed.add(string.substring(Channels.RPM_LIMIT_1_2_START, Channels.RPM_LIMIT_1_2_END));
		parsedName.add(Channels.RPM_LIMIT_1_2_NAME);
		parsedMap.put(Channels.RPM_LIMIT_1_2_NAME, 3);
		parsed.add(string.substring(Channels.RPM_LIMIT_2_3_START, Channels.RPM_LIMIT_2_3_END));
		parsedName.add(Channels.RPM_LIMIT_2_3_NAME);
		parsedMap.put(Channels.RPM_LIMIT_2_3_NAME, 4);
		parsed.add(string.substring(Channels.RPM_LIMIT_3_4_START, Channels.RPM_LIMIT_3_4_END));
		parsedName.add(Channels.RPM_LIMIT_3_4_NAME);
		parsedMap.put(Channels.RPM_LIMIT_3_4_NAME, 5);
		parsed.add(string.substring(Channels.RPM_LIMIT_4_5_START, Channels.RPM_LIMIT_4_5_END));
		parsedName.add(Channels.RPM_LIMIT_4_5_NAME);
		parsedMap.put(Channels.RPM_LIMIT_4_5_NAME, 6);
		parsed.add(string.substring(Channels.SPEED_LIMIT_1_2_START, Channels.SPEED_LIMIT_1_2_END));
		parsedName.add(Channels.SPEED_LIMIT_1_2_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_1_2_NAME, 7);
	}

}
