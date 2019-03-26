package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	try(Scanner myIn = new Scanner(System.in))
    {
        System.out.print("Enter a numeric value: ");
        double d1 = Double.parseDouble(myIn.nextLine());
        System.out.print("Enter a numeric value: ");
        double d2 = Double.parseDouble(myIn.nextLine());
        double result = d1+d2;
        System.out.println("The answer is " + Double.toString(result));
    }
    }
}
