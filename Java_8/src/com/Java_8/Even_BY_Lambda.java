package com.Java_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Even_BY_Lambda {
public static void main(String[] args) {
	/*Predicate <Integer> p	 = i->i%2==0;
	System.out.println(p.test( 1234));*/
	   // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter an integer
    System.out.print("Enter an integer: ");

    // Read the integer input
    int number = scanner.nextInt();

    // Define a Predicate to check if the number is even
    Predicate<Integer> isEven = i-> i % 2 == 0;

    // Check if the number is even using the Predicate
    if (isEven.test(number)) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }

    // Close the scanner
    scanner.close();
}
}
