package back_end;

import java.util.ArrayList;

import back_end.parsed.ParsedPage0;
import back_end.parsed.ParsedPage1;
import back_end.parsed.ParsedPage2;
import back_end.parsed.ParsedPage3;
import back_end.parsed.ParsedPage4;
import back_end.parsed.ParsedPage5;
import back_end.parsed.ParsedPage6;
import back_end.parsed.ParsedPage7;

public class Parser {
	private ArrayList<Character> pageIdentifier = new ArrayList<Character>(); // For future use
	
	/*
	 * Set class attributes
	 */
	public Parser() {
		
		/*
		 * Set gearshift pages
		 */
		pageIdentifier.add('0');
		pageIdentifier.add('1');
		pageIdentifier.add('2');
		pageIdentifier.add('3');
		pageIdentifier.add('4');
		
		/*
		 * Set acceleration pages
		 */
		pageIdentifier.add('5');
		pageIdentifier.add('6');
		pageIdentifier.add('7');
	}
	
	/*
	 * Check input string validity and decide what to do. Throw
	 * exception if the input string is not valid.
	 */
	public void parseString(String stringToParse) {
		switch (stringToParse.charAt(0)) {
		case '0':
			ParsedPage0 parsed0 = new ParsedPage0('0');
			parsed0.splitString(stringToParse);
			break;
		case '1':
			ParsedPage1 parsed1 = new ParsedPage1('1');
			parsed1.splitString(stringToParse);
			break;
		case '2':
			ParsedPage2 parsed2 = new ParsedPage2('2');
			parsed2.splitString(stringToParse);
			break;
		case '3':
			ParsedPage3 parsed3 = new ParsedPage3('3');
			parsed3.splitString(stringToParse);
			break;
		case '4':
			ParsedPage4 parsed4 = new ParsedPage4('4');
			parsed4.splitString(stringToParse);
			break;
		case '5':
			ParsedPage5 parsed5 = new ParsedPage5('5');
			parsed5.splitString(stringToParse);
			break;
		case '6':
			ParsedPage6 parsed6 = new ParsedPage6('6');
			parsed6.splitString(stringToParse);
			break;
		case '7':
			ParsedPage7 parsed7 = new ParsedPage7('7');
			parsed7.splitString(stringToParse);
			break;
		default:
			System.out.println("First letter reading error");
		}
	}
}
