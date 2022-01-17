package Javabasics;

public class Array_Demo {
	
	public static void main(String[] args)
	{
		int arr[]= { 5,6,7,8,9};
		
		System.out.println(arr);//[I@base address of array]
		
		System.out.println(arr[1]);//6
		
		System.out.println(arr.length);//5
		
		String[] sarray = {"A","B"};
		
		System.out.println(sarray);//[L@base address]
		
		
		//dynamic array
		System.out.println("*********DYNAMIC ARRAY EXAMPLE*******************");
		
		int dynamicArray[] = new int[10];
		
		for(int i = 0; i<dynamicArray.length;i++)
		{
			dynamicArray[i] = i+1;// dynamicArray[0] = 1;
		}
		
		for(int i =0; i<dynamicArray.length;i++)
		{
			System.out.println(dynamicArray[i]);
		}
	}

}
