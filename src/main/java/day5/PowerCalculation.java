package day5;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base number");
        int n1= scan.nextInt();
        System.out.println("Enter the exponent");
        int n2= scan.nextInt();

        int result =1;
      for(int i=0; i<n2; i++){
        result *= n1;
//        System.out.println(Math.pow(n1,n2));
            }
        System.out.println(n1+"^"+n2+" = " +result);
        scan.close();
        }
}