package com.SpringCoreAsssignment4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.SpringCoreAsssignment4.Dto.BankCardDTO;
public class App {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    
	ApplicationContext springAppCtx = new ClassPathXmlApplicationContext("config4.xml");
BankCardDTO bankCardDto = (BankCardDTO) springAppCtx.getBean("bcController");
bankCardDto.setBankName("State Bank of India");
bankCardDto.setCardNumber("1234556");
bankCardDto.setCreateDate("2022/06/02");
System.out.println(bankCardDto.toString());

  //createBankCard("Bank Of China", "BOC888888", "2017/08/08");
  }
}
