package com.goodline.homework;

public class Calculator {
    public static int Sum(int a, int b) {
        return a + b;
    }
    public static int Sub(int a, int b) {
        return a - b;
    }
    public static int Div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Ошибка: Деление на 0");
        } else {
            return a / b;
        }
    }
    public static int Mult(int a, int b) {
        return a * b;
    }

}

