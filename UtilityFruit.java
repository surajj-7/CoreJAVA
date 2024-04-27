package com.fruitbasket;

import java.util.Scanner;

public class UtilityFruit  {
	
	public static void addFruit(Fruit [] basket)
	{
		Scanner in=new Scanner(System.in);
		
			System.out.println("Enter 1.Mango 2.Orange 3.Apple");
			int choice=in.nextInt();
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the colour");
				String colour=in.next();
				System.out.println("Enter the weight");
				double weight=in.nextDouble();
				System.out.println("Enter the name");
				String name=in.next();
				
				basket[Fruit.count]=new Mango(colour,weight,name);
				break;
	
			case 2:System.out.println("Enter the colour");
				String clr=in.next();
				System.out.println("Enter the weight");
				double wgt=in.nextDouble();
				System.out.println("Enter the name");
				String nm=in.next();
				
				basket[Fruit.count]=new Orange(clr,wgt,nm);
				break;
			
			case 3:System.out.println("Enter the colour");
				String clor=in.next();
				System.out.println("Enter the weight");
				double wght=in.nextDouble();
				System.out.println("Enter the name");
				String nme=in.next();
				
				basket[Fruit.count]=new Apple(clor,wght,nme);
				
				break;
			
			default: 
				return;
			
			}
			//in.close();
			
			
		
	}
	
	public static void displayFruit(Fruit[]basket)
	{
		for(int i=0;i<Fruit.count;i++)
		{
			System.out.println(basket[i]);
			basket[i].taste();
			if(basket[i] instanceof Mango)
			{
				((Mango)basket[i]).pulp();
			}
			
			if(basket[i] instanceof Orange)
			{
				((Orange)basket[i]).juice();
			}
			
			if(basket[i] instanceof Apple)
			{
				((Apple)basket[i]).jam();
			}
		
		}
	}
	
	public static void checkStatus(Fruit[] basket)
	{
		for(Fruit f:basket)
		{
			if(f != null)
			{
				if(f.taste().equalsIgnoreCase("sour"))
				{
					f.setFresh(false);
				}
			}
		}
	}

	

}

