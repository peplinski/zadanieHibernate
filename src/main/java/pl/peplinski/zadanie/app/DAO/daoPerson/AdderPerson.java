package pl.peplinski.zadanie.app.DAO.daoPerson;

import pl.peplinski.zadanie.app.Person;
import pl.peplinski.zadanie.app.PersonDAO;

public class AdderPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Krzychu");
        person.setSurname("Pelinski");

        PersonDAO.addPerson(person);
    }
}