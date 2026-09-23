package br.edu.utfpr.tsi.addressbook.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import br.edu.utfpr.tsi.addressbook.control.PersonController;
import br.edu.utfpr.tsi.addressbook.view.util.ConsoleInput;

public class PersonView {

	private ConsoleInput console;
    private PersonController controller = null;

    public PersonView(ConsoleInput console, PersonController controller) {

        this.console    = console;
        this.controller = controller;
    }
    
    

    public void registerPerson() {

        String firstName    = console.readText("Nome: ");
        String lastName     = console.readText("Sobrenome: ");
        LocalDate birthDate = console.readDate("Data de nascimento: ");
        String email        = console.readText("Email: ");
        String phone        = console.readText("Telefone: ");

        controller.createPerson(firstName, lastName, birthDate, email, phone);
    }


    public void registerMultiplePersons() {

        System.out.println("--Cadastro de Pessoas--");

        do {
            registerPerson();
        } while (console.askConfirmation("Deseja cadastrar outra pessoa? (S/N)"));
    }
    

}
