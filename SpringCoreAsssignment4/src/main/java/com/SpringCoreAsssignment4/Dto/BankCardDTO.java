package com.SpringCoreAsssignment4.Dto;
public class BankCardDTO {
	private String bankName;
	private String cardNumber;
	private String createDate;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	@Override
	public String toString() {
		return "BankCardDTO [bankName=" + bankName + ", cardNumber=" + cardNumber + ", createDate=" + createDate + "]";
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCreateDate() {
		return  createDate;
	}
	public void setCreateDate(String  createDate) {
		this. createDate =  createDate;
	}
}



