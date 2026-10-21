package br.edu.utfpr.tsi.addressbook.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.tsi.addressbook.model.Person;

public class PersonFileReader {

	private BufferedReader reader;

	public PersonFileReader(String fileName) throws IOException {
		reader = new BufferedReader(new FileReader(fileName));
	}

	public Person read() throws IOException, ParseException {
		if (reader == null) {
			throw new IllegalStateException("File is not open.");
		}

		String text = reader.readLine();
		if (text == null) {
			return null;
		}

		return Person.parse(text);
	}

	public void close() throws IOException {
			reader.close();
	}
	
	public List<Person> readAll() throws IOException, ParseException {
		
		var list = new ArrayList<Person>();
		String line;
		while ((line = reader.readLine()) != null) {
			list.add(Person.parse(line));
		}
		return list;
	}

	/* Test only */
	public static void main(String[] args) throws IOException, ParseException {
		
		String fileName = "./data/person.txt";
		
		PersonFileReader personReader = new PersonFileReader(fileName);
		Person person = personReader.read();
		System.out.print(person);
		personReader.close();
		
		personReader = new PersonFileReader(fileName);
		List<Person> list = personReader.readAll();
		System.out.println(list);
		personReader.close();
	}
}
