package Javabasics;

import java.util.Scanner;

public class do_while_demo {
	
	public static void main(String[] args)
	{
		// do while loop
		
		// Menu.
		//Welcome user to the calculator menu driven application
		//1.addition 2. subtraction
		System.out.println("Welcome user to the calculator menu driven application");
		int choice;
		int op1=0,op2=0;
		do
		{
		
		System.out.println("press 1 to perform Addition");
		System.out.println("press 2 to perform Subtraction");
		System.out.println("press 3 to perform Multiplication");
		System.out.println("press 4 to perform Division");
		System.out.println("press 5 to perform Modulo operator");
		System.out.println("press 6 to exit the application");
		System.out.println("please enter given no for your desire operation");
		Scanner scan = new Scanner(System.in);
		choice =scan.nextInt();
		
		switch(choice)
		{
		 case 1:
			op1 = getData("Operand1");
			op2 = getData("Operand2");
			System.out.println("Addition" + (op1 + op2));
			break;
		

			case 2:
				op1 = getData("Operand1");
				op2 = getData("Operand2");
				System.out.println("Subtraction" + (op1 - op2));
				break;
				

				case 3:
					op1 = getData("Operand1");
					op2 = getData("Operand2");
					System.out.println("Multiplication" + (op1 * op2));
					break;
						

					case 4:
						op1 = getData("Operand1");
						op2 = getData("Operand2");
						System.out.println("Division" + (op1 / op2));
						break;
						

						case 5:
							op1 = getData("Operand1");
							op2 = getData("Operand2");
							System.out.println("Modulous" + (op1 % op2));
							break;
							

							case 6:
								System.out.println("you are about to exit.");
								break;
								
		}
		
	}while(choice!=6);
			
		System.out.println("Thankyou for using our application");
	}
	public static int getData(String name)
	{
		System.out.println("enter the data for" + name);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}
