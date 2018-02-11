package Lesson10_HomeWork.Task2;

import java.util.Objects;

public class Bmw extends Car {

    private double engineValue;
    private String color;

    public Bmw(String brand, String model, int year, double engineValue, String color) {
        super(brand, model, year);
        this.engineValue = engineValue;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bmw bmw = (Bmw) o;
        return Objects.equals(color, bmw.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return super.toString() +
                "engineValue: " + engineValue +
                ", color: " + color;
    }
}
