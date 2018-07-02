import org.junit.Assert;
import org.junit.Test;
import pl.peplinski.zadanie.car.Car;
import pl.peplinski.zadanie.car.CarBodyType;
import pl.peplinski.zadanie.car.CarDAO;

import java.time.LocalDate;

public class CarTests {

    @Test
    public void testAdd_toDB()
    {
        Car car = new Car();
        car.setBrand("Ford");
        car.setModel("Focus");
        car.setCarBodyType(CarBodyType.COMBI);
        car.setProductionDate(LocalDate.of(2014,05,20));

        CarDAO.addCar(car);

        Integer id = car.getId();
        Assert.assertNotNull(id);

        return;
    }
}
