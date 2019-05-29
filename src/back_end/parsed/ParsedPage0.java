package back_end.parsed;

import configuration.Channels;

public class ParsedPage0 extends Parsed {
	

	public ParsedPage0(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(Channels.EEPROM_STATE_START, Channels.EEPROM_STATE_END));
		parsedName.add(Channels.EEPROM_STATE_NAME);
		parsedMap.put(Channels.EEPROM_STATE_NAME, 0);
		parsed.add(string.substring(Channels.EEPROM_LAST_COM_START, Channels.EEPROM_LAST_COM_END));
		parsedName.add(Channels.EEPROM_LAST_COM_NAME);
		parsedMap.put(Channels.EEPROM_STATE_NAME, 1);
		parsed.add(string.substring(Channels.EEPROM_READ_COUNTER_START, Channels.EEPROM_READ_COUNTER_END));
		parsedName.add(Channels.EEPROM_READ_COUNTER_NAME);
		parsedMap.put(Channels.EEPROM_STATE_NAME, 2);
		parsed.add(string.substring(Channels.EEPROM_WRITE_COUNTER_START, Channels.EEPROM_WRITE_COUNTER_END));
		parsedName.add(Channels.EEPROM_WRITE_COUNTER_NAME);
		parsedMap.put(Channels.EEPROM_STATE_NAME, 3);
	}

}
