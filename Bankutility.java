package com.bankassignment;

import java.util.Scanner;

public class Bankutility {
	
	static void insertAccount(BankAccount []arr)
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter name:");
			String name=in.next();
			System.out.println("Enter balance:");
			double balance=in.nextDouble();
			
			arr[i]=new BankAccount(name,balance);
		}
		
	}
	
	static void displayAccount(BankAccount []arr) {
		for(int i=0;i<arr.length;i++)
		{
			arr[i].displayAccDetails();
		}
	}
	
	static void depositAmount(BankAccount []arr,int accId,double amt)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getAccId()==accId)
			{
				arr[i].deposit(amt);
			}
		}
	}
	
	static void withdrawAmount(BankAccount []arr,int accId,double amt)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getAccId()==accId)
			{
				arr[i].withdraw(amt);
			}
		}
	}
	
	static void totalCount()
	{
		System.out.println("Total BankAccount:"+BankAccount.TotalAcc());
	}

}
