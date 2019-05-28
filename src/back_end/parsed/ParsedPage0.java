package back_end.parsed;

public class ParsedPage0 extends Parsed {
	private final int EEPROM_STATE_START = 0;
	private final int EEPROM_STATE_END = 0;
	private final int EEPROM_LAST_COM_START = 2;
	private final int EEPROM_LAST_COM_END = 2;
	private final int EEPROM_READ_COUNTER_START = 4;
	private final int EEPROM_READ_COUNTER_END = 5;
	private final int EEPROM_WRITE_COUNTER_START = 7;
	private final int EEPROM_WRITE_COUNTER_END = 8;

	public ParsedPage0(char messageType) {
		super(messageType);
	}

	@Override
	public void splitString(String string) {
		/*
		 * Substrings creation
		 */
		parsed.add(string.substring(EEPROM_STATE_START, EEPROM_STATE_END));
		parsed.add(string.substring(EEPROM_LAST_COM_START, EEPROM_LAST_COM_END));
		parsed.add(string.substring(EEPROM_READ_COUNTER_START, EEPROM_READ_COUNTER_END));
		parsed.add(string.substring(EEPROM_WRITE_COUNTER_START, EEPROM_WRITE_COUNTER_END));
	}

}
