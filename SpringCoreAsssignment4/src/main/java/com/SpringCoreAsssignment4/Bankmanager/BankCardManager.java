package com.SpringCoreAsssignment4.Bankmanager;

import com.SpringCoreAsssignment4.Dto.BankCardDTO;

public interface BankCardManager {
	  public BankCardDTO createBankCard(String bankName, String cardNumber, String createDate);

}
