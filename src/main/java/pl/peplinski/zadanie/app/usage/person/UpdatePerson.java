package pl.peplinski.zadanie.app.usage.person;

import pl.peplinski.zadanie.person.Person;
import pl.peplinski.zadanie.person.PersonDAO;

public class UpdatePerson {
    public static void main(String[] args) {
        Person newPerson  = new Person();

        newPerson.setName("Kajko");
        newPerson.setSurname("Kokosz");

        PersonDAO.updatePerson(1L,newPerson);
    }
}
