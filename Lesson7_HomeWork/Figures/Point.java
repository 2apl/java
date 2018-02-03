package Lesson7_HomeWork.Figures;

public class Point extends Figure{

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
    }

    @Override
    public double square() {
        return 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
