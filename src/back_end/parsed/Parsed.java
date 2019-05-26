package back_end.parsed;

/*
 * If you want to add a new page, add a new subclass to this and implement splitstring
 * it has to include the message type and an array of strings
 */
abstract public class Parsed {
	private String[] parsed;
	private char messageType;
	
	public Parsed(char messageType) {
		this.messageType = messageType;
	}
	
	abstract public void splitString(String string);
}
