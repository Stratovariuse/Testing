package com.goodline.homework;

import com.goodline.helpers.Variables;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    static String[] names = Variables.names;

    // Массив с числами
    static int[] numbers = Variables.numbers;

    public static void main(String[] args) {
        // Здесь запускаете функции
        printEven();
        printNames();
        getCount();
    }

    public static int[] printEven() {
        // Вернуть массив четных чисел меньше 100
        for (int i=0; i<100; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " ");
            }
        }
        return null;
    }

    private static void printNames() {
        // Вывести все элементы массива names
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
    }

    private static int getCount() {
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        int s = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(i % 3 == 0 && i % 7 == 0) {
                s++;
                System.out.println(s);
            }
        }
        return 0;
    }

    private static void printCounts() {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1
        }
    }

