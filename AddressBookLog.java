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
	
}
