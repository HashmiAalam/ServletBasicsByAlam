package com.lambda;

public class Test {

	public static void main(String[] args) {
		int count = 1; 
		System.out.println(count/2);
		System.out.println(count%2);
	    while (count <= 15) {  
	    System.out.println(count % 2 == 1 ? "***" : "+++++");   //1%2=1
	    ++count;  
	        }    
	}

}
