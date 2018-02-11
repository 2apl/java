package Lesson10_HomeWork.Task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> garage;

    public Garage() {
        Map<Car, Integer> garage = new HashMap<>();
        this.garage = garage;
    }

    public void addCarToGarage(Car car) {
        Integer count = 1;
        if (garage.containsKey(car)) {
            count = garage.get(car) + 1;
            garage.put(car, count);
        } else {
            garage.put(car, count);
        }
    }

    public void getCarFromGarage(Car car) {
        Integer count = garage.get(car);
        if (count == 0) {
            System.out.println(car.toString() + " : нет такого автомобиля в гараже");
        } else {
            count -= 1;
            garage.remove(car);
            garage.put(car, count);
        }
    }

    public String getAmountOfCars(Car car) {
        return "Количество автомобилей " + car.toString() + " : " + garage.get(car).toString();
    }

    public void print() {
        System.out.println(garage.toString());
    }

}
