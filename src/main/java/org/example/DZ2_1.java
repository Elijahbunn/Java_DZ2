package org.example;

import java.util.Scanner;

public class DZ2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's length: ");
        int n = scanner.nextInt();
        int number1 = 5;
        int number2;
        int count = 0;
        for(int i = 0; i < n; i++){
            System.out.printf("Enter number %d: ", i+1);
            number2 = scanner.nextInt();
            if ((number1 > 0)&&(number2<0)){
                count++;
            }
            number1 = number2;
        }
        System.out.println("count = " + count);
    }
}