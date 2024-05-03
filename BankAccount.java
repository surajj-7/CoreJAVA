package com.bankassignment;

public class BankAccount {
	private static int count=0;
	private int accId;
	private String aname;
	private double balance;
	
	public BankAccount(String aname,double balance)
	{
		this.accId=++count;
		this.aname=aname;
		this.balance=balance;
	}

	
	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amt)
	{
		this.balance+=amt;
	}
	
	public void withdraw(double amt)
	{
		if(amt>this.balance)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			this.balance-=amt;
		}
		
	}
	public void displayAccDetails()
	{
		System.out.println("AccId:"+accId+" Account_holders_name:"+aname+" Balance:"+balance);
	}
	
	public static int TotalAcc() {
		return count;
	}
	


}
