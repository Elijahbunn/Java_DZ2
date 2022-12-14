package org.example;
import java.util.Scanner;

public class DZ2_5 {
    public static void SumOfNumb(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                continue;
            }else{
                String[]currents=Integer.toString(array[i]).split("");
                int current=Integer.parseInt(currents[currents.length-1]);
                int current3=Integer.parseInt(currents[currents.length-2]);
                sum=array[i];
                for(int j=i+1;j<array.length;j++){
                    if(array[j]==0){
                        continue;
                    }else{
                        String[]currents2=Integer.toString(array[j]).split("");
                        int current2=Integer.parseInt(currents2[currents2.length-1]);
                        int current4=Integer.parseInt(currents2[currents2.length-2]);
                        if((current==current2)&&(current3==current4)){
                            sum+=array[j];
                            array[j]=0;
                        }
                    }
                }
                System.out.printf("sum for %d%d = %d %n", current3, current, sum);
            }
        }
    }
    public static void main(String[] args){
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
        scanner.close();
        SumOfNumb(numbers);
    }
}
