package com.SpringCoreAsssignment4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.SpringCoreAsssignment4.Bankmanager.BankCardManager;
import com.SpringCoreAsssignment4.Dto.BankCardDTO;

@Controller("bcController")
public class BankCardController {
	
	   @Autowired
	    private BankCardManager bcManager;
	    
	   @Bean
	    public BankCardDTO createBankCard(String bankName, String cardNumber, String createDate)
	    {
	        return this.bcManager.createBankCard(bankName, cardNumber, createDate);
	    }

}
