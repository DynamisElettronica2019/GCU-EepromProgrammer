package back_end;

import java.util.ArrayList;

import back_end.parsed.ParsedPage0;
import back_end.parsed.ParsedPage1;
import back_end.parsed.ParsedPage10;
import back_end.parsed.ParsedPage11;
import back_end.parsed.ParsedPage2;
import back_end.parsed.ParsedPage3;
import back_end.parsed.ParsedPage4;
import back_end.parsed.ParsedPage5;
import back_end.parsed.ParsedPage6;
import back_end.parsed.ParsedPage7;
import back_end.parsed.ParsedPage8;
import back_end.parsed.ParsedPage9;
import configuration.Channels;

public class Parser {
	private ArrayList<Character> pageIdentifier = new ArrayList<Character>(); // For future use
	private Data data;
	
	/*
	 * Set class attributes
	 */
	public Parser(Data data) {
		this.data = data;
		/*
		 * Set gearshift pages
		 */
		pageIdentifier.add((char) 0);
		pageIdentifier.add((char) 1);
		pageIdentifier.add((char) 2);
		pageIdentifier.add((char) 3);
		pageIdentifier.add((char) 4);
		
		/*
		 * Set acceleration pages
		 */
		pageIdentifier.add((char) 5);
		pageIdentifier.add((char) 6);
		pageIdentifier.add((char) 7);
		
		/*
		 * Set autocross pages
		 */
		pageIdentifier.add((char) 8);
		pageIdentifier.add((char) 9);
		pageIdentifier.add((char) 10);
		
		/*
		 * Set antistall pages
		 */
		pageIdentifier.add((char) 11);
	}
	
	/*
	 * Check input string validity and decide what to do. Throw
	 * exception if the input string is not valid.
	 */
	public void parseString(String stringToParse) {
		StringBuilder sb = new StringBuilder(stringToParse);
		if(sb.toString().length() != (Channels.STRING_SIZE - 1)) {
			System.err.println("Received message lenght error");
			return;
		}
		else {
			switch (stringToParse.charAt(0)) {
			case 0:
				ParsedPage0 parsed0 = new ParsedPage0('0');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed0.splitString(sb.toString());
				data.update(parsed0);
				break;
			case 1:
				ParsedPage1 parsed1 = new ParsedPage1('1');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed1.splitString(sb.toString());
				data.update(parsed1);
				break;
			case 2:
				ParsedPage2 parsed2 = new ParsedPage2('2');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed2.splitString(sb.toString());
				data.update(parsed2);
				break;
			case 3:
				ParsedPage3 parsed3 = new ParsedPage3('3');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed3.splitString(sb.toString());
				data.update(parsed3);
				break;
			case 4:
				ParsedPage4 parsed4 = new ParsedPage4('4');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed4.splitString(sb.toString());
				data.update(parsed4);
				break;
			case 5:
				ParsedPage5 parsed5 = new ParsedPage5('5');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed5.splitString(sb.toString());
				data.update(parsed5);
				break;
			case 6:
				ParsedPage6 parsed6 = new ParsedPage6('6');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed6.splitString(sb.toString());
				data.update(parsed6);
				break;
			case 7:
				ParsedPage7 parsed7 = new ParsedPage7('7');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed7.splitString(sb.toString());
				data.update(parsed7);
				break;
			case 8:
				ParsedPage8 parsed8 = new ParsedPage8('8');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed8.splitString(sb.toString());
				data.update(parsed8);
				break;
			case 9:
				ParsedPage9 parsed9 = new ParsedPage9('9');
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed9.splitString(sb.toString());
				data.update(parsed9);
				break;
			case 10:
				ParsedPage10 parsed10 = new ParsedPage10((char) 10);
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed10.splitString(sb.toString());
				data.update(parsed10);
				break;
			case 11:
				ParsedPage11 parsed11 = new ParsedPage11((char) 11);
				sb.delete(Channels.HEADER_ID_START, Channels.HEADER_ID_END);
				parsed11.splitString(sb.toString());
				data.update(parsed11);
				break;
			default:
				System.err.println("Page reading error");
			}
		}
	}
}
