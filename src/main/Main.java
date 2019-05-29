package main;

import java.util.ArrayList;

import back_end.Data;
import back_end.Parser;
import back_end.Receiver;
import configuration.Channels;
import front_end.View;
import front_end.gui.GuiView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		/*
		 * Init channels
		 */
		@SuppressWarnings("unused")
		Channels config = new Channels();
		

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
