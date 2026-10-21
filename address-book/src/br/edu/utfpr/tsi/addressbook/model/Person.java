package br.edu.utfpr.tsi.addressbook.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.text.ParseException;
import java.time.format.DateTimeParseException;

import br.edu.utfpr.tsi.addressbook.model.Address;

public class Person {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String email;
	private String phone;
	private Address address;
	
	
	

	public Person() {
		
		this.firstName = "";
		this.lastName  = "";
		this.birthDate = LocalDate.now();
		this.email     = "";
		this.phone     = "";
		this.address = new Address();
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder()
				.append("Person{")
				.append(getFirstName())
				.append(",")
				.append(getLastName())
				.append(",")
				.append(getBirthDate().toString())
				.append(",")
				.append(getEmail())
				.append(",")
				.append(getPhone());
		
		if (address != null) {
			sb.append(",")
			.append(getAddress().toString());
		}
		return sb.append("}").toString();
				
		
		
	}
	
	public static Person parse(String originalText) throws ParseException {
		
		if (originalText == null) 
			throw new ParseException("Input text cannot be null.",0);
		
		String text = originalText.trim();
		if(!text.startsWith("Person{") || !text.endsWith("}"))
			throw new ParseException("Input text should start with 'Person{' and end with '}'", 0);
		
		String addressPart = "";
		int addressStart = text.indexOf("Address{");
		int addressEnd   = text.indexOf("}", addressStart) +1;
		if(addressStart > 0 )
			addressPart = text.substring(addressStart, addressEnd);
		var address = (addressPart.isBlank()) ? null : Address.parse(addressPart);
		
		String personData = text.substring("Person{".length(), addressStart-1);
		String[] values = personData.split(",",-1);
		if(values.length != 5)
			throw new ParseException("Invalid number of fields, expected 5, found " + values.length, 0);
		
		try {
			Person person = new Person(values[0], values[1], LocalDate.parse(values[2]), values[3], values[4]);
			person.setAddress(address);
			return person;
		}
		catch (DateTimeException e) {
			throw new ParseException("Invalid BirthDate: '"+values[2]+"'",0);
		}
		
	}

	
}



