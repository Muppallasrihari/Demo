package com.techfinder.operations;

import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int input1,input2;
	String userChoice=null;
	do {
		System.out.println("****Welcome to TechFinder*****");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		
		int choice;
		System.out.println("Enter the choice of operation:");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:{
			System.out.println("Enter the value1:");
			input1=sc.nextInt();
			System.out.println("Enter the value2:");
			input2=sc.nextInt();
			System.out.println("The sume of given inputs is : "+(input1+input2));
			break;
		}
		case 2:{
			System.out.println("Enter the value1:");
			input1=sc.nextInt();
			System.out.println("Enter the value2:");
			input2=sc.nextInt();
			System.out.println("The difference of given inputs is : "+(input1-input2));
			break;
		}
		case 3:{
			System.out.println("Enter the value1:");
			input1=sc.nextInt();
			System.out.println("Enter the value2:");
			input2=sc.nextInt();
			System.out.println("The Product of given inputs is : "+(input1*input2));
			break;
		}
		case 4:{
			System.out.println("Enter the value1:");
			input1=sc.nextInt();
			System.out.println("Enter the value2:");
			input2=sc.nextInt();
			System.out.println("The Division of given inputs is : "+(input1/input2));
			break;
		}
		case 5:{
			System.out.println("****Thank You******");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Enter the correct choice of operation.");
			break;
		}
		System.out.println("Do you want to continue()Yes / No)?");
		userChoice=sc.next();
	}while(userChoice.equalsIgnoreCase("yes"));

	}

}
