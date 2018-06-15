package pl.peplinski.zadanie.app.DAO.daoPerson;

import pl.peplinski.zadanie.app.Person;
import pl.peplinski.zadanie.app.PersonDAO;

public class UpdatePerson {
    public static void main(String[] args) {
        Person newPerson  = new Person();

        newPerson.setName("Kajko");
        newPerson.setSurname("Kokosz");

        PersonDAO.updatePerson(1L,newPerson);
    }
}
