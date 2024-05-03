package com.bankassignment;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount []arr=new BankAccount[3];
		
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the choice..!!!");
			System.out.println("1. Add Account 2.Deposit Money 3.Withdraw Money 4.Display all accounts 5.Total accounts");
			int choice=in.nextInt();
			
			switch(choice)
			{
			case 1:Bankutility.insertAccount(arr);
			break;
			
			case 2:System.out.println("Enter BankAccount No:");
			int accno=in.nextInt();
			System.out.println("Enter Deposit ammount:");
			double amount=in.nextDouble();
			Bankutility.depositAmount(arr, accno, amount);
			break;
			
			case 3:System.out.println("Enter BankAccount no:");
			int accNo=in.nextInt();
			System.out.println("Enter Withdraw amount:");
			double Amount=in.nextDouble();
			Bankutility.withdrawAmount(arr, accNo, Amount);
			
			case 4:Bankutility.displayAccount(arr);
			break;
			
			case 5:Bankutility.totalCount();
			break;
			
			default:
				System.out.println("Invalid Choice..!!!");
		
			}
		
		}
		//scanner.close();
		
		

	}
	

}
