package com.copyarray;

public class A {

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {4,5};
		int size=arr1.length+arr2.length;
		int arr[]=new int[size];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr[i];
		}
		for(int j=0;j<arr2.length;j++)
		{
			arr[arr1.length+j]=arr2[j];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
