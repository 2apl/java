package Lesson7_HomeWork.Figures;

public class Line extends Figure {

    private Point one;
    private Point two;

    public Line(Point one, Point two){
        this.one = one;
        this.two = two;
    }

    @Override
    public double square() {
        return 0;
    }

    @Override
    public String toString() {
        return "Line{" +
                "one=" + one +
                ", two=" + two +
                '}';
    }
}
