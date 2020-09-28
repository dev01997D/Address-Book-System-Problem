package com.bridgelabz.addressbooksystem;
import java.util.HashMap;

public class AddressBookDict {
	private HashMap<String, Contact> addressBookDict=new HashMap<>();
	
	public void setAddressBookDict(HashMap<String, Contact> addressBookDict) {
		this.addressBookDict=addressBookDict;
	}
	public HashMap<String, Contact> getAddressBookDict(){
		return addressBookDict;
	}
	
	public void addAddressBook(String addressBookName, Contact contactObj) {
		addressBookDict.put(addressBookName, contactObj);
	}

}
