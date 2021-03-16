package com.epam.dziamidau.main;

public class Main {

    public static void main(String[] args) {
        double y = m(200);
        System.out.println(y);
    }

    public static double m(int n) {
        double sum = 1;
        int i = 1;
        for (; i <= n; i++) {
            sum *= i * i;
            System.out.println(sum);
            if (sum > 1.E10) {
                break;
            }
        }
        System.out.println(sum);
        System.out.println(i);
        return sum;
    }
}