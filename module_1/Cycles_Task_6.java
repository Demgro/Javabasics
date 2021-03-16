6. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.

package com.epam.dziamidau.main;

public class Main {

    public static void main(String[] args) {
        int m = 20;
        int n = 40;
        for (int i = m; i <= n; i++) {
            m(i);
        }
    }

    public static void m(int p) {
        System.out.println("p = " + p);
        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                System.out.println(i);
            }
        }
    }
}