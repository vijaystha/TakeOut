package day5;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principal Amount.");
        double Principal = scan.nextDouble();

        System.out.println("Enter the rate of Interest.");
        double Rate= scan.nextDouble();

        System.out.println("Enter the time  Period in years.");
        double Time= scan.nextDouble();

        System.out.println("The simple interest is "  + (Principal * Rate * Time) / 100);
    }
}
