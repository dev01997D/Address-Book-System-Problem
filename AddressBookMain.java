package com.bridgelabz.addressbooksystem;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book Program in AddressBookMain class");

		//contact AddressBookLog object
		AddressBookLog addressLogObj=new AddressBookLog();
		
		//Variables
		int zipNumber;
		String firstName, lastName,address,cityName,emailId;
		long phoneNumber;
		char choice=' ';

		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Add a Contact:");
		System.out.println("Enter the First Name:");
		firstName = sc.nextLine();
		System.out.println("Enter the Last Name:");
		lastName = sc.nextLine();
		System.out.println("Enter the Address");
		address=sc.nextLine();
		System.out.println("Enter the City Name");
		cityName=sc.nextLine();
		System.out.println("Enter the Zip Number of Address");
		zipNumber=sc.nextInt();
		System.out.println("Enter the Phone No:");
		phoneNumber = sc.nextLong();
		System.out.println("Enter the Email:");
		sc.nextLine();
		emailId = sc.nextLine();
		
		//Object of Contact class
		Contact contactObj=new Contact(firstName,lastName,address,cityName,zipNumber,phoneNumber,emailId);
		//Invoking addContact method in AddressBookLog
		addressLogObj.addContact(contactObj);
		
		System.out.println("Do you want to enter another contact details, Enter 'Y' for yes and 'N' for not.");
		choice=sc.next().charAt(0);	
		sc.nextLine();
		}
		while(choice=='y' || choice=='Y');

	}
}
