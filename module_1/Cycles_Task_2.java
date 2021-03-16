2. Вычислить значения функции на отрезке [а,b] c шагом h:

package com.epam.dziamidau.main;

public class Main {

    public static void main(String[] args) {
        double y = m(1);
        System.out.println(y);
    }

    public static double m(double x) {
        if (x > 2.) {
            return x;
        } else {
            return -x;
        }
    }
}