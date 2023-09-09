package com.prime;
import java.util.*;
public class TestNPrimeNumbers {
	public void CheckPrime(int num1,int num2)
	{
		for(int i=num1;i<=num2;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		TestNPrimeNumbers t=new TestNPrimeNumbers();
		t.CheckPrime(n1, n2);

	}

}
