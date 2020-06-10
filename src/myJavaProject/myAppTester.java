/**
* Software Engineering - Summer 2020 
*/
package myJavaProject;

import java.util.Scanner;

public class myAppTester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = 0;

		System.out.println("Hello Software Engineering World");
		System.out.println("Input your number and press enter: ");
		n = input.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(n);
		System.out.println();

		// add a line below to call your myTestMethod from here then remove the block
		// comment symbols

		myTestMethod();
	}

	// This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
		if (num < 10) {
			System.out.println(num);
			return;
		} else {
			System.out.print(num % 10);
			reverseMethod(num / 10); // recursive call
		}
	}

	// add your test method in this space then remove the block comment symbols
	// public static void myTestMethod(...){}

	public static void myTestMethod() {

		String firstName, lastName;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name");
		// input.nextLine();
		firstName = input.nextLine();
		System.out.println("Please enter your last name");
		lastName = input.nextLine();
		System.out.println("Your Full name is " + firstName + " " + lastName);
		input.close();
	}

}
