package com.bridgelabz.AddressBook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	static ArrayList<Contact> contactList = new ArrayList<>(); 
	Scanner sc = new Scanner(System.in);
	
	
	public void addContact()
	{
	Contact contact = new Contact();
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
	
	public void editContact()
	{
		System.out.println("Enter the name of the Person to update the contact details");
		String name = sc.next();
	    for (int i = 0 ; i < contactList.size() ; i++) {
	    Contact contact = contactList.get(i);
	     if (name.equals(contact.getFirstName())) 
	       {
   	    System.out.println("Enter choise to edit :\n 1.firstName \n 2.lastName \n 3.address \n 4.city \n 5.state  \n 6.zip \n 7.phoneNo \n 8.email ");
       	int choise = sc.nextInt();
	    switch (choise) {
	           	case 1: 
		            	System.out.println("Enter First Name");
		                 String firstName = sc.next();
		                 contact.setFirstName(firstName);
		                 break;
		            case 2:
		                 System.out.println("Enter Last Name");
		                 String lastName = sc.next();
		                 contact.setLastName(lastName);
		                 break;
		            case 3:
			             System.out.println("Enter Address");
		                 String address =  sc.next();
		                 contact.setAddress(address);
		                 break;
		            case 4:
		                 System.out.println("Enter City");
		                 String city = sc.next();
		                 contact.setCity(city);
		                 break;
		            case 5:
		                 System.out.println("Enter State");
		                 String state = sc.next();
		                 contact.setState(state);
		                 break;
		            case 6:
		                 System.out.println("Enter ZIP Code");
		                 String zip = sc.next();
		                 contact.setZip(zip);
		             	break;
		            case 7:
		                 System.out.println("Enter your phone number");
		                 String phoneNo = sc.next();
		                 contact.setPhoneNo(phoneNo);
		                 break;
		            case 8:
		                 System.out.println("Enter Email ID");
		                 String email = sc.next();
		                 contact.setEmail(email);
		                 break;
		           
	           	}
	               System.out.println("Contact Updated in the Address Book");
	          }
	    	
	       }
	       
	   }  
	   
	public void deleteContact()
	   {		  
		System.out.println("Enter the name of the Person to Delete the contact details");
	    String name = sc.next();
	    for (int i = 0; i < contactList.size(); i++) {
		Contact contacts = contactList.get(i);
		if (name.equals(contacts.getFirstName())) 
		{	
			contactList.remove(i);
			System.out.println("Deleted Successfully!");
		}
		else
			System.out.println("contact is not exist !");
		}
	   }
}
