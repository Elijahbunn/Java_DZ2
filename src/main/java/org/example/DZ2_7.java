package org.example;

import java.util.Scanner;

public class DZ2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите температуру в Цельсиях: ");
//        double cels = scanner.nextInt();
//        System.out.print("Нажмите 1 для перевода температуры в Фаренгейты или 2 для первода в Кельвины: ");
//        int n = scanner.nextInt();
        while (true) {
            System.out.print("Введите температуру в Цельсиях: ");
            double cels = scanner.nextInt();
            System.out.print("Нажмите 1 для перевода температуры в Фаренгейты или 2 для первода в Кельвины: ");
            int n = scanner.nextInt();
            Converter.convertValue(n, cels);
        }
    }
}

interface Converter {
    static void convertValue(int text, double number) {
        if (text == 1) {
            number = number + 273;
            System.out.println("Температура в Фаренгейтах = " + number);
        } else if (text == 2) {
            number = (9 / 5) * number + 32;
            System.out.println("Температура в Кельвинах = " + number);
        } else {
            System.out.println("Неверно! Нажмите 1 для перевода температуры в Фаренгейты или 2 для первода в Кельвины!");
            //convertValue(text, number);
        }
    }
}

