package Javabasics;

import java.util.Scanner;

public class Decision_making_Demo {
	
	public static void main(String[] args)
	{
		// enter name, enter age
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the name:");
		String name = scan.next();
		System.out.println("enter the age:");
		int age = scan.nextInt();
		if(age>=18)
		{
			System.out.println("Welcome " + name+ " You are eligible for voting.");
		}
		else
		{
			System.out.println("Sorry " + name+ " You are NOT eligible for voting.");
		}
				
	}

}
