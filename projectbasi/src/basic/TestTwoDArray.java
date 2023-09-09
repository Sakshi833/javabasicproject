package basic;

import java.util.Scanner;

public class TestTwoDArray {

/*public static void main(String[] args) {
		int a[][]= {
				{4,5},
				{5,6},
				{7,8}
		};
		System.out.println(a.length);
		System.out.println("Displaly array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}*/
/*public class TestTwoDArray 
public static void main(String[] args){
int a[][]= new int [3][2];
{
		Scanner sc=new Scanner(System.in);
System.out.println(a.length);
System.out.println("Enter elements in 2D array");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=sc.nextInt();	
		}

	System.out.println();
}
}
//System.out.println(a.length)
System.out.println("Display Array");
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]++"\t");
	}
	System.out.println();
}
}
}*/

/*int [][] input()
{


	int a[][]=new int[3][2];
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter elements in 2D array");
    for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		a[i][j]=sc.nextInt();	
		}

	
}
    return a;
}
void display(int a[][])
{
	System.out.println("Display Array");
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"\t");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	TestTwoDArray ob=new TestTwoDArray();
	int a[][]=ob.input();
	ob.display(a);
	
}
}*/
	
	void display(int a[][])
	{
		System.out.println("Display Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	int [][] input()
	{


		int a[][]=new int[3][2];
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter elements in 2D array");
	    for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();	
			}

		
	}
	    return a;
voi add (int a[][])
	{
		int evenSum=0,oddSum=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
evenSum+=a[i][j];
else
	oddSum+=a[i][j];
			}
			
		}
    System.out.println("EvenSum"+" "+evenSum+""+"oddSum="+oddSum);
	}
	
	public static void main(String[] args) {
		TestTwoDArray ob=new TestTwoDArray();
		int a[][]=ob.input();
		ob.display(a);
		
		int sum=ob.add(a);
		System.out.println(ob.add(a));
		
	}
	}

	