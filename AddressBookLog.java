package com.bridgelabz.addressbooksystem;

import java.util.*;

public class AddressBookLog {
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
}
