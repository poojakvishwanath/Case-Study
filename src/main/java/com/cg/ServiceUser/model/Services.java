package com.cg.ServiceUser.model;

import java.util.Date;

public class Services {

	private String carWash;
	private String carWipe;
	private String cleanAndDress;
	private Date scheduledCarWash;
	
	public String getCarWash() {
		return carWash;
	}
	public void setCarWash(String carWash) {
		this.carWash = carWash;
	}
	public String getCarWipe() {
		return carWipe;
	}
	public void setCarWipe(String carWipe) {
		this.carWipe = carWipe;
	}
	public String getCleanAndDress() {
		return cleanAndDress;
	}
	public void setCleanAndDress(String cleanAndDress) {
		this.cleanAndDress = cleanAndDress;
	}
	public Date getScheduledCarWash() {
		return scheduledCarWash;
	}
	public void setScheduledCarWash(Date scheduledCarWash) {
		this.scheduledCarWash = scheduledCarWash;
	}
	public Services(String carWash, String carWipe, String cleanAndDress, Date scheduledCarWash) {
		super();
		this.carWash = carWash;
		this.carWipe = carWipe;
		this.cleanAndDress = cleanAndDress;
		this.scheduledCarWash = scheduledCarWash;
	}
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
