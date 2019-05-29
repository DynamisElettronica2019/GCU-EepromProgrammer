package back_end.parsed;

import configuration.Channels;

public class ParsedPage3 extends Parsed {

	public ParsedPage3(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.DELAY_START, Channels.DELAY_END + 1));
		parsedName.add(Channels.DELAY_NAME);
		parsedMap.put(Channels.DELAY_NAME, 0);
		parsed.add(string.substring(Channels.UP_REBOUND_START, Channels.UP_REBOUND_END + 1));
		parsedName.add(Channels.UP_REBOUND_NAME);
		parsedMap.put(Channels.UP_REBOUND_NAME, 1);
		parsed.add(string.substring(Channels.UP_BRAKE_START, Channels.UP_BRAKE_END + 1));
		parsedName.add(Channels.UP_BRAKE_NAME);
		parsedMap.put(Channels.UP_BRAKE_NAME, 2);
		parsed.add(string.substring(Channels.NT_CLUTCH_DELAY_START, Channels.NT_CLUTCH_DELAY_END + 1));
		parsedName.add(Channels.NT_CLUTCH_DELAY_NAME);
		parsedMap.put(Channels.NT_CLUTCH_DELAY_NAME, 3);
		parsed.add(string.substring(Channels.DOWN_TIME_CHECK_START, Channels.DOWN_TIME_CHECK_END + 1));
		parsedName.add(Channels.DOWN_TIME_CHECK_NAME);
		parsedMap.put(Channels.DOWN_TIME_CHECK_NAME, 4);
		parsed.add(string.substring(Channels.UP_TIME_CHECK_START, Channels.UP_TIME_CHECK_END + 1));
		parsedName.add(Channels.UP_TIME_CHECK_NAME);
		parsedMap.put(Channels.UP_TIME_CHECK_NAME, 5);
		parsed.add(string.substring(Channels.MAX_TRIES_START, Channels.MAX_TRIES_END + 1));
		parsedName.add(Channels.MAX_TRIES_NAME);
		parsedMap.put(Channels.MAX_TRIES_NAME, 6);
	}

}
