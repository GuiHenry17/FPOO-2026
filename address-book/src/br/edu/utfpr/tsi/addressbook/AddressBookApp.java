package br.edu.utfpr.tsi.addressbook;

import java.util.Scanner;

import br.edu.utfpr.tsi.addressbook.control.PersonController;
import br.edu.utfpr.tsi.addressbook.view.PersonView;

public class AddressBookApp {

    private Scanner scanner;

    private PersonView personView;
    private PersonController personController;

    public AddressBookApp() {

        this.scanner = new Scanner(System.in);
        this.personController = new PersonController();
        this.personView = new PersonView(scanner, personController);
    }

    private void showWelcomeMessage() {

        System.out.println("""
                ========================================
                Address Book Application - UTFPR/TSI
                ========================================
                """);
    }

    private void showGoodbyeMessage() {

        System.out.println("E N D.");
    }

    public void run() {

        showWelcomeMessage();
        personView.createMultiplePeople();
        showGoodbyeMessage();
    }

    public static void main(String[] args) {

        (new AddressBookApp()).run();
    }
}
