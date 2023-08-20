package day5;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Your BMI is" + (weight / (height * height)));
//        Write a Java program that calculates the Body Mass Index (BMI) of a person based on their weight and height.
//        Instructions:
//        Use the Scanner class to take input from the user for their weight in kilograms and height in meters.
//        Create a method that takes the input weight and height as arguments and calculates the BMI using the formula: BMI = weight / (height * height).
//                Ex:  Enter your weight (kg): 70
//        Enter your height (m): 1.75
//        Your BMI: 22.86

    }
}
