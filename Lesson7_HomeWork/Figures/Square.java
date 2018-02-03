package Lesson7_HomeWork.Figures;

public class Square extends Rectangle {

    public Square(Point leftUp, Point rightDown){
        super(leftUp, rightDown);
    }

    @Override
    public double square() {
        return Math.pow(super.getRightDown().getX() - super.getLeftUp().getX(), 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "leftUp" + super.getLeftUp() + '\'' +
                ", rightDown" + super.getRightDown() + '\'' +
                "}";
    }
}
