package org.example;
import java.util.Scanner;
public class DZ2_6 {
    public static void FindNumb1(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] > 9)&&(array[i]<100)){
                sum += i;
            }
        }
        System.out.printf("sum of index = %d %n", sum);
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0){
                array[i] = sum;
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ", array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array's lenght: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Enter number %d: ", i+1);
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
        FindNumb1(numbers);
    }
}
