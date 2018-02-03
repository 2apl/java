package Lesson6_HomeWork.Point;

public class Rectangle {

    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public double squareRectangle() {
        return Math.abs(rightDown.getX() - leftUp.getX()) * Math.abs(leftUp.getY() - rightDown.getY());
    }

    public double diagonalRectangle() {
        return Math.sqrt(Math.pow((rightDown.getX() - leftUp.getX()), 2) + Math.pow((leftUp.getY() - rightDown.getY()), 2));
    }
}
