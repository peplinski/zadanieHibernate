package pl.peplinski.zadanie.app.DAO.daoPerson;

import pl.peplinski.zadanie.app.Person;
import pl.peplinski.zadanie.app.PersonDAO;

import java.util.List;

public class ReadAllPersons {
    public static void main(String[] args) {
        List<Person>persons=PersonDAO.readAll();
        for (Person person:persons){
            System.out.println(person);
        }
    }
}
