package pl.peplinski.zadanie.app.usage.car;

import pl.peplinski.zadanie.car.Car;
import pl.peplinski.zadanie.car.CarBodyType;
import pl.peplinski.zadanie.car.CarDAO;

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
