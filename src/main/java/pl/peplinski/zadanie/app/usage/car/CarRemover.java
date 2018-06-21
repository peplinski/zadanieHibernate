package pl.peplinski.zadanie.app.usage.car;

import pl.peplinski.zadanie.car.CarDAO;

public class CarRemover {
    public static void main(String[] args) {
        CarDAO.deleteCar(1L);
    }
}
