package back_end.parsed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * If you want to add a new page, add a new subclass to this and implement splitstring
 * it has to include the message type and an array of strings
 */
abstract public class Parsed {
	protected ArrayList<String> parsed;
	protected ArrayList<String> parsedName;
	protected char messageType;
	protected Map<String, Integer> parsedMap = new HashMap<>();
	
	public Parsed(char messageType) {
		this.messageType = messageType;
		parsed = new ArrayList<String>(); // String init
		parsedName = new ArrayList<String>(); // String init
	}
	
	public ArrayList<String> getParsed() {
		return parsed;
	}

	public void setParsed(ArrayList<String> parsed) {
		this.parsed = parsed;
	}

	public ArrayList<String> getParsedName() {
		return parsedName;
	}

	public void setParsedName(ArrayList<String> parsedName) {
		this.parsedName = parsedName;
	}

	public Map<String, Integer> getParsedMap() {
		return parsedMap;
	}

	public void setParsedMap(Map<String, Integer> parsedMap) {
		this.parsedMap = parsedMap;
	}

	abstract public void splitString(String string);
}
