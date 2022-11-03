package com.basicconcept;

public class TestInterface {

	public static void main(String[] args) {
		/*
		 * To prove obj is ClassBImplementsInterfaceA object
		 * SupperClass obj=new SubClass()
		 * I have used interface because it is impossible to create object of an interface*/
		InterfaceA obj=new ClassBImplementsInterfaceA();
		obj.methodAOfInterface();

	}

}
