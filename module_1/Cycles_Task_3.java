3. Найти сумму квадратов первых ста чисел.

package com.epam.dziamidau.main;

public class Main {

    public static void main(String[] args) {
        int y = m(100);
        System.out.println(y);
    }

    public static int m(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}