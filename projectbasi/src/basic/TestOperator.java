package basic;

import java.util.Scanner;

public class TestOperator {

	public static void main(String[] args) 
	{
		int n1,n2;
		do
		{
			System.out.println("Addition");
			System.out.println("Multiplication");
			System.out.println("Division");
			System.out.println("Enter yor choice");
			
			Scanner sc= new Scanner(System.in);
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				int a=5,b=3;
				System.out.println(n1+n2);
				break;
			case 2:
				int a1=5,b1=7;
				System.out.println(n1*n2);
				break;
			case 3:
				int a2=8,b2=6;
				System.out.println(n1/n2);
			break;
			default:
				System.out.println("do you want to continue");
			}
			while(n<0);
			System.out.println("you are out of loop");
			
		}

	}

}
