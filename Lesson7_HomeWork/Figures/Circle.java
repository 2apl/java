package Lesson7_HomeWork.Figures;

public class Circle extends Ellipse {

    public Circle(Point centre, Point radius){
        super(centre, radius, radius);
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(super.getCentre().distance(super.getSemiAxis1()), 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centre" + super.getCentre() + '\'' +
                ", radius" + super.getSemiAxis1() + '\'' +
                "}";
    }

}
