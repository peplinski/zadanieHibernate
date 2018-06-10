package pl.app.peplinski.zadanie.app;

import java.time.LocalDate;

public class Car {

    private int id;
    private String brand;
    private String model;
    private CarBodyType carBodyType;
    private LocalDate productionDate;
    private int age;

    public Car() {
    }

    public Car(String brand, String model, CarBodyType carBodyType, LocalDate productionDate) {
        this.brand = brand;
        this.model = model;
        this.carBodyType = carBodyType;
        this.productionDate = productionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carBodyType=" + carBodyType +
                ", productionDate=" + productionDate +
                ", age=" + age +
                '}';
    }
}
