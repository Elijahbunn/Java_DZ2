package org.example;
import java.util.Scanner;
public class DZ2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int n = scanner.nextInt();
        int number1 = 5;
        int number2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.printf("Enter number %d: ", i+1);
            //number2 = scanner.nextInt();
            if (i < n - 1){number2 = scanner.nextInt();}
            else {number2 = 0;}
            if ((number1 > 0)&&(number2<0)){
                sum += number1;
            }
            number1 = number2;
        }
        System.out.println("sum = " + sum);
    }
}
