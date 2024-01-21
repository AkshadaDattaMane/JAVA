package JAVA;

import java.lang.Math.*;
import java.util.Scanner;

public class Calculator{
	
	public void addition(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}
	
	public void subtraction(int a,int b) {
		System.out.println("Difference: "+(a-b));
	}
	
	public void Multiplication(int a,int b) {
		System.out.println("Product: "+(a*b));
		
	}
	
	public void division(int a,int b) {
		System.out.println("Remainder: "+(a/b));
	}
	
	public void exponential(int a,int b) {
		System.out.println("Result: "+(Math.pow(a,b)));
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculator c= new Calculator();
		
		System.out.println("Enter no. of test cases:");
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter choice of operation \n 1:Addition \n 2:Subtraction \n 3:Multiplication \n 4:Division \n 5:Exponential\n ");
		int ch= sc.nextInt();
		
		switch(ch) {
		case 1 :
			c.addition(a,b);
		    break;
		    
		case 2 :
			c.subtraction(a,b);
			break;
			
		case 3 :
			c.Multiplication(a,b);
			break;
		case 4:
			c.division(a,b);
			break;
			
		case 5:
			c.exponential(a,b);
			break;
			
		default:
			System.out.println("Invalid Choice");
			
		}
		}	
	}
}
