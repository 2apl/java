package Lesson7_HomeWork;

import Lesson7_HomeWork.Figures.Figure;
import Lesson7_HomeWork.Figures.Rectangle;
import Lesson7_HomeWork.Figures.Triangle;

public class ShapeUtils {

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure){
        return figure instanceof Triangle;
    }
}
