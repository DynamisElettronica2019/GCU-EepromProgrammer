package back_end.parsed;

import configuration.Channels;

public class ParsedPage1 extends Parsed {

	public ParsedPage1(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.NT_PUSH_1_N_START, Channels.NT_PUSH_1_N_END));
		parsedName.add(Channels.NT_PUSH_1_N_NAME);
		parsedMap.put(Channels.NT_PUSH_1_N_NAME, 0);
		parsed.add(string.substring(Channels.NT_CLUTCH_1_N_START, Channels.NT_CLUTCH_1_N_END));
		parsedName.add(Channels.NT_CLUTCH_1_N_NAME);
		parsedMap.put(Channels.NT_CLUTCH_1_N_NAME, 1);
		parsed.add(string.substring(Channels.NT_REBOUND_1_N_START, Channels.NT_REBOUND_1_N_END));
		parsedName.add(Channels.NT_REBOUND_1_N_NAME);
		parsedMap.put(Channels.NT_REBOUND_1_N_NAME, 2);
		parsed.add(string.substring(Channels.NT_BRAKE_1_N_START, Channels.NT_BRAKE_1_N_END));
		parsedName.add(Channels.NT_BRAKE_1_N_NAME);
		parsedMap.put(Channels.NT_BRAKE_1_N_NAME, 3);
		parsed.add(string.substring(Channels.NT_PUSH_2_N_START, Channels.NT_PUSH_2_N_END));
		parsedName.add(Channels.NT_PUSH_2_N_NAME);
		parsedMap.put(Channels.NT_PUSH_2_N_NAME, 4);
		parsed.add(string.substring(Channels.NT_CLUTCH_2_N_START, Channels.NT_CLUTCH_2_N_END));
		parsedName.add(Channels.NT_CLUTCH_2_N_NAME);
		parsedMap.put(Channels.NT_CLUTCH_2_N_NAME, 5);
		parsed.add(string.substring(Channels.NT_REBOUND_2_N_START, Channels.NT_REBOUND_2_N_END));
		parsedName.add(Channels.NT_REBOUND_2_N_NAME);
		parsedMap.put(Channels.NT_REBOUND_2_N_NAME, 6);
		parsed.add(string.substring(Channels.NT_BRAKE_2_N_START, Channels.NT_BRAKE_2_N_END));
		parsedName.add(Channels.NT_BRAKE_2_N_NAME);
		parsedMap.put(Channels.NT_BRAKE_2_N_NAME, 7);
	}

}
