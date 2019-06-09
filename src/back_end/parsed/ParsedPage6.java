package back_end.parsed;

import configuration.Channels;

public class ParsedPage6 extends Parsed {

	public ParsedPage6(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.SPEED_LIMIT_2_3_START, Channels.SPEED_LIMIT_2_3_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_2_3_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_2_3_NAME, 0);
		parsed.add(string.substring(Channels.SPEED_LIMIT_3_4_START, Channels.SPEED_LIMIT_3_4_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_3_4_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_3_4_NAME, 1);
		parsed.add(string.substring(Channels.SPEED_LIMIT_4_5_START, Channels.SPEED_LIMIT_4_5_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_4_5_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_4_5_NAME, 2);
		parsed.add(string.substring(Channels.TPS_START_LIMIT_START, Channels.TPS_START_LIMIT_END + 1));
		parsedName.add(Channels.TPS_START_LIMIT_NAME);
		parsedMap.put(Channels.TPS_START_LIMIT_NAME, 3);
		parsed.add(string.substring(Channels.END_GEAR_AC_START, Channels.END_GEAR_AC_END + 1));
		parsedName.add(Channels.END_GEAR_AC_NAME);
		parsedMap.put(Channels.END_GEAR_AC_NAME, 3);
	}

}
