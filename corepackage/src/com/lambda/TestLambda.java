package com.lambda;

public class TestLambda {

	public static void main(String[] args) {
		Itr itr=   abc->System.out.println("Hi "+abc);
	itr.disply("alam");
	Itr1 itr1= abc-> "Hello "+ abc;
	System.out.println(itr1.disply("wakeel"));
	}
}
interface Itr{
	void disply(String abc);
}
interface Itr1{
	String disply(String abc);
}
