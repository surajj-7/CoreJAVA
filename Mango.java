package com.fruitbasket;

public class Mango extends Fruit {
	public Mango(String colour,double weight,String name)
	{
		super(colour,weight,name);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void pulp()
	{
		System.out.println("Mango pulp extracted");
	}
	
	@Override
	public String taste()
	{
		return "Taste of mango is sweet";
	}

}
