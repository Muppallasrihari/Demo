package com.techfinder.operatons;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1, input2;
		String userChoice = null;
		do {
			System.out.println("********Welcome to Arithmetic Calculator********");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multipliction");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice of operation:");
			int choice;
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter value1:");
				input1 = sc.nextInt();
				System.out.println("Enter value2:");
				input2 = sc.nextInt();
				System.out.println("The sume of inputs is:" + (input1 + input2));
				break;
			}
			case 2: {
				System.out.println("Enter value1:");
				input1 = sc.nextInt();
				System.out.println("Enter value2:");
				input2 = sc.nextInt();
				System.out.println("The difference of inputs is:" + (input1 - input2));
				break;
			}
			case 3: {
				System.out.println("Enter value1:");
				input1 = sc.nextInt();
				System.out.println("Enter value2:");
				input2 = sc.nextInt();
				System.out.println("The products of inputs is:" + (input1 * input2));
				break;
			}
			case 4: {
				System.out.println("Enter value1:");
				input1 = sc.nextInt();
				System.out.println("Enter value2:");
				input2 = sc.nextInt();
				System.out.println("The division of inputs is:" + (input1 / input2));
				break;
			}
			case 5: {
				System.out.println("**** Thanks For watching*****");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Enter the correct choice.");
				break;
			}
			}
			System.out.println("Do you want to continue(Yes / No)?");
			userChoice = sc.next();
		} while (userChoice.equalsIgnoreCase("Yes"));

	}

}
