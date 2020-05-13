package com.cg.ServiceUser.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document(collection="UserDetails")
public class UserDetails {

	@Id
	private long cardNumber;
	@NotEmpty(message="Shouldn't be empty")
	private String accountName;
	@JsonFormat(pattern="dd-MM-yyyy")
	private String validityDate;
	@NotEmpty(message="Shouldn't be empty")
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
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}
	public int getCvvNumber() {
		return cvvNumber;
	}
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
	
	public UserDetails(long cardNumber, String accountName, String validityDate, int cvvNumber, String loationAddress,
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
	
	@NotEmpty(message="Shouldn't be empty")
	private String loationAddress;
	@NotEmpty(message="Shouldn't be empty")
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
	@Override
	public String toString() {
		return "UserDetails [cardNumber=" + cardNumber + ", accountName=" + accountName + ", validityDate="
				+ validityDate + ", cvvNumber=" + cvvNumber + ", loationAddress=" + loationAddress + ", carNumber="
				+ carNumber + "]";
	}
	
	
}
