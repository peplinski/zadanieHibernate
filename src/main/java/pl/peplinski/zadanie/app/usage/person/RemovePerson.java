package pl.peplinski.zadanie.app.usage.person;

import pl.peplinski.zadanie.person.PersonDAO;

public class RemovePerson {
    public static void main(String[] args) {
        PersonDAO.deletePerson(1L);
    }
}
