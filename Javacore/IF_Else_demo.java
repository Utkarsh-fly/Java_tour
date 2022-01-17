package Javabasics;

import java.util.Scanner;

public class IF_Else_demo {
	
	public static void main(String[] args )
	{
		// if else statement
		// username or password as an input, username = utkarsh pass = 123
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = scan.next();
		System.out.println("Enter password name:");
		String password = scan.next();
		if(username.equals("utkarsh") && password.equals("123"))
		{
			System.out.println("Welcome" + username);
			
		} 
		else
		{
			System.out.println("Sorry!! username or password is not correct.");
		}
				
	}

}
