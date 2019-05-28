package main;

import java.util.ArrayList;

import back_end.Data;
import back_end.Parser;
import back_end.Receiver;
import front_end.View;
import front_end.gui.GuiView;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create view
		 */
		ArrayList<View> myViews = new ArrayList<View>();
		myViews.add(new GuiView());
		
		/*
		 * Create data, parser and start receiver
		 */
		Data data = new Data(myViews);
		Parser parser = new Parser(data);
		
		Receiver receiver = new Receiver(data,parser,myViews);
		new Thread(new Runnable() {
			@Override
			public void run() {
				receiver.Reader();
			}
		}).start();
	}

}
