package com.cg.ServiceUser.model;

import java.util.Arrays;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
@Document(collection="Services")

public class Services {

	private String[] washServices;
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date scheduledCarWash;


	public Services(String[] washServices, Date scheduledCarWash) {
		super();
		this.washServices = washServices;
		this.scheduledCarWash = scheduledCarWash;
	}


	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Services [washServices=" + Arrays.toString(washServices) + ", scheduledCarWash=" + scheduledCarWash
				+ "]";
	}








}
