package back_end.parsed;

import configuration.Channels;

public class ParsedPage1 extends Parsed {
	private final int NT_PUSH_1_N_START = 0;
	private final int NT_PUSH_1_N_END = 1;
	private final int NT_CLUTCH_1_N_START = 2;
	private final int NT_CLUTCH_1_N_END = 3;
	private final int NT_REBOUND_1_N_START = 4;
	private final int NT_REBOUND_1_N_END = 5;
	private final int NT_BRAKE_1_N_START = 6;
	private final int NT_BRAKE_1_N_END = 7;
	private final int NT_PUSH_2_N_START = 8;
	private final int NT_PUSH_2_N_END = 9;
	private final int NT_CLUTCH_2_N_START = 10;
	private final int NT_CLUTCH_2_N_END = 11;
	private final int NT_REBOUND_2_N_START = 12;
	private final int NT_REBOUND_2_N_END = 13;
	private final int NT_BRAKE_2_N_START = 14;
	private final int NT_BRAKE_2_N_END = 15;

	public ParsedPage1(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(NT_PUSH_1_N_START, NT_PUSH_1_N_END));
		parsedName.add(Channels.NT_PUSH_1_N_NAME);
		parsedMap.put(Channels.NT_PUSH_1_N_NAME, 0);
		parsed.add(string.substring(NT_CLUTCH_1_N_START, NT_CLUTCH_1_N_END));
		parsedName.add(Channels.NT_CLUTCH_1_N_NAME);
		parsedMap.put(Channels.NT_CLUTCH_1_N_NAME, 1);
		parsed.add(string.substring(NT_REBOUND_1_N_START, NT_REBOUND_1_N_END));
		parsedName.add(Channels.NT_REBOUND_1_N_NAME);
		parsedMap.put(Channels.NT_REBOUND_1_N_NAME, 2);
		parsed.add(string.substring(NT_BRAKE_1_N_START, NT_BRAKE_1_N_END));
		parsedName.add(Channels.NT_BRAKE_1_N_NAME);
		parsedMap.put(Channels.NT_BRAKE_1_N_NAME, 3);
		parsed.add(string.substring(NT_PUSH_2_N_START, NT_PUSH_2_N_END));
		parsedName.add(Channels.NT_PUSH_2_N_NAME);
		parsedMap.put(Channels.NT_PUSH_2_N_NAME, 4);
		parsed.add(string.substring(NT_CLUTCH_2_N_START, NT_CLUTCH_2_N_END));
		parsedName.add(Channels.NT_CLUTCH_2_N_NAME);
		parsedMap.put(Channels.NT_CLUTCH_2_N_NAME, 5);
		parsed.add(string.substring(NT_REBOUND_2_N_START, NT_REBOUND_2_N_END));
		parsedName.add(Channels.NT_REBOUND_2_N_NAME);
		parsedMap.put(Channels.NT_REBOUND_2_N_NAME, 6);
		parsed.add(string.substring(NT_BRAKE_2_N_START, NT_BRAKE_2_N_END));
		parsedName.add(Channels.NT_BRAKE_2_N_NAME);
		parsedMap.put(Channels.NT_BRAKE_2_N_NAME, 7);
	}

}
