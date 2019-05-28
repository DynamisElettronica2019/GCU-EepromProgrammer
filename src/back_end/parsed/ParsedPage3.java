package back_end.parsed;

public class ParsedPage3 extends Parsed {
	private final int DELAY_START = 0;
	private final int DELAY_END = 1;
	private final int UP_REBOUND_START = 2;
	private final int UP_REBOUND_END = 3;
	private final int UP_BRAKE_START = 4;
	private final int UP_BRAKE_END = 5;
	private final int NT_CLUTCH_DELAY_START = 6;
	private final int NT_CLUTCH_DELAY_END = 7;
	private final int DOWN_TIME_CHECK_START = 8;
	private final int DOWN_TIME_CHECK_END = 9;
	private final int UP_TIME_CHECK_START = 10;
	private final int UP_TIME_CHECK_END = 11;
	private final int MAX_TRIES_START = 12;
	private final int MAX_TRIES_END = 13;

	public ParsedPage3(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(DELAY_START, DELAY_END));
		parsed.add(string.substring(UP_REBOUND_START, UP_REBOUND_END));
		parsed.add(string.substring(UP_BRAKE_START, UP_BRAKE_END));
		parsed.add(string.substring(NT_CLUTCH_DELAY_START, NT_CLUTCH_DELAY_END));
		parsed.add(string.substring(DOWN_TIME_CHECK_START, DOWN_TIME_CHECK_END));
		parsed.add(string.substring(UP_TIME_CHECK_START, UP_TIME_CHECK_END));
		parsed.add(string.substring(MAX_TRIES_START, MAX_TRIES_END));
	}

}
