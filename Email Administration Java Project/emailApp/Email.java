package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapcity;
	private String email;
	private String alternateEmail;
	private String companySuffix ="jadhav.com";
	private int defaultPasswordLength=10;
	
	
	//Constructor to receive the first and last name
	
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created:"+this.firstname+" "+this.lastname);
		
		//call a private method to ask for department - return the department
		System.out.println("In Which Department You Are:");
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
		//call to a method giving random password
		this.password = randomPassword(this.defaultPasswordLength);
		System.out.println("Your Password: "+this.password);
		
		this.email = firstname.toLowerCase()+"."+lastname.toLowerCase()+
				"@"+department.toLowerCase()+"."+
						companySuffix;
		System.out.println("Your Email ID: "+this.email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for"
				+ " Accounting\n0 for None\nEnter the Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		switch(depChoice) {
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		default: return "";
		}
		
		 
		
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&";
		char[] password = new char[length];
		for(int i=0;i<=length-1;i++) {
			int r =(int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(r);
		}
		//Here we cann't send directly because passowrd is char[] array:
		//and return type is String.
		return new String(password);
	}
	//Set the mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapcity = capacity;
	}
	//Set the alternate email
	public void setAlternateEmail(String email) {
		this.alternateEmail = email;
	}
	
	public void setPassword(String pas) {
		this.password = pas;
	}
	//show data:
	public int getMailBoxCapacity() {return this.mailboxCapcity;}
	public String getAlternateEmail() {return this.alternateEmail;}
	public String getPassword() {return this.password;}
	
	public String displayInfo() {
		return "Name: "+firstname+" "+lastname+
				"\nPassword: "+password+
				"\nAlternate Email: "+alternateEmail+
				"\nMail Capacity: "+mailboxCapcity+" MB"+
				"\nDepartment: "+ department;
	}
	
	}
