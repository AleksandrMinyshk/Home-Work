package HWclass33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter an integer:");
            try {
                userInput = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
    }
}