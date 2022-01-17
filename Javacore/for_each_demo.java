package Javabasics;

import java.util.Scanner;

public class for_each_demo {

	public static void main(String[] args)
	{
		//for each loop demo
		//please enter the number of element in array
		//prompt to user for the n value
		//read the data and store into array
		// print the data of array for each loop
		
		System.out.println("Please enter the number of elementd in array");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int[] array = new int[n];
		for(int i=1;i<=n;i++)
		{
			System.out.println("please enter value" + i);
			array[i-1]= scan.nextInt();
		}
		
		for(int i: array)
		{
			System.out.println("array value " + i);
		}
		System.out.println("Thank you");
	}
}
