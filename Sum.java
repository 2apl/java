package Lesson10;

import java.util.HashMap;
import java.util.Map;

public class Sum {

    public static void main(String[] args) {
        Map<Integer, Integer> firstPolynominal = new HashMap<>();
        Map<Integer, Integer> secondPolynominal = new HashMap<>();

        firstPolynominal.put(6, 5);
        firstPolynominal.put(5, 0);
        firstPolynominal.put(4, 23);
        firstPolynominal.put(3, 1);
        firstPolynominal.put(2, 0);
        firstPolynominal.put(1, 9);
        firstPolynominal.put(0, 4);

        secondPolynominal.put(6, 9);
        secondPolynominal.put(5, 0);
        secondPolynominal.put(4, 2);
        secondPolynominal.put(3, 12);
        secondPolynominal.put(2, 0);
        secondPolynominal.put(1, 31);
        secondPolynominal.put(0, 4);

        for (int i = firstPolynominal.size() - 1; i >= 0; i--) {
            int sum = firstPolynominal.get(i) + secondPolynominal.get(i);
            if (sum != 0 && i != 1 && i != 0) {
                System.out.print(sum + "x^" + i + " + ");
            } else if (sum != 0 && i == 1) {
                System.out.print(sum + "x + ");
            } else if (sum != 0 && i == 0) {
                System.out.println(sum);
            }
        }
    }
}
