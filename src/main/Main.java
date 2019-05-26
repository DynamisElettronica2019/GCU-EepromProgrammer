package main;

import back_end.Data;
import back_end.Parser;
import back_end.Receiver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		Parser parser = new Parser(data);
		
		Receiver receiver = new Receiver(data,parser);
		new Thread(new Runnable() {
			@Override
			public void run() {
				receiver.Reader();
			}
		}).start();
	}

}
