7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

package com.epam.dziamidau.main;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        m(1050);
        m(-123);
    }
    public static void m(int p) {
        int current = abs(p);
        int next = 1;
        while (next != 0) {
            next = current / 10;
            int rem = current % 10;
            System.out.println(rem);
            current = next;
        }
    }
}