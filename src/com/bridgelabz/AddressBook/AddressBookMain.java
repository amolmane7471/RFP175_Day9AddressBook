package com.bridgelabz.AddressBook;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	System.out.println("Welcome To AddressBook System \n");
		AddressBook addressbook = new AddressBook();
		
		while(true)
		{
			System.out.println("Enter a choice : \n 1.AddContact \n 2.DisplayContact \n 3.EditContact \n 4.DeleteContact \n 5.exit");
		int choice = sc.nextInt();
		switch(choice) 
		{	
		case 1: 
			addressbook.addContact();
			break;
		case 2:
			addressbook.displayContact();
			break;
		case 3:
			addressbook.editContact();
			break;
		case 4:
			addressbook.deleteContact();
			break;
		case 5:
			System.exit(0);
		default :
			System.out.println("enter a correct choice!");
		}
		}
	}

}
