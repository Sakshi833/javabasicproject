package basic;

import java.util.Scanner;

/*public class Fact
{

	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+n+"is"+fact);

	}

}*/
/*public class Fact
{
	public static void main(String[]args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+n+"is"+fact);
	}
}*/
/*public class Fact
{
	public static void main(String[]args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+n+"is"+fact);
	}
}*/

/*public class Fact
{
	public static void main(String[]args)
	{
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+n+"is"+fact);
	}
}*/

public class Fact
{
	public static void main(String[]args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
	}
}