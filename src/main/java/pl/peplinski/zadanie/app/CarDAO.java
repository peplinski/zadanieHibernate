package pl.peplinski.zadanie.app;

import org.hibernate.Session;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class CarDAO { public static void addDog(Car car) {
    Session session = HibernateFactory.getSessionFactory().openSession();
    session.beginTransaction();
    session.save(car);
    session.getTransaction().commit();
    session.close();
}

    public static Car getCar(Long id) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        Car car = (Car) session.get(Car.class, id);
        session.close();

        return car;
    }

    public static List<Car> readAll(){
        Session session = HibernateFactory.getSessionFactory().openSession();
        List<Car> cars = session.createQuery("FROM car").list();
        session.close();
        System.out.println("Found " + cars.size()+ " Cars");
        return cars;
    }

    public static void deleteCar(Long carId){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Car car = getCar(carId);
        session.delete(car);
        session.getTransaction().commit();
        session.close();
    }

    public static void updateCar(Long carId, Car newCar){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Car car = getCar(carId);
        car.setBrand(newCar.getBrand());
        car.setModel(newCar.getModel());
        car.setCarBodyType(newCar.getCarBodyType());
        car.setProductionDate(newCar.getProductionDate());
        session.update(car);
        session.getTransaction().commit();
        session.close();
    }

}
