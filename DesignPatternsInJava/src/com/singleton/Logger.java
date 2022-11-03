package com.singleton;
public class Logger {
    //singleton pattern says that create a instance right here
	private static Logger logger;
	private Logger(){
		//this will not be accessible out side of a class.
	}
	public static Logger getInstance() {
		if(logger==null) {
			logger=new Logger();//static method can have static instance
		}
		return logger;
	}
}
