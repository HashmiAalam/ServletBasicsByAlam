package com.basicconcept.collection;

public class Customer implements Comparable<Customer> {
 String cName;
 String cAddress;
public Customer(String cName, String cAddress) {
	super();
	this.cName = cName;
	this.cAddress = cAddress;
}
@Override
public String toString() {
	return "Customer [cName=" + cName + ", cAddress=" + cAddress + "]";
}
@Override
public int compareTo(Customer c) {
	return cName.compareTo(c.cName);
}
 
}
