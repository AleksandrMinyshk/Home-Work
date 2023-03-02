package HWclass11;

import java.util.Scanner;

public class ScanCalculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the 5 numbers");
        int[] numbers=new int[5];
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int j = 0; j < numbers.length; j++) {
            sum+=numbers[j];

        }
        System.out.println("Sum of stored elements is "+sum);


    }
}
