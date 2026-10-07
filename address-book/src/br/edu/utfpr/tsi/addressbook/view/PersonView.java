package br.edu.utfpr.tsi.addressbook.view;
import br.edu.utfpr.tsi.addressbook.view.AddressView;

import java.time.LocalDate;
import java.util.List;

import br.edu.utfpr.tsi.addressbook.control.PersonController;
import br.edu.utfpr.tsi.addressbook.model.Address;
import br.edu.utfpr.tsi.addressbook.model.Person;
import br.edu.utfpr.tsi.addressbook.view.util.ConsoleInput;

public class PersonView {

	private ConsoleInput console;
    private PersonController controller = null;
    private AddressView addressView;

    public PersonView(ConsoleInput console, PersonController controller) {

        this.console    = console;
        this.controller = controller;
        this.addressView = new AddressView(console);
    }
    
    

    public void registerPerson() {

        String firstName    = console.readText("Nome: ");
        String lastName     = console.readText("Sobrenome: ");
        LocalDate birthDate = console.readDate("Data de nascimento: ");
        String email        = console.readText("Email: ");
        String phone        = console.readText("Telefone: ");
        
		Address address = addressView.readAddress();

        controller.createPerson(firstName, lastName, birthDate, email, phone, address);
    }

    public void showPerson(Person person) {

        System.out.println("\n-- Pessoa cadastrada --");
        System.out.println("Nome: " + person.getFirstName());
        System.out.println("Sobrenome: " + person.getLastName());
        System.out.println("Data de nascimento: " + person.getBirthDate());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Telefone: " + person.getPhone());
    }

    public void registerMultiplePersons() {

        System.out.println("--Cadastro de Pessoas--");

        do {
            registerPerson();
        } while (console.askConfirmation("Deseja cadastrar outra pessoa? (S/N)"));
    }
    
    private void showAll(List<Person> list) {
    	
    	list.forEach((person)->{
    		System.out.println();
    		showPerson(person);
    	});
    }
    
    public void showAll() {
    	
    	List<Person> list = controller.getAll();
    	showAll(list);
    }
    
    public void showAllSortedByName() {
    	
    	List<Person> list = controller.getAll();
    	list.sort((p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()));
    	showAll(list);
    }
    

}
