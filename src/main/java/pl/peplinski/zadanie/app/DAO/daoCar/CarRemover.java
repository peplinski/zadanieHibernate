package pl.peplinski.zadanie.app.DAO.daoCar;

import pl.peplinski.zadanie.app.CarDAO;

public class CarRemover {
    public static void main(String[] args) {
        CarDAO.deleteCar(1L);
    }
}
