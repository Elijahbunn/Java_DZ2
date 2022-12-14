package org.example;
import java.util.Scanner;
public class DZ2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's length ");
        int n = scanner.nextInt();
        int number;
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.printf("Enter number %d: ", i+1);
            number = scanner.nextInt();
            int count = 0;
            for (int j = 2; j < number; j++){
                if (number%j == 0){
                    count ++;
                    continue;
                }
            }
            if ((count == 0)||(number==2)){
                sum += number;
            }
        }
        System.out.println("sum = " + sum);
    }
}
