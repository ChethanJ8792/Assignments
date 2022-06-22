package com.SpringCoreAsssignment4.Dao;

import org.springframework.stereotype.Repository;
import com.SpringCoreAsssignment4.Dto.BankCardDTO;

@Repository("abc")
public class BankCardDAOImpl implements BankCardDao {

	@Override
	public BankCardDTO insertBankCard(String bankName, String cardNumber, String createDate) {
		// TODO Auto-generated method stub
		 BankCardDTO ret = new BankCardDTO();
	        ret.setBankName(bankName);
	        ret.setCardNumber(cardNumber);
	        ret.setCreateDate(createDate);
	        
	        System.out.println("Bank card has been inserted by BankCardDAOImpl. Bank name : " + bankName + " , card number : " + cardNumber + " , create date : " + createDate);
	        return ret;
	}
	 
}
