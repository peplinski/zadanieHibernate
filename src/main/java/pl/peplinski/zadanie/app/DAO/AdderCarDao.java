package pl.peplinski.zadanie.app.DAO;

import pl.peplinski.zadanie.app.Car;
import pl.peplinski.zadanie.app.CarBodyType;
import pl.peplinski.zadanie.app.CarDAO;

import java.time.LocalDate;

public class AdderCarDao {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Ford");
        c1.setModel("Focus");
        c1.setCarBodyType(CarBodyType.COMBI);
        c1.setProductionDate(LocalDate.of(2014, 05, 20));

        CarDAO.addCar(c1);
    }

}
