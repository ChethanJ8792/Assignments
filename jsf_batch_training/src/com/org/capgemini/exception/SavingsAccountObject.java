package com.org.capgemini.exception;

public class SavingsAccountObject {

	long id;
	double balance=10000;
	public static void main(String[] args) {
		SavingsAccountObject sao=new SavingsAccountObject();
		//sao.withdraw(10);
		System.out.println(sao.withdraw(1000));
		System.out.println(sao.deposit(-100));
	}
	double withdraw(double amount) 
	{
		
		try {
		if(amount>balance)
		{
			throw new InsufficientBalanceException("ShedeMundede Asth Duddilla");
		}
		}catch(InsufficientBalanceException e)
		{
			e.printStackTrace();
			//e.getMessage();
		}
		return balance;
	
	}
	double deposit(double amount)
	{
		
		try {
			if(amount==-100)
			{
				
				throw new IllegalBankTransactionException("Correct Agi Bariyappa");
			}
		}catch(IllegalBankTransactionException il)
		{
			System.out.println(il.getMessage());
		}
		return amount;
	}
}
