package com.fruitbasket;

public class Orange extends Fruit {
	public Orange(String colour,double weight,String name)
	{
		super(colour,weight,name);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void juice()
	{
		System.out.println("Orange juice extracted");
	}
	@Override
	public String taste()
	{
		
		return "sour";
		
		
	}

}

