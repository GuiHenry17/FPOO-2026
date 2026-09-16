package br.edu.utfpr.tsi.addressbook.model;

import java.time.LocalDate;

public class Person {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String email;
	private String phone;
	
	
	public Person() {
		
		this.firstName = "";
		this.lastName  = "";
		this.birthDate = LocalDate.now();
		this.email     = "";
		this.phone     = "";
	}
	
	public Person(String firstName, String lastName, LocalDate birthDate) {
		
		this(); // chama/invoca o construtor padrão
		this.firstName = firstName;
		this.lastName  = lastName;
		this.birthDate = birthDate;
	}
	
	public Person(String firstName, String lastName, LocalDate birthDate, 
				  String email, String phone) {
		
		this(firstName, lastName, birthDate);//chama o construtor parcial
		this.email = email;
		this.phone = phone;
	}
	

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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}



