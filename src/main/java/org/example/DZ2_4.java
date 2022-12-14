package org.example;
import java.util.Scanner;
public class DZ2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's lenght: ");
        int n = scanner.nextInt();
        int number2, number1;
        System.out.printf("Enter number 1: ");
        number1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            number2 = scanner.nextInt();
            if (number1 > number2) {
                System.out.println("Последовательность не возрастает");
                count++;
                break;
            }
            number1 = number2;
        }
        if (count != 1) {
            System.out.println("Последовательность возрастает");
        }
    }
}
