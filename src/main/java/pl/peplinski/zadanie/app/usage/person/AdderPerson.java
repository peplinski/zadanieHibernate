package pl.peplinski.zadanie.app.usage.person;

import pl.peplinski.zadanie.person.Person;
import pl.peplinski.zadanie.person.PersonDAO;

public class AdderPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Kubus");
        person.setSurname("Puchatek");

        PersonDAO.addPerson(person);
    }
}
