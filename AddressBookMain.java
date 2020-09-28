package com.bridgelabz.addressbooksystem;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Welcome to Address Book Program in AddressBookMain class");
	
	//contact AddressBookLog object
	AddressBookLog addressLogObj=new AddressBookLog();
	
	Scanner sc = new Scanner(System.in);
        System.out.println("Add a Contact:");
        System.out.println("Enter the First Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last Name:");
        String lastName = sc.nextLine();
        System.out.println("Enter the Address");
        String address=sc.nextLine();
        System.out.println("Enter the City Name");
        String cityName=sc.nextLine();
        System.out.println("Enter the Zip Number of Address");
        int zipNumber=sc.nextInt();
        System.out.println("Enter the Phone No:");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the Email:");
        sc.nextLine();
        String emailId = sc.nextLine();
        
        //Object of Contact class
        Contact contactObj=new Contact(firstName,lastName,address,cityName,zipNumber,phoneNumber,emailId);
	}
}
