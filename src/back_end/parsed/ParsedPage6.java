package back_end.parsed;

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
		parsed.add(string.substring(SPEED_LIMIT_3_4_START, SPEED_LIMIT_3_4_END));
		parsed.add(string.substring(SPEED_LIMIT_4_5_START, SPEED_LIMIT_4_5_END));
		parsed.add(string.substring(TPS_START_LIMIT_START, TPS_START_LIMIT_END));
	}

}
