package back_end.parsed;

public class ParsedPage1 extends Parsed {
	private final int NT_PUSH_1_N_START = 0;
	private final int NT_PUSH_1_N_END = 0;
	private final int NT_CLUTCH_1_N_START = 0;
	private final int NT_CLUTCH_1_N_END = 0;
	private final int NT_REBOUND_1_N_START = 2;
	private final int NT_REBOUND_1_N_END = 2;
	private final int NT_BRAKE_1_N_START = 2;
	private final int NT_BRAKE_1_N_END = 2;
	private final int NT_PUSH_2_N_START = 4;
	private final int NT_PUSH_2_N_END = 4;
	private final int NT_CLUTCH_2_N_START = 5;
	private final int NT_CLUTCH_2_N_END = 5;
	private final int NT_REBOUND_2_N_START = 7;
	private final int NT_REBOUND_2_N_END = 7;
	private final int NT_BRAKE_2_N_START = 8;
	private final int NT_BRAKE_2_N_END = 8;

	public ParsedPage1(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		// TODO Auto-generated method stub

	}

}
