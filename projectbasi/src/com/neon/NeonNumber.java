package com.neon;
import java.util.*;
public class NeonNumber {

	public static void main(String[] args) {
		int n,sq,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		sq=n*n;
		while(sq>0)
		{
			sum=sum+sq%10;
			sq=sq/10;
			
		}
		if(sum==n)
			System.out.println(n+"is a neon number");
		else
			System.out.println(n+"is not a neon number");

	}

}
