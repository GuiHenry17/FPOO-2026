package br.edu.utfpr.tsi.addressbook.control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.tsi.addressbook.model.Address;
import br.edu.utfpr.tsi.addressbook.model.Person;

public class PersonController {

    final private List<Person> personList = new ArrayList<>();

    public void createPerson(String firstName, String lastName, LocalDate birthDate,
                             String email, String phone, Address address) {

        Person person = new Person(firstName, lastName, birthDate, email, phone);
        person.setAddress(address);
        personList.add(person);
    }
    
    public List<Person> getAll(){
    	
    	return new ArrayList<>(personList);
    }
    
    {
        Person person = new Person("Joaquim", "Da Silva", LocalDate.of(1972, 3, 15),
                "joaquim@gmail.com", "45-984739282");
        person.setAddress(new Address("Alameda Cinza", "243", "Casa Fundos",
                "Jardim Europa", "Toledo", "PR"));
        personList.add(person);

        person = new Person("Maria", "Oliveira", LocalDate.of(1985, 7, 22),
                "maria@gmail.com", "45-998765432");
        person.setAddress(new Address("Rua Paraná", "512", "Apartamento 302",
                "Centro", "Toledo", "PR"));
        personList.add(person);

        person = new Person("Carlos", "Santos", LocalDate.of(1990, 11, 8),
                "carlos@gmail.com", "45-987654321");
        person.setAddress(new Address("Avenida Maripá", "1020", "Casa",
                "Vila Industrial", "Toledo", "PR"));
        personList.add(person);

        person = new Person("Ana", "Pereira", LocalDate.of(1978, 4, 30),
                "ana@gmail.com", "45-976543210");
        person.setAddress(new Address("Rua São Paulo", "785", "Casa",
                "Jardim Coopagro", "Toledo", "PR"));
        personList.add(person);

        person = new Person("Rafael", "Costa", LocalDate.of(1995, 9, 17),
                "rafael@gmail.com", "45-965432109");
        person.setAddress(new Address("Rua Almirante Barroso", "321", "Apartamento 101",
                "Centro", "Toledo", "PR"));
        personList.add(person);
    }

}
