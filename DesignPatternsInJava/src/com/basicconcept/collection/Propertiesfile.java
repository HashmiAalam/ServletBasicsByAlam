package com.basicconcept.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws IOException {
        //loading the properties file
		FileInputStream fileInputStream=new FileInputStream("propertiesexample.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		//read data from properties file
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
	}

}
