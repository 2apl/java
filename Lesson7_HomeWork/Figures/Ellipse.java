package Lesson7_HomeWork.Figures;

import Lesson7_HomeWork.CompareSquare;

public class Ellipse extends Figure implements CompareSquare {

    private Point centre;
    private Point semiAxis1;
    private Point semiAxis2;

    public Ellipse(Point centre, Point semiAxis1, Point semiAxis2) {
        this.centre = centre;
        this.semiAxis1 = semiAxis1;
        this.semiAxis2 = semiAxis2;
    }

    @Override
    public double square() {
        double semiAxisBig = centre.distance(semiAxis1) * 2;
        double semiAxisSmall = centre.distance(semiAxis2) * 2;
        return Math.PI * semiAxisBig * semiAxisSmall;
    }

    @Override
    public void compareSquare(Figure figure) {
        if (square() == figure.square()){
            System.out.println("Площади фигур равны");
        } else {
            System.out.println("Площади фигур не равны");
        }
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "centre" + centre + '\'' +
                ", semiAxis1" + semiAxis1 + '\'' +
                ", semiAxis2" + semiAxis2 + '\'' +
                "}";

    }

    public Point getCentre() {
        return centre;
    }

    public Point getSemiAxis1() {
        return semiAxis1;
    }

    public Point getSemiAxis2() {
        return semiAxis2;
    }
}
