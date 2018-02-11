package Lesson10_HomeWork.Task2;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return brand + ' ' +
                model + ' ' +
                year + ' ';
    }
}
