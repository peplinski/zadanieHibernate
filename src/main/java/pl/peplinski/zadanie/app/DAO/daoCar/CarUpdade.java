package pl.peplinski.zadanie.app.DAO.daoCar;

import pl.peplinski.zadanie.app.Car;
import pl.peplinski.zadanie.app.CarBodyType;
import pl.peplinski.zadanie.app.CarDAO;

import java.time.LocalDate;

public class CarUpdade {
    public static void main(String[] args) {
        Car newCar = new Car();

        newCar.setBrand("Mitshibishi");
        newCar.setModel("EVO VIII");
        newCar.setCarBodyType(CarBodyType.SEDAN);
        newCar.setProductionDate(LocalDate.now());

        CarDAO.updateCar(1L,newCar);
    }
}
