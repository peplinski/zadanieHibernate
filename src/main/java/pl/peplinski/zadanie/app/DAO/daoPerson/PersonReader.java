package pl.peplinski.zadanie.app.DAO.daoPerson;

import pl.peplinski.zadanie.app.Person;
import pl.peplinski.zadanie.app.PersonDAO;

public class PersonReader {
    public static void main(String[] args) {
        Person person = PersonDAO.getPerson(1L);
        System.out.println(person);
    }
}
