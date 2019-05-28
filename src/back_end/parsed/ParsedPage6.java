package back_end.parsed;

import configuration.Channels;

public class ParsedPage6 extends Parsed {
	private final int SPEED_LIMIT_2_3_START = 0;
	private final int SPEED_LIMIT_2_3_END = 1;
	private final int SPEED_LIMIT_3_4_START = 2;
	private final int SPEED_LIMIT_3_4_END = 3;
	private final int SPEED_LIMIT_4_5_START = 4;
	private final int SPEED_LIMIT_4_5_END = 5;
	private final int TPS_START_LIMIT_START = 6;
	private final int TPS_START_LIMIT_END = 7;

	public ParsedPage6(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(SPEED_LIMIT_2_3_START, SPEED_LIMIT_2_3_END));
		parsedName.add(Channels.SPEED_LIMIT_2_3_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_2_3_NAME, 1);
		parsed.add(string.substring(SPEED_LIMIT_3_4_START, SPEED_LIMIT_3_4_END));
		parsedName.add(Channels.SPEED_LIMIT_3_4_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_3_4_NAME, 2);
		parsed.add(string.substring(SPEED_LIMIT_4_5_START, SPEED_LIMIT_4_5_END));
		parsedName.add(Channels.SPEED_LIMIT_4_5_NAME);
		parsedMap.put(Channels.SPEED_LIMIT_4_5_NAME, 3);
		parsed.add(string.substring(TPS_START_LIMIT_START, TPS_START_LIMIT_END));
		parsedName.add(Channels.TPS_START_LIMIT_NAME);
		parsedMap.put(Channels.TPS_START_LIMIT_NAME, 4);
	}

}
