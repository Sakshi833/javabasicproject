package basic;

import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			int x=sc.nextInt();
			int z=5/x;
			}
		finally
		{
			sc.close();
			System.out.println("Finally always executed");
			
		}
      System.out.println("rest of code");
	}

}
