package back_end.parsed;

import configuration.Channels;

public class ParsedPage11 extends Parsed {

	public ParsedPage11(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.RPM_TRESHOLD_START, Channels.RPM_TRESHOLD_END + 1));
		parsedName.add(Channels.RPM_TRESHOLD_NAME);
		parsedMap.put(Channels.RPM_TRESHOLD_NAME, 0);
		parsed.add(string.substring(Channels.DELTA_RPM_TRESHOLD_START, Channels.DELTA_RPM_TRESHOLD_END + 1));
		parsedName.add(Channels.DELTA_RPM_TRESHOLD_NAME);
		parsedMap.put(Channels.DELTA_RPM_TRESHOLD_NAME, 1);
		parsed.add(string.substring(Channels.GEAR_TRESHOLD_START, Channels.GEAR_TRESHOLD_END + 1));
		parsedName.add(Channels.GEAR_TRESHOLD_NAME);
		parsedMap.put(Channels.GEAR_TRESHOLD_NAME, 2);
	}

}
