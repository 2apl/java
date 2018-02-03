package Lesson7_HomeWork.Figures;

import Lesson7_HomeWork.CompareSquare;

public class Triangle extends Figure implements CompareSquare {

    private Point centerUp;
    private Point leftDown;
    private Point rightDown;

    public Triangle(Point centerUp, Point leftDown, Point rightDown){
        this.centerUp = centerUp;
        this.leftDown = leftDown;
        this.rightDown = rightDown;
    }

    public double high(){
        double firstFaced = leftDown.distance(centerUp);
        double secondFaced = rightDown.distance(centerUp);
        double base = leftDown.distance(rightDown);
        double perimeterHalf = (firstFaced + secondFaced + base) / 2;
        return Math.sqrt(perimeterHalf * (perimeterHalf - firstFaced) * (perimeterHalf - secondFaced) * (perimeterHalf - base)) * 2 / base;
    }

    @Override
    public double square() {
        return leftDown.distance(rightDown) * high() / 2;
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
        return "Triangle{" +
                "centerUp" + centerUp + '\'' +
                ", leftDown" + leftDown + '\'' +
                ", rightDown" + rightDown + '\'' +
                "}";
    }

    public Point getRightDown() {
        return rightDown;
    }

    public Point getCenterUp() {
        return centerUp;
    }

    public Point getLeftDown() {
        return leftDown;
    }
}
