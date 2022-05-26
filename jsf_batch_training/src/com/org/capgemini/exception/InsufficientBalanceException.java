package com.org.capgemini.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Throwable
{
	

	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
	
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception
{
	IllegalBankTransactionException(String m)
	{
		super(m);
	}
	
}

