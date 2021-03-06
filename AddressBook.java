package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;

public class AddressBook {

	private ArrayList<Contact> addressBook = new ArrayList<Contact>();

	public ArrayList<Contact> getAddressBook() {
		return this.addressBook;
	}

	public void setAddressBook(ArrayList<Contact> addressBook) {
		this.addressBook = addressBook;
	}

	public void addContactToAddressBook(Contact contact) {
		addressBook.add(contact);
	}

	public Contact editContact(String firstName, String lastName) {
		Contact contactSearch = null;
		for (Contact contact : addressBook) {
			if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
				contactSearch = contact;
				break;
			}
		}

		return contactSearch;
	}

	public boolean removeContact(String firstName, String lastName) {
		boolean remove = false;
		for (Contact contact : addressBook) {
			if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
				addressBook.remove(contact);
				remove = true;
				break;
			}
		}
		return remove;
	}

	public boolean checkDuplicateContact(String firstName, String lastName) {
		boolean duplicate = false;
		for (Contact c : addressBook) {
			if ((c.getFirstName()).equals(firstName) && (c.getLastName()).equals(lastName)) {
				duplicate = true;
				break;
			}
		}
		return duplicate;
	}

	public void searchContactDetails(String firstNameSearch, String lastNameSearch) {
		boolean search = false;
		for (Contact contact : addressBook) {
			if (contact.getFirstName().equals(firstNameSearch) && contact.getLastName().equals(lastNameSearch)) {
				System.out.println("The Details of the Contact are given Below:");
				System.out.println("First name: " + contact.getFirstName() + " Last name: " + contact.getLastName()
						+ " Address: " + contact.getAddress() + " City Name: " + contact.getCityName() + " Zip Number: "
						+ contact.getZipNumber() + " Phone Number: " + contact.getPhoneNumber() + " Email Id: "
						+ contact.getEmailId());
				search = true;
				break;
			}
		}
		if (search == false)
			System.out.println("No contact details found with these Details");
	}

	public void veiwPersonsByCityName(String cityNameView) {
		ArrayList<Contact> cityList = new ArrayList<>();
		for (Contact contact : addressBook) {
			if (contact.getCityName().equals(cityNameView)) {
				cityList.add(contact);
			}
		}
		if (cityList.isEmpty()) {
			System.out.println("No Persons Details found for the Given City Name.");
		} else {
			for (Contact c : cityList) {
				System.out.println("The Details of the Contact of city : " + c.getCityName() + "are given Below:");
				System.out.println("First name: " + c.getFirstName() + " Last name: " + c.getLastName() + " Address: "
						+ c.getAddress() + " City Name: " + c.getCityName() + " Zip Number: " + c.getZipNumber()
						+ " Phone Number: " + c.getPhoneNumber() + " Email Id: " + c.getEmailId());
			}
		}
	}

	public void countNumberOfContactsByCity(String cityNameContactCount) {
		int count=0;
		for (Contact contact : addressBook) {
			if(contact.getCityName().equalsIgnoreCase(cityNameContactCount))
				count++;
		}
		if (count!=0)
			System.out.println("No contact detail from the given city found!");
		else
			System.out.println("Number of contacts from the Given City are : "+count);
	}
	
	public void printContactDetails() {
		if (addressBook.isEmpty()) {
			System.out.println("No details has been added till Now. Please add some details first!");
		} else {
			for (Contact c : addressBook) {
				System.out.println("First name: " + c.getFirstName() + " Last name: " + c.getLastName() + " Address: "
						+ c.getAddress() + " City Name: " + c.getCityName() + " Zip Number: " + c.getZipNumber()
						+ " Phone Number: " + c.getPhoneNumber() + " Email Id: " + c.getEmailId());
			}
		}
	}

}
