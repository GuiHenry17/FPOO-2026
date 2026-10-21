package br.edu.utfpr.tsi.addressbook.model;

import java.text.ParseException;

public class Address {
	
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;
	
	
	public Address() {
		
		this.street       = "";
		this.number       = "";
		this.complement   = "";
		this.neighborhood = "";
		this.city         = "";
		this.state        = "";
	}
	
	public Address(String street, String number, String complement, 
			       String neighborhood, String city, String state) {
		
		this.street       = street;
		this.number       = number;
		this.complement   = complement;
		this.neighborhood = neighborhood;
		this.city         = city;
		this.state        = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
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

	@Override
	public String toString() {
		
		return new StringBuilder()
				.append("Address{")
				.append(getStreet())
				.append(",")
				.append(getNumber())
				.append(",")
				.append(getComplement())
				.append(",")
				.append(getNeighborhood())
				.append(",")
				.append(getCity())
				.append(",")
				.append(getState())
				.append("}")
				.toString();
	}
	
	
	public static Address parse(String text) throws ParseException{
		
		return null;
	}

	
	
	
	
}



