package com.singleton;

public class TestLogger {

	public static void main(String[] args) {
		/*
		 * we know that if we have a class we can create multiple object of a class like below
		 * I will get new object every time*/
		SamlpeClass samlpeClassObject=new SamlpeClass();//because of constructor we are able to create an object of a class.
		SamlpeClass samlpeClassObject1=new SamlpeClass();
		System.out.println(samlpeClassObject.hashCode());
		System.out.println(samlpeClassObject1.hashCode());
		/*But singleton pattern says we should be able to create only one object of a class.
		 * we know that whenever an object is created by default the constructor is executed.
		 * whenever we create an object constructor method is executed and create an object of logger. 
		 * The constructor Logger() is not visible if we declare default constructor as private
		i.e. we can not create an object with new keyword like new Logger(); because we are not 
		able to access constructor outside of class*/
		System.out.println("Object with singleton pattern and I will get same object every time");
		Logger logger=Logger.getInstance(); //without creating an object we get object by calling getInstance(); therefore it is static
		Logger logger1=Logger.getInstance();
		System.out.println(logger.hashCode());
		System.out.println(logger1.hashCode());
	}

}