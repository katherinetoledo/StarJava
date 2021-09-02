package com.qa.basic;

public class CakeTin {

	
	/* A class is JUST a blueprint of instructions
	 * Objects created FROM the cakeTin ARE objects (they are physical and usable)
	 */
	
	//Create the fields / variables that make up the cake object
	// A collection of data types to explain what makes up the records
	//public to make my life easier
	
	public String colour;
	public String flavour;
	public int layers;
	public int numberOfCandles;
	public boolean sprinkles;
	
	// Create a method that will be accessible to all objects of this class
	// static methods are used when the method relates to the class
	// this method relates to the OBJECT and so it isn't static
	
	public void cutInSlices () {
		
		//For Loop to print out a "Slice has been cut" 8 times
		
		for (int i = 0; i <= 8; i++) {
			System.out.println("A slide has been cut!");
		}
		
		System.out.println("No more cake left :(");
		
	}
	
	// a way of CREATING the object from this class
	// We use a CONSTRUCTOR to create an object from a class
	//A method WITH NO RETURN with the SAME name as the class
	
	public CakeTin() {	
		
		//when creating a cake out of the cake tin we need to assign values
		//How do we create other cakes that don't have these values?
		
		this.colour = "Red";
		this.flavour = "Vanilla";
		this.layers = 3;
		this.numberOfCandles = 0;
		this.sprinkles = true;
	}
	
	//Overloading, allows you to create multiple constructors with the same name
	//The difference 
	//......
	
	public CakeTin(String newColour) {	
		
		this.colour = newColour;
		this.flavour = "Vanilla";
		this.layers = 3;
		this.numberOfCandles = 0;
		this.sprinkles = true;
	}
	
	
}
