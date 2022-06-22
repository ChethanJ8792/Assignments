package com.SpringCoreAsssignment4.Bankmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringCoreAsssignment4.Dao.BankCardDao;
import com.SpringCoreAsssignment4.Dto.BankCardDTO;

@Service("bcManager")
public class BankCardManagerImpll implements BankCardManager{
	@Autowired
	private BankCardDao bankCardDao;
	
    @Override
    public BankCardDTO createBankCard(String bankName, String cardNumber, String createDate) {
        
        System.out.println("Bank card has been created by BankCardManagerImpl. Bank name : " + bankName + " , card number : " + cardNumber + " , create date : " + createDate);
        return this.bankCardDao.insertBankCard(bankName, cardNumber, createDate);
}
}
