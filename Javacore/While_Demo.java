package Javabasics;

import java.util.Scanner;

public class While_Demo {
	
	public static void main(String[] args)
	{
		//user enter the number & check the number of digits
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number:");
		long l = scan.nextLong();
		long count =0;
		while(l>0)
		{
			count ++;
			l/= 10;
			
		}
		
		System.out.println("No of digits :" + count);
	}
	

}
