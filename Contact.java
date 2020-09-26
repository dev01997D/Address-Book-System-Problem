package com.bridgelabz.addressbooksystem;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private int zipNumber;
	private long phoneNumber;
	private String emailId;

	//Parametrized Constructor
	public Contact(String firstName, String lastName, String address, String cityName, int zipNumber, long phoneNumber, String emailId) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.cityName=cityName;
		this.zipNumber=zipNumber;
		this.phoneNumber=phoneNumber;
		this.emailId=emailId;
	}
}
