package com.fruitbasket;

public class Apple extends Fruit {
	public Apple(String colour,double weight,String name)
	{
		super(colour,weight,name);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void jam()
	{
		System.out.println("Apple jam extracted");
	}
	@Override
	public String taste()
	{
		return "Taste of Apple is sweet n sour";
	}

}

