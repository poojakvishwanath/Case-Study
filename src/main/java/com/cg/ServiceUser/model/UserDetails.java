package com.cg.ServiceUser.model;

import java.util.Date;

import org.springframework.data.annotation.Id;




public class UserDetails {

	@Id
	private long cardNumber;
	private String accountName;
	private Date validityDate;
	private int cvvNumber;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Date getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	
	public UserDetails(long cardNumber, String accountName, Date validityDate, int cvvNumber, String loationAddress,
			String carNumber) {
		super();
		this.cardNumber = cardNumber;
		this.accountName = accountName;
		this.validityDate = validityDate;
		this.cvvNumber = cvvNumber;
		this.loationAddress = loationAddress;
		this.carNumber = carNumber;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String loationAddress;
	private String carNumber;
	public String getLoationAddress() {
		return loationAddress;
	}
	public void setLoationAddress(String loationAddress) {
		this.loationAddress = loationAddress;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
}
