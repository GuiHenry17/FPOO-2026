package br.edu.utfpr.tsi.addressbook.view;

import br.edu.utfpr.tsi.addressbook.model.Address;
import br.edu.utfpr.tsi.addressbook.view.util.ConsoleInput;

public class AddressView {

	private ConsoleInput console;

    public AddressView(ConsoleInput console) {

        this.console = console;
    }
    

    public Address readAddress() {

        String street       = console.readText("Rua: ");
        String number       = console.readText("Número: ");
        String complement   = console.readText("Complemento: ");
        String neighborhood = console.readText("Bairro: ");
        String city         = console.readText("Cidade: ");
        String state        = console.readText("Estado: ");

        return new Address(street, number, complement, 
                           neighborhood, city, state);
    }
    
    public void showAddress(Address address) {

        System.out.println("\n-- Endereço cadastrado --");
        System.out.println("Rua: " + address.getStreet());
        System.out.println("Número: " + address.getNumber());
        System.out.println("Complemento: " + address.getComplement());
        System.out.println("Bairro: " + address.getNeighborhood());
        System.out.println("Cidade: " + address.getCity());
        System.out.println("Estado: " + address.getState());
    }
    

}
