package back_end.parsed;

import configuration.Channels;

public class ParsedPage8 extends Parsed {

	public ParsedPage8(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.RAMP_START_AU_START, Channels.RAMP_START_AU_END + 1));
		parsedName.add(Channels.RAMP_START_AU_NAME);
		parsedMap.put(Channels.RAMP_START_AU_NAME, 0);
		parsed.add(string.substring(Channels.RAMP_END_AU_START, Channels.RAMP_END_AU_END + 1));
		parsedName.add(Channels.RAMP_END_AU_NAME);
		parsedMap.put(Channels.RAMP_END_AU_NAME, 1);
		parsed.add(string.substring(Channels.RAMP_TIME_AU_START, Channels.RAMP_TIME_AU_END + 1));
		parsedName.add(Channels.RAMP_TIME_AU_NAME);
		parsedMap.put(Channels.RAMP_TIME_AU_NAME, 2);
		parsed.add(string.substring(Channels.RPM_LIMIT_AU_1_2_START, Channels.RPM_LIMIT_AU_1_2_END + 1));
		parsedName.add(Channels.RPM_LIMIT_AU_1_2_NAME);
		parsedMap.put(Channels.RPM_LIMIT_AU_1_2_NAME, 3);
		parsed.add(string.substring(Channels.RPM_LIMIT_AU_2_3_START, Channels.RPM_LIMIT_AU_2_3_END + 1));
		parsedName.add(Channels.RPM_LIMIT_AU_2_3_NAME);
		parsedMap.put(Channels.RPM_LIMIT_AU_2_3_NAME, 4);
		parsed.add(string.substring(Channels.RPM_LIMIT_AU_3_4_START, Channels.RPM_LIMIT_AU_3_4_END + 1));
		parsedName.add(Channels.RPM_LIMIT_AU_3_4_NAME);
		parsedMap.put(Channels.RPM_LIMIT_AU_3_4_NAME, 5);
		parsed.add(string.substring(Channels.RPM_LIMIT_AU_4_5_START, Channels.RPM_LIMIT_AU_4_5_END + 1));
		parsedName.add(Channels.RPM_LIMIT_AU_4_5_NAME);
		parsedMap.put(Channels.RPM_LIMIT_AU_4_5_NAME, 6);
		parsed.add(string.substring(Channels.SPEED_LIMIT_AU_1_2_START, Channels.SPEED_LIMIT_AU_1_2_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_AU_1_2_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_AU_1_2_NAME, 7);
	}

}
