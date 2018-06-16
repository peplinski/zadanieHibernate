package pl.peplinski.zadanie.app.DAO.daoPerson;

import pl.peplinski.zadanie.app.PersonDAO;

public class RemovePerson {
    public static void main(String[] args) {
        PersonDAO.deletePerson(1L);
    }
}
