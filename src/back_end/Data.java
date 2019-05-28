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
import front_end.View;

public class Data {
	private Gearshift gearshift;
	private Acceleration acceleration;
	
	public Data(ArrayList<View> myViews) {
		gearshift = new Gearshift(myViews);
		acceleration = new Acceleration(myViews);
	}
	
	/*
	 * Every parsed page has its own update method for storing data in gear/accel class
	 */
	public void update(ParsedPage0 parsed) {
		
	}
	
	public void update(ParsedPage1 parsed) {
		
	}
	
	public void update(ParsedPage2 parsed) {
	
	}
	
	public void update(ParsedPage3 parsed) {
		
	}
	
	public void update(ParsedPage4 parsed) {
		
	}

	public void update(ParsedPage5 parsed) {
	
	}
	
	public void update(ParsedPage6 parsed) {
		
	}
	
	public void update(ParsedPage7 parsed) {
		
	}
}
