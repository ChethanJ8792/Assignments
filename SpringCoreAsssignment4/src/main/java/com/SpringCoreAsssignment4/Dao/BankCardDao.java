package com.SpringCoreAsssignment4.Dao;

import com.SpringCoreAsssignment4.Dto.BankCardDTO;

public interface BankCardDao {
	//abstract method
	 public BankCardDTO insertBankCard(String bankName, String cardNumber, String createDate);
}
