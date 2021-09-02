package com.qa.basic;

public class Runner {

	public static void main(String[] args) {
		
		
		//String is complex object
		String newString = "This is new";

		// Objects are complex objects
		// CakeTin is a the data type
		//newCake is the name of the new object
		//new CakeTin () is running the method (creating a new cake)
		
		CakeTin newCake = new CakeTin();
		System.out.println(newCake);
		System.out.println(newCake.flavour);
		System.out.println(newCake.sprinkles);
		
		
	}

}
