package com.bridgelabz.AddressBook;

public class Contact {
	
	private String firstName; 
	private String lastName; 
	private String address; 
	private String city ;
	private String state ;
	private String email ;
	private String phoneNo; 
	private String zip ;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	 public String toString() {
        return "*************************************\n"+
        		"First Name : " + firstName + "\n"
        		+ " Last Name : " + lastName + "\n "
        		+ "Phone Number : " + phoneNo + "\n"
        		+ " email ID : " + email + "\n"
        		+ " address :  " + address + "\n"
        		+ " City : " + city + "\n"
        		+ " State : " + state + "\n"
        		+ " Zipcode : " + zip + "\n";
    	}
	}
