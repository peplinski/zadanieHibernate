package pl.peplinski.zadanie.app.usage.person;

import pl.peplinski.zadanie.person.Person;
import pl.peplinski.zadanie.person.PersonDAO;

public class PersonReader {
    public static void main(String[] args) {
        Person person = PersonDAO.getPerson(1L);
        System.out.println(person);
    }
}
