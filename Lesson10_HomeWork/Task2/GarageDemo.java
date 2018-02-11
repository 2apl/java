package Lesson10_HomeWork.Task2;

public class GarageDemo {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Audi audiA4 = new Audi("Audi", "A4", 2011, 1.8, "white");
        Bmw bmw5Blue = new Bmw("BMW", "5", 2015, 2.0, "blue");
        Bmw bmw5Silver = new Bmw("BMW", "5", 2015, 3.0, "silver");
        Mercedes mercedesS = new Mercedes("Mercedes", "S", 2017, 4.2, "silver");
        Lexus lexusGs = new Lexus("Lexus", "GS", 2013, 3.0, "red");

        garage.addCarToGarage(audiA4);
        garage.addCarToGarage(audiA4);
        garage.addCarToGarage(bmw5Blue);
        garage.addCarToGarage(bmw5Silver);
        garage.addCarToGarage(mercedesS);
        garage.addCarToGarage(lexusGs);

        System.out.println(garage.getAmountOfCars(audiA4));
        System.out.println(garage.getAmountOfCars(bmw5Blue));
        System.out.println(garage.getAmountOfCars(bmw5Silver));

        garage.getCarFromGarage(audiA4);
        garage.getCarFromGarage(bmw5Blue);
        garage.getCarFromGarage(mercedesS);
        garage.getCarFromGarage(bmw5Blue);

        System.out.println(garage.getAmountOfCars(audiA4));
        System.out.println(garage.getAmountOfCars(bmw5Blue));
        System.out.println(garage.getAmountOfCars(bmw5Silver));
    }
}
