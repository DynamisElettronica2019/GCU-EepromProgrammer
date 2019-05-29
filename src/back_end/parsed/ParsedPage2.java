package back_end.parsed;

import configuration.Channels;

public class ParsedPage2 extends Parsed {

	public ParsedPage2(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.DN_PUSH_START, Channels.DN_PUSH_END + 1));
		parsedName.add(Channels.DN_PUSH_NAME);
		parsedMap.put(Channels.DN_PUSH_NAME, 0);
		parsed.add(string.substring(Channels.CLUTCH_START, Channels.CLUTCH_END + 1));
		parsedName.add(Channels.CLUTCH_NAME);
		parsedMap.put(Channels.CLUTCH_NAME, 1);
		parsed.add(string.substring(Channels.DN_REBOUND_START, Channels.DN_REBOUND_END + 1));
		parsedName.add(Channels.DN_REBOUND_NAME);
		parsedMap.put(Channels.DN_REBOUND_NAME, 2);
		parsed.add(string.substring(Channels.DN_BRAKE_START, Channels.DN_BRAKE_END + 1));
		parsedName.add(Channels.DN_BRAKE_NAME);
		parsedMap.put(Channels.DN_BRAKE_NAME, 3);
		parsed.add(string.substring(Channels.UP_PUSH_1_2_START, Channels.UP_PUSH_1_2_END + 1));
		parsedName.add(Channels.UP_PUSH_1_2_NAME);
		parsedMap.put(Channels.UP_PUSH_1_2_NAME, 4);
		parsed.add(string.substring(Channels.UP_PUSH_2_3_START, Channels.UP_PUSH_2_3_END + 1));
		parsedName.add(Channels.UP_PUSH_2_3_NAME);
		parsedMap.put(Channels.UP_PUSH_2_3_NAME, 5);
		parsed.add(string.substring(Channels.UP_PUSH_3_4_START, Channels.UP_PUSH_3_4_END + 1));
		parsedName.add(Channels.UP_PUSH_3_4_NAME);
		parsedMap.put(Channels.UP_PUSH_3_4_NAME, 6);
		parsed.add(string.substring(Channels.UP_PUSH_4_5_START, Channels.UP_PUSH_4_5_END + 1));
		parsedName.add(Channels.UP_PUSH_4_5_NAME);
		parsedMap.put(Channels.UP_PUSH_4_5_NAME, 7);
	}

}
