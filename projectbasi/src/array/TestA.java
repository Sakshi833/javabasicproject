package array;

import java.util.*;

public class TestA {
	int[]input()
	{
		int a[]=new int[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
			
		return a;
	}
	}
	void display(int a[]) {
	}
	{
		Object a;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	

	public static void main(String[] args) {
		TestA ob=new TestA();
		int a[]=ob.input();
		ob.display(a);

	}
	

}
