5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

package com.epam.dziamidau.main;

public class Main {

    public static void main(String[] args) {
        for (char i = 32; i < 128; i++) {
            m(i);
        }
    }

    public static void m(char c) {
        int i = c;
        System.out.println(c + " " + i);
    }
}