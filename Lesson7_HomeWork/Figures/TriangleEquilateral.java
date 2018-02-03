package Lesson7_HomeWork.Figures;

public class TriangleEquilateral extends Triangle {

    public TriangleEquilateral(Point centerUp, Point leftDown, Point rightDown){
        super(centerUp, leftDown, rightDown);
    }

    @Override
    public double high(){
        double facet = super.getCenterUp().distance(super.getRightDown());
        return facet * Math.sqrt(3) / 2;
    }

    @Override
    public double square() {
        return super.getLeftDown().distance(super.getRightDown()) * high() / 2;
    }

    @Override
    public String toString() {
        return "TriangleEquilateral{" +
                "centerUp" + super.getCenterUp() + '\'' +
                ", leftDown" + super.getLeftDown() + '\'' +
                ", rightDown" + super.getRightDown() + '\'' +
                "}";
    }
}
