package pl.peplinski.zadanie.app.usage.car;

import pl.peplinski.zadanie.car.Car;
import pl.peplinski.zadanie.car.CarDAO;

import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        List<Car> carList = CarDAO.readAll();
        for(Car car:carList){
            System.out.println(car);
        }
    }
}
