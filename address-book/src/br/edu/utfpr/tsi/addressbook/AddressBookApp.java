package br.edu.utfpr.tsi.addressbook;

import java.util.Scanner;

import br.edu.utfpr.tsi.addressbook.control.PersonController;
import br.edu.utfpr.tsi.addressbook.view.PersonView;
import br.edu.utfpr.tsi.addressbook.view.menu.Menu;
import br.edu.utfpr.tsi.addressbook.view.util.ConsoleInput;

public class AddressBookApp {

    private Scanner scanner;

    private ConsoleInput console;
    private PersonView personView;
    private PersonController personController;
    private Menu personMenu;

    public AddressBookApp() {

        this.scanner = new Scanner(System.in);
        this.console = new ConsoleInput(scanner);
        this.personController = new PersonController();
        this.personView = new PersonView(console, personController);
        this.personMenu = createPersonMenu();
    }

    private void showWelcomeMessage() {

        System.out.println("""
                ==========================================
                   Address Book Application - UTFPR/TSI   
                ==========================================
                """);
    }

    private void showGoodbyeMessage() {

        System.out.println("E N D.");
    }

    public void run() {

        showWelcomeMessage();
        personMenu.run();
        showGoodbyeMessage();
    }

    public static void main(String[] args) {

        (new AddressBookApp()).run();
    }
    
    private Menu createPersonMenu() {
		
		return new Menu("CONTATOS", 50, console)
				.addMenuItem("Adicionar Contato", () -> personView.registerPerson())
				.addMenuItem("Adicionar Multiplos Contatos", ()->personView.registerMultiplePersons())
				.addMenuItem("Listar Todos", ()->personView.showAll())
				.addMenuItem("Listar Ordenado por nome", ()->personView.showAllSortedByName());
	}
    
     
}
