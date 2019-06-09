package back_end;

import java.io.IOException;
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
import front_end.View;

public class Data {
	private Debug debug;
	private Gearshift gearshift;
	private Acceleration acceleration;
	private Autocross autocross;
	private Antistall antistall;
	
	public Data(ArrayList<View> myViews) throws IOException {
		debug = new Debug(myViews);
		gearshift = new Gearshift(myViews);
		acceleration = new Acceleration(myViews);
		autocross = new Autocross(myViews);
		antistall = new Antistall(myViews);
		
		ViewLoader vl = new ViewLoader(this);
		for(View v : myViews) v.setViewLoader(vl);
	}
	
	/*
	 * Gear and acceleration getter and setter
	 */
	public Debug getDebug() {
		return debug;
	}

	public void setDebug(Debug debug) {
		this.debug = debug;
	}
	
	public Gearshift getGearshift() {
		return gearshift;
	}

	public void setGearshift(Gearshift gearshift) {
		this.gearshift = gearshift;
	}

	public Acceleration getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Acceleration acceleration) {
		this.acceleration = acceleration;
	}
	

	public Autocross getAutocross() {
		return autocross;
	}

	public void setAutocross(Autocross autocross) {
		this.autocross = autocross;
	}

	public Antistall getAntistall() {
		return antistall;
	}

	public void setAntistall(Antistall antistall) {
		this.antistall = antistall;
	}

	/*
	 * Every parsed page has its own update method for storing data in gear/accel class
	 */
	public void update(ParsedPage0 parsed) {
		debug.UpdatePage(parsed);
	}
	
	public void update(ParsedPage1 parsed) {
		gearshift.UpdatePage(parsed);
	}
	
	public void update(ParsedPage2 parsed) {
		gearshift.UpdatePage(parsed);
	}
	
	public void update(ParsedPage3 parsed) {
		gearshift.UpdatePage(parsed);
	}
	
	public void update(ParsedPage4 parsed) {
		gearshift.UpdatePage(parsed);
	}

	public void update(ParsedPage5 parsed) {
		acceleration.UpdatePage(parsed);
	}
	
	public void update(ParsedPage6 parsed) {
		acceleration.UpdatePage(parsed);
	}
	
	public void update(ParsedPage7 parsed) {
		acceleration.UpdatePage(parsed);
	}
	
	public void update(ParsedPage8 parsed) {
		
	}
	
	public void update(ParsedPage9 parsed) {
		
	}
	
	public void update(ParsedPage10 parsed) {
		
	}
	
	public void update(ParsedPage11 parsed) {
		
	}
}
