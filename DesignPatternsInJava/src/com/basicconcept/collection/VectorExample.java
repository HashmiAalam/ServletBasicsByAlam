package com.basicconcept.collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Product> products=new Vector<Product>();
		products.add(new Product("Rice", 1, 2330));
		products.add(new Product("Wheat", 2, 330));
		products.add(new Product("Javar", 3, 630));
		ListIterator<Product> listIterator = products.listIterator();
		while(listIterator.hasNext()) {
			Product product = listIterator.next();
			System.out.println(product);
		}
	}

}
