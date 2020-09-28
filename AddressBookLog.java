package com.bridgelabz.addressbooksystem;

import java.util.*;

public class AddressBookLog {
	static boolean checker = false;
	//ArrayList can contaion only Contact object
	private List<Contact> addressBook = new ArrayList<Contact>();

	//Getters and Setters
	public void setPhoneBook(List<Contact> addressBook){
		this.addressBook = addressBook;
	}
	public List<Contact> getPhoneBook(){
		return addressBook;
	}

	public void addContact(Contact contactObj){
		addressBook.add(contactObj);
	}
	public void editContactDetails(String firstNameEdit){
		//List<Contact> editedContact=new ArrayList<Contact>();
		int i=0;
		for(Contact c:addressBook){
			if((c.getFirstName()).equals(firstNameEdit))
			{
				Contact contactObj=new Contact(c.getFirstName(),c.getLastName(),c.getAddress(),c.getCityName(),c.getZipNumber(),c.getPhoneNumber(),c.getEmailId());
				addressBook.set(i+1, contactObj);
				break;
			}
			i+=1;
		}
	}
	public void deleteContactDetails(String firstNameDelete) {
		int i=0;
		for(Contact c:addressBook){
			if((c.getFirstName()).equals(firstNameDelete))
			{
				addressBook.remove(i+1);
				break;
			}
			i+=1;
		}
	}
	public void printContactDetails() {
		for(Contact c:addressBook){
			System.out.println("First name: "+c.getFirstName()+" Last name: "+c.getLastName()+" Address: "+c.getAddress()+" City Name: "+c.getCityName()+" Zip Number: "+c.getZipNumber()+" Phone Number: "+c.getPhoneNumber()+" Email Id: "+c.getEmailId());
		}
	}
}
