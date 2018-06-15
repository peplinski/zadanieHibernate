package pl.peplinski.zadanie.app;

import org.hibernate.Session;

import java.util.List;


public class PersonDAO {
    public static void addPerson(Person person) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    public static Person getPerson(Long id) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        Person person = (Person) session.get(Person.class, id);
        session.close();

        return person;
    }

    public static List<Person> readAll() {
        Session session = HibernateFactory.getSessionFactory().openSession();
        List<Person> personList = session.createQuery("FROM person").list();
        session.close();
        System.out.println("Found " + personList.size() + " Personss");
        return personList;
    }

    public static void deletePerson(Long personId) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = getPerson(personId);
        session.delete(person);
        session.getTransaction().commit();
        session.close();
    }

    public static void updatePerson(Long personId, Person newperson) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = getPerson(personId);
        person.setName(newperson.getName());
        person.setSurname(newperson.getSurname());
        session.update(person);
        session.getTransaction().commit();
        session.close();
    }
}
