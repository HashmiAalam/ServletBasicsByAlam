package com.basicconcept.collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Comparator;
public class TreeMapExample{
	public static void main(String[] args){
		TreeMap<Product, Customer> h=new TreeMap<Product, Customer>(new MyNewComp());
		h.put(new Product("Oil",11,12.3),new Customer("Ratan","Bandra"));
		h.put(new Product("Rice",2,19.5),new Customer("Anu","Kurla"));
		h.put(new Product("Car",1,12444.34),new Customer("Wakeel","Kurla"));
		h.put(new Product("Cycle",3,1254.39),new Customer("Durga","Andheri"));
		Set<Product> keys=h.keySet();
		Collection<Customer> values=h.values();
		Set<Entry<Product,Customer>> entreis=h.entrySet();
		for(Entry<Product,Customer> e:entreis){
			System.out.println(e.getKey()+" "+e.getValue());}
		}
}
class MyComp implements Comparator<Product>{
    //Ascending order:- This is a structure TreeMap follow internally.
	@Override
	public int compare(Product p1, Product p2) {
		int id = p1.getpId();
		int id1 = p2.getpId();
		if(id>id1) {
			return 1;}else if(id==id1) {return 0;}
			else
				return -1;
	}	
}
class MyNewComp implements Comparator<Product>{
     //Descending order:- This is customized one
	@Override
	public int compare(Product o1, Product o2) {
		return -o1.getpId().compareTo(o2.getpId());
	}	
}
