package pl.peplinski.zadanie.app.usage.person;

import pl.peplinski.zadanie.person.Person;
import pl.peplinski.zadanie.person.PersonDAO;

import java.util.List;

public class ReadAllPersons {
    public static void main(String[] args) {
        List<Person>persons=PersonDAO.readAll();
        for (Person person:persons){
            System.out.println(person);
        }
    }
}
