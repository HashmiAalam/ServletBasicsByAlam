package com.basicconcept.collection;
public class Product implements Comparable<Product>{
	private String pName;
	private Integer pId;
	private double price;
	public Product(String pName, Integer pId, double price) {
		super();
		this.pName = pName;
		this.pId = pId;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pId=" + pId + ", price=" + price + "]";
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Product p) {
		return pName.compareTo(p.pName);
	}
}
