package Lesson7_HomeWork.Figures;

import Lesson7_HomeWork.CompareSquare;

public class Rectangle extends Figure implements CompareSquare {

    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown){
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public double diagonal(){
        return leftUp.distance(rightDown);
    }

    @Override
    public double square() {
        return Math.abs(rightDown.getX() - leftUp.getX()) * Math.abs(leftUp.getY() - rightDown.getY());
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
        return "Rectangle{" +
                "leftUp" + leftUp + '\'' +
                ", rightDown" + rightDown + '\'' +
                "}";
    }

    public Point getRightDown() {
        return rightDown;
    }

    public Point getLeftUp() {
        return leftUp;
    }
}
