package com;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int even=0,odd=0;
		
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
			even++;
		    }
			else
			{
				odd++;
			}
		}
		System.out.println("Conents of array:");
			for(int i=0;i<10;i++)
		

	}
}
