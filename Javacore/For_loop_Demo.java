package Javabasics;

import java.util.Scanner;

public class For_loop_Demo {
	
	public static void main(String[] args)
	{
		//user name input , print the name the times
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n=scan.nextInt();
		
		for(int i =0;i<n;i++)
		{
		//	System.out.println(i + " " +"Utkarsh Sahu");
		}
		// print odd even numbers
		
		System.out.println("*****************************************");
		for(int i=0; i<n;i++)
		{	if(i==50)
			{
			//continue
				return;
				
		}
			if(i%2 == 0)
			{
				System.out.println("even"+i);
			}
			else
			{
				System.out.println("odd"+i);
			}
		}
		System.out.println("Program is over");
		
	}

}
