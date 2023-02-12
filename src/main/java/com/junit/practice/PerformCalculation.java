package com.junit.practice;
import java.util.Scanner;

public class PerformCalculation {
	int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int case_no;
		do{
			int num1,num2;
			System.out.println("Select Which Operation You want to Perform");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			case_no=sc.nextInt();
	
			switch (case_no) {
			case 1:
				System.out.println("Please Enter two numbers for Addition");
				num1=sc.nextInt();
				num2=sc.nextInt();
				Calculator obj = new Addition();
				int output =obj.performOperation(num1, num2);
				System.out.println("Your Calculated Output ---:"+ output);
				case_no=4;
				break;
			case 2:
				System.out.println("Please Enter two numbers for Subtraction");
				num1=sc.nextInt();
				num2=sc.nextInt();
				obj = new Subtraction();
				output =obj.performOperation(num1, num2);
				System.out.println("Your Calculated Output:"+ output);
				break;
			case 3:
				System.out.println("Please Enter two numbers for Multiplaction");
				num1=sc.nextInt();
				num2=sc.nextInt();
				obj = new Multiplaction();
				output =obj.performOperation(num1, num2);
				System.out.println("Your Calculated Output:"+ output);
				break;
			case 4:
				System.out.println("Please Enter two numbers for Divison");
				num1=sc.nextInt();
				num2=sc.nextInt();
				obj = new Divison();
				output =obj.performOperation(num1, num2);
				System.out.println("Your Calculated Output:"+ output);
				break;	
			case 5:
				System.out.println("Thank you for using my calculator. See You Soon.");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
				
			}
		}
		while (case_no!=5);
	}
}
	

