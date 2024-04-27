package com.fruitbasket;

public abstract class Fruit {
	private String colour;
	private double weight;
	private String name;
	protected static int count=0;
	boolean fresh=false;
	
	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public Fruit(String colour,double weight,String name)
	{
		count++;
		this.colour=colour;
		this.weight=weight;
		this.name=name;
		this.fresh=true;
	}

	public String toString()
	{
		return "Colour:"+this.colour+" Weight:"+this.weight+" Name:"+this.name+"Fresh:"+this.fresh;
	}
	public abstract String taste();
	
//	public static void count()
//	{
//		count++;
//	}
//	
}
