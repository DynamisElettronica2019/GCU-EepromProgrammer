package back_end.parsed;

import java.util.ArrayList;

/*
 * If you want to add a new page, add a new subclass to this and implement splitstring
 * it has to include the message type and an array of strings
 */
abstract public class Parsed {
	protected ArrayList<String> parsed;
	protected char messageType;
	
	public Parsed(char messageType) {
		this.messageType = messageType;
		parsed = new ArrayList<String>(); // String init
	}
	
	abstract public void splitString(String string);
}
