package back_end.parsed;

import configuration.Channels;

public class ParsedPage2 extends Parsed {
	private final int DN_PUSH_START = 0;
	private final int DN_PUSH_END = 1;
	private final int CLUTCH_START = 2;
	private final int CLUTCH_END = 3;
	private final int DN_REBOUND_START = 4;
	private final int DN_REBOUND_END = 5;
	private final int DN_BRAKE_START = 6;
	private final int DN_BRAKE_END = 7;
	private final int UP_PUSH_1_2_START = 8;
	private final int UP_PUSH_1_2_END = 9;
	private final int UP_PUSH_2_3_START = 10;
	private final int UP_PUSH_2_3_END = 11;
	private final int UP_PUSH_3_4_START = 12;
	private final int UP_PUSH_3_4_END = 13;
	private final int UP_PUSH_4_5_START = 14;
	private final int UP_PUSH_4_5_END = 15;

	public ParsedPage2(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(DN_PUSH_START, DN_PUSH_END));
		parsedName.add(Channels.DN_PUSH_NAME);
		parsedMap.put(Channels.DN_PUSH_NAME, 0);
		parsed.add(string.substring(CLUTCH_START, CLUTCH_END));
		parsedName.add(Channels.CLUTCH_NAME);
		parsedMap.put(Channels.CLUTCH_NAME, 0);
		parsed.add(string.substring(DN_REBOUND_START, DN_REBOUND_END));
		parsedName.add(Channels.DN_REBOUND_NAME);
		parsedMap.put(Channels.DN_REBOUND_NAME, 0);
		parsed.add(string.substring(DN_BRAKE_START, DN_BRAKE_END));
		parsedName.add(Channels.DN_BRAKE_NAME);
		parsedMap.put(Channels.DN_BRAKE_NAME, 0);
		parsed.add(string.substring(UP_PUSH_1_2_START, UP_PUSH_1_2_END));
		parsedName.add(Channels.UP_PUSH_1_2_NAME);
		parsedMap.put(Channels.UP_PUSH_1_2_NAME, 0);
		parsed.add(string.substring(UP_PUSH_2_3_START, UP_PUSH_2_3_END));
		parsedName.add(Channels.UP_PUSH_2_3_NAME);
		parsedMap.put(Channels.UP_PUSH_2_3_NAME, 0);
		parsed.add(string.substring(UP_PUSH_3_4_START, UP_PUSH_3_4_END));
		parsedName.add(Channels.UP_PUSH_3_4_NAME);
		parsedMap.put(Channels.UP_PUSH_3_4_NAME, 0);
		parsed.add(string.substring(UP_PUSH_4_5_START, UP_PUSH_4_5_END));
		parsedName.add(Channels.UP_PUSH_4_5_NAME);
		parsedMap.put(Channels.UP_PUSH_4_5_NAME, 0);
	}

}
