package Javabasics;

import java.util.Scanner;

public class if_elseif_demo {
	
	public static void main(String[] args)
	{
		//Calculator
		
		//user = operand1,operand2,operator
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter operand1");
		int op1 = scan.nextInt();
		System.out.println("Please enter operand2");
		int op2 = scan.nextInt();
		System.out.println("please enter operator symbol like +-/*");
		char ch = scan.next().charAt(0);
		
		if(ch=='+')
		{
			int c=op1 +op2;
			System.out.println("Addition" +c);
		}
		else if(ch == '-')
		{
			int c=op1 -op2;
			System.out.println("Subtraction" +c);
		}
		
		else if(ch == '/')
		{
			int c=op1 /op2;
			System.out.println("Division" +c);
		}
		
		else if(ch =='*')
		{
			int c=op1 *op2;
			System.out.println("Multiplication " +c);
		}
		else
		{
			System.out.println("not define");
		}
		System.out.println("thank you for using our application");
		
	}

	
}
