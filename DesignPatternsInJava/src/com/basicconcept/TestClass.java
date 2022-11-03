package com.basicconcept;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("A object, it can access all methods of A only");
		A aObj=new A();
		aObj.methodA();
		System.out.println("B object, it can access all methods in A and B");
		B bObj=new B();
		bObj.methodA();
		bObj.methodB();
		/* value of i is 100 of type int i.e. L.H.S Determines the property of variable
		 * it means i can accept any int value
		 * why it is 100 because R.H.S says it is 100 i.e. R.H.S determine the value of variable*/
		int i=100;
		
		//supperClass obj=new SubClass();
		A obj=new B(); //therefore obj is b object and has properties of A
		System.out.println("B object of type A, it can access properties define in A");
		obj.methodA();//inheritance
		System.out.println("Note:- if we override methodA in B class then it will call overridden method of B class");
		System.out.println("But obj can not access method of B class");
		//obj.methodB();//error:-The method methodB() is undefined for the type A
		
		//not possible
		//B obj=new A(); //Type mismatch: cannot convert from A to B
	}

}
