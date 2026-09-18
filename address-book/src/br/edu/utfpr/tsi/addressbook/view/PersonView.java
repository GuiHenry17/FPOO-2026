package br.edu.utfpr.tsi.addressbook.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.edu.utfpr.tsi.addressbook.control.PersonController;

public class PersonView {

    private Scanner scanner;
    private PersonController controller = null;

    public PersonView(Scanner scanner, PersonController controller) {

        this.scanner = scanner;
        this.controller = controller;
    }

    public void createPerson() {

        System.out.print("Nome: ");
        String firstName = scanner.nextLine();

        System.out.print("Sobrenome: ");
        String lastName = scanner.nextLine();

        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(input, formatter);

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String phone = scanner.nextLine();

        controller.createPerson(firstName, lastName, birthDate, email, phone);
    }

    private boolean shouldContinue(String message) {

        System.out.print(message + " ");
        String answer = scanner.nextLine().trim().toUpperCase();

        return answer.equals("S");
    }

    public void createMultiplePeople() {

        System.out.println("--Cadastro de Pessoas--");

        do {
            createPerson();
        } while (shouldContinue("Deseja cadastrar outra pessoa? (S/N)"));
    }
}
