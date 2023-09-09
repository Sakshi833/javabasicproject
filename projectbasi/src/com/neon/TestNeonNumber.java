package com.neon;
import java.util.*;

public class TestNeonNumber {
	public void NeonNumber(int num)
	{
		int square=num*num;
		int sum=0;
		while(square!=0)
		{
			int digit=square%10;
			sum=sum+digit;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println("Number is Neon number");
		}
		else
		{
			System.out.println("Number is not a neon number");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=sc.nextInt();
		TestNeonNumber t= new TestNeonNumber();
		t.NeonNumber(no);

	}

}
