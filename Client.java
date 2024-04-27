package com.fruitbasket;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		
		Fruit[] basket=new Fruit[4];
		
		//int choice=in.nextInt();
		
		
		while(true)
		{
			System.out.println("MAIN MENU---------------");
			System.out.println("1. Create and accept fruit objects");
			System.out.println("2. Display fruit ");
			System.out.println("3. Check Stale or not! ");
			System.out.println("Enter the choice");
			int choice=in.nextInt();
		switch(choice)
		{
		case 1:UtilityFruit.addFruit(basket);break;
		case 2:UtilityFruit.displayFruit(basket); break;
		case 3:UtilityFruit.checkStatus(basket); break;
		default:return;
		}
		
		}
	}

}
