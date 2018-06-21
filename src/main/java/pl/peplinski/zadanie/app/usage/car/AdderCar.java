package pl.peplinski.zadanie.app.usage.car;

import pl.peplinski.zadanie.car.Car;
import pl.peplinski.zadanie.car.CarBodyType;
import pl.peplinski.zadanie.car.CarDAO;

import java.time.LocalDate;

public class AdderCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Ford");
        c1.setModel("Focus");
        c1.setCarBodyType(CarBodyType.COMBI);
        c1.setProductionDate(LocalDate.of(2014, 05, 20));

        CarDAO.addCar(c1);
    }

}
