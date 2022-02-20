package com.java.basiccalculator;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println("Basic Calculator");
		
		
		    int first, second, add, sub, mul;
		    float dvd;
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter First Numbers : ");
		    first = scanner.nextInt();
		    System.out.print("Enter Second Numbers : ");
		    second = scanner.nextInt();

		    add = first + second;
		    sub = first - second;
		    mul = first * second;
		    dvd = (float) first / second;

		    System.out.println("Sum = " + add);
		    System.out.println("Difference = " + sub);
		    System.out.println("Multiplication = " + mul);
		    System.out.println("Division = " + dvd);
		
		
	}

}
