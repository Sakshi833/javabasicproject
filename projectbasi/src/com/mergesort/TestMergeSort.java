package com.mergesort;
import java.util.*;
public class TestMergeSort {
	int[]input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt()
				int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		return a;

	}
	
	int[]sort(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
	
	for(int j=i+1;j<a.length;i++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
		return a;
	}
	void merge(int a[],int b[])
	{
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++);
		c[i]=a[i];
		for(int i=0;i<b.length;i++)
			c[a.length+i]=b[i];
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
	public static void main(String[] args) {
	T

	}

}
