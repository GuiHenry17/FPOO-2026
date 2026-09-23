package br.edu.utfpr.tsi.addressbook.view.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleInput {
	
	private static final
	String DATE_PATTERN = "dd/MM/yyyy";
	
	private static final
	DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	private static final
	String DATE_ERROR_MESSAGE = """
			Data inválida!
			Por favor, tente novamente (formato %s)
			""".formatted(DATE_PATTERN);
	
	private final Scanner scanner;
	
	public String readText(String prompt) {
    	
    	System.out.print(prompt);
    	return scanner.nextLine().trim();
    }
	
    public boolean askConfirmation(String prompt) {

        return readText(prompt).toUpperCase().equals("S");
    }
    
    public LocalDate readDate(String prompt) {
    	
    	while (true) {
    		try {
    		String dateInput = readText(prompt);
    		return LocalDate.parse(dateInput, DATE_FORMATTER);
    	}
    	catch (DateTimeParseException e) {
    		System.out.println(DATE_ERROR_MESSAGE);
    		}
    	}
    }

	public ConsoleInput(Scanner scanner) {
		
		this.scanner = scanner;
	}
	
	
}
