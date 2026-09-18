package br.edu.utfpr.tsi.addressbook.control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.tsi.addressbook.model.Person;

public class PersonController {

    final private List<Person> personList = new ArrayList<>();

    public void createPerson(String firstName, String lastName, LocalDate birthDate,
                             String email, String phone) {

        personList.add(new Person(firstName, lastName, birthDate, email, phone));
    }
}
