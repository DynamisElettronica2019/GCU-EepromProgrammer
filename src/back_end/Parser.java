package back_end;

import java.util.ArrayList;

public class Parser {
	private ArrayList<Character> gearshiftPages = new ArrayList<Character>();
	private ArrayList<Character> accelerationPages = new ArrayList<Character>();
	
	/*
	 * Set class attributes
	 */
	public Parser() {
		
		/*
		 * Set gearshift pages
		 */
		gearshiftPages.add('0');
		gearshiftPages.add('1');
		gearshiftPages.add('2');
		gearshiftPages.add('3');
		gearshiftPages.add('4');
		
		/*
		 * Set acceleration pages
		 */
		accelerationPages.add('5');
		accelerationPages.add('6');
		accelerationPages.add('7');
	}
	
	/*
	 * Check input string validity and decide what to do. Throw
	 * exception if the input string is not valid.
	 */
	public void parseString(String stringToParse) {
		for(char c : gearshiftPages) {
			if(stringToParse.charAt(0) == c) {
				// Gearshift type, call relative parsedgearshift function
			}
		}
		for(char c : accelerationPages) {
			if(stringToParse.charAt(0) == c) {
				// Acceleration type, call relative parsedacceleration function
			}
		}
	}
}
