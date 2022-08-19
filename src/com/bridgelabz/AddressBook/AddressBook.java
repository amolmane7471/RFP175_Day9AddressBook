package com.bridgelabz.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
	static ArrayList<Contact> contactList = new ArrayList<>(); 
	Scanner sc = new Scanner(System.in);
	Contact contact = new Contact();
	
	public void addContact()
	{
		System.out.println("enter first name");
    	contact.setFirstName(sc.next());
    	System.out.println("enter last name");
    	contact.setLastName(sc.next());
    	System.out.println("enter address");
    	contact.setAddress(sc.next());
    	System.out.println("enter city");
    	contact.setCity(sc.next());
    	System.out.println("enter state");
    	contact.setState(sc.next());
    	System.out.println("enter email");
    	contact.setEmail(sc.next());
    	System.out.println("enter phone number");
    	contact.setPhoneNo(sc.next());
    	System.out.println("enter Zip");
    	contact.setZip(sc.next());
    	contactList.add(contact);
	}
	
	public void displayContact()
	{
		System.out.println(contactList);
	}
}
