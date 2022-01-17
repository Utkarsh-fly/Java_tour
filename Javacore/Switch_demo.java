package Javabasics;

import java.util.Scanner;

public class Switch_demo {
		
	public static void main(String[] args)
	{
		//Calculator
		
		//user = operand1,operand2,operator
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter operand1");
		int op1 = scan.nextInt();
		System.out.println("Please enter operand2");
		int op2 = scan.nextInt();
		System.out.println("please enter operator symbol like +,-,/,*");
		char ch = scan.next().charAt(0);
		
		switch(ch)
		{
		case'+':
			int c= op1+op2;
				System.out.println("Addition" +c);
		break;
		
		case'-':
			int c1= op1-op2;
				System.out.println("Subtraction" +c1);
		break;
		
		case'*':
			int c2= op1*op2;
				System.out.println("Multiplication" +c2);
		break;
		
		case'/':
			int c3= op1/op2;
				System.out.println("Division" +c3);
		break;		
			
		default:
			System.out.println("Not define");
		
		
		
		
	}
		}}
	
		

