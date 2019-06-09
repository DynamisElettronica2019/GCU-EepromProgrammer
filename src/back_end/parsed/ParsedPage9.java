package back_end.parsed;

import configuration.Channels;

public class ParsedPage9 extends Parsed {

	public ParsedPage9(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.SPEED_LIMIT_AU_2_3_START, Channels.SPEED_LIMIT_AU_2_3_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_AU_2_3_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_AU_2_3_NAME, 0);
		parsed.add(string.substring(Channels.SPEED_LIMIT_AU_3_4_START, Channels.SPEED_LIMIT_AU_3_4_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_AU_3_4_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_AU_3_4_NAME, 1);
		parsed.add(string.substring(Channels.SPEED_LIMIT_AU_4_5_START, Channels.SPEED_LIMIT_AU_4_5_END + 1));
		parsedName.add(Channels.SPEED_LIMIT_AU_4_5_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_AU_4_5_NAME, 2);
		parsed.add(string.substring(Channels.TPS_START_LIMIT_AU_START, Channels.TPS_START_LIMIT_AU_END + 1));
		parsedName.add(Channels.TPS_START_AU_LIMIT_NAME);
		parsedMap.put(Channels.TPS_START_AU_LIMIT_NAME, 3);
		parsed.add(string.substring(Channels.END_GEAR_AU_START, Channels.END_GEAR_AU_END + 1));
		parsedName.add(Channels.END_GEAR_AU_NAME);
		parsedMap.put(Channels.END_GEAR_AU_NAME, 3);
	}

}
