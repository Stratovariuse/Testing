package com.goodline.lessons;

import java.util.Scanner;

public class ConditionPractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Узнаем что ввел пользователь и сохраняем в переменную

        // Если то, что ввел пользователь меньше 5, то выводим "Маленькое число"
        if(number < 5) {
            System.out.println("Маленькое число");
        } else if(number > 15) {
            System.out.println("Большое число");
        } else {
            System.out.println("ТО, что надо");
        }

        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Что-то др");
        }
        // В другом случае если больше 15, то выводим "Большое число"
        // Во всех других случаях выводим "То, что надо!"
    }
}
