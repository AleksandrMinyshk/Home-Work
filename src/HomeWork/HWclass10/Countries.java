package HomeWork.HWclass10;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 countries");
        String[] countries = new String[5];

        for (int i = 0; i < countries.length; i++) {
            countries[i] = scanner.next();
        }
        for (int j = 0; j < countries.length; j++) {
            //String countriesUpCase=countries[j].toUpperCase();
            // System.out.println(countriesUpCase);
            System.out.println(countries[j].toUpperCase());

        }

        System.out.println("*************");

        for(String name:countries) {

            //System.out.println(name);
            System.out.println(name.toUpperCase());
        }

    }
}
