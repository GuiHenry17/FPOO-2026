package br.edu.utfpr.tsi.addressbook.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import br.edu.utfpr.tsi.addressbook.model.Address;
import br.edu.utfpr.tsi.addressbook.model.Person;

public class PersonFileWriter {
	
	private BufferedWriter writer;
	
	public PersonFileWriter(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		writer = new BufferedWriter(new FileWriter(file, file.exists()));
	}
	
	public void write(Person person) throws IOException {
		
		if (writer == null) {
			throw new IllegalStateException("File is not open.");
		}
		writer.write(person.toString());
		writer.newLine();
		writer.flush();
	}
	
	public void close() throws IOException {
		
		if(writer != null) {
			writer.close();
		}
	}
	
	
	/* TEST ONLY */
	public static void main (String[] args) throws IOException {
		
		Person person = new Person(
				"Joaquim",
				"da Silva Santo",
				LocalDate.of(1965, 05, 23),
				"joaquimSantos@gmail.com",
				"+55 45 9 9987-2345");
		person.setAddress(new Address(
				"Rua florinda", "122", "Bairro Planalto", "Toledo", "Pr", "casa"));
		
		PersonFileWriter personWriter = new PersonFileWriter("./data/person.txt");
		personWriter.write(person);
		personWriter.close();
	}
}
