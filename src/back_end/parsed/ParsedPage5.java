package back_end.parsed;

public class ParsedPage5 extends Parsed {
	private final int RAMP_START_START = 0;
	private final int RAMP_START_END = 1;
	private final int RAMP_END_START = 2;
	private final int RAMP_END_END = 3;
	private final int RAMP_TIME_START = 4;
	private final int RAMP_TIME_END = 5;
	private final int RPM_LIMIT_1_2_START = 6;
	private final int RPM_LIMIT_1_2_END = 7;
	private final int RPM_LIMIT_2_3_START = 8;
	private final int RPM_LIMIT_2_3_END = 9;
	private final int RPM_LIMIT_3_4_START = 10;
	private final int RPM_LIMIT_3_4_END = 11;
	private final int RPM_LIMIT_4_5_START = 12;
	private final int RPM_LIMIT_4_5_END = 13;
	private final int SPEED_LIMIT_1_2_START = 14;
	private final int SPEED_LIMIT_1_2_END = 15;

	public ParsedPage5(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(RAMP_START_START, RAMP_START_END));
		parsed.add(string.substring(RAMP_END_START, RAMP_END_END));
		parsed.add(string.substring(RAMP_TIME_START, RAMP_TIME_END));
		parsed.add(string.substring(RPM_LIMIT_1_2_START, RPM_LIMIT_1_2_END));
		parsed.add(string.substring(RPM_LIMIT_2_3_START, RPM_LIMIT_2_3_END));
		parsed.add(string.substring(RPM_LIMIT_3_4_START, RPM_LIMIT_3_4_END));
		parsed.add(string.substring(RPM_LIMIT_4_5_START, RPM_LIMIT_4_5_END));
		parsed.add(string.substring(SPEED_LIMIT_1_2_START, SPEED_LIMIT_1_2_END));
	}

}
