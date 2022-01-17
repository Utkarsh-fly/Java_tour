package Javabasics;

import java.util.Scanner;

public class Array_Demo1 {

		public static void main(String[] arg)
		{
			// Sum of elements in array demo.
			
		/*	System.out.println("Sum of elements in array demo.\n");
			System.out.println("Please enter the size of array:");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			int[] array = new int[n];//Dynamic array creation
			
			for (int i =0; i<n; i++)
			{
			System.out.println("Please enter the value of index:" +(i+1));
				array[i] = scan.nextInt();
			}
			// for example array = {1,2,3,4,5,6,7,8,9,10}
			long sum = 0;
			
			for(int i=0;i<array.length; i++)
			{
				sum=sum+array[i];
			}
			System.out.println("Sum of the array elements:" +sum); */
			
			// Reverse string demo.
			
			System.out.println("Reverse string demo");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter string which you want to reverse");
			String s = scan.next();// utkarsh
					
			char[] charArray = s.toCharArray();//('u','t','k','r','s','h')
					
			for(int i= charArray.length-1;i>=0;i--)	
			{
				System.out.println(charArray[i]);//hsrktu
			}
			
			
		}
}
