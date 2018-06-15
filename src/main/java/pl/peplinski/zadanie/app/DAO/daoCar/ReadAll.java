package pl.peplinski.zadanie.app.DAO.daoCar;

import pl.peplinski.zadanie.app.Car;
import pl.peplinski.zadanie.app.CarDAO;

import java.util.List;

public class ReadAll {
    public static void main(String[] args) {
        List<Car> carList = CarDAO.readAll();
        for(Car car:carList){
            System.out.println(car);
        }
    }
}
