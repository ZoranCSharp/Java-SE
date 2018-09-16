package com.lesson34;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorldHandlers {

	private static Logger helloLogger = Logger.getLogger(HelloWorldClassLogger.class.getName());
	
	public static void main(String[] args) {
	
		FileHandler helloFileHandler;
		
		try {
			
			helloFileHandler = new FileHandler("logs/helloworld.log");
			helloLogger.addHandler(helloFileHandler);
			helloFileHandler.setLevel(Level.WARNING);
			
		}catch(SecurityException e) {
			System.out.println(e.getMessage());
		}catch(IOException e1) {
			System.out.println(e1.getMessage());
		}
		
		helloLogger.fine("Hello from the fine world!");
		helloLogger.info("Trying to divide by zero");
		
		try {
			
			int result = 25/0;
		}catch(Exception e) {
			
			helloLogger.severe("Division by zero");
		}

	}

}
