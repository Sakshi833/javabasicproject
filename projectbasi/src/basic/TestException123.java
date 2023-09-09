package basic;

import java.util.Scanner;

/*public class TestException123 {

	/*public static void main(String[] args) {
		int a[]= {12,13,14,15,16};
		int x=5,y=0;
		try 
		{
			a[5]=x/y;
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("rest of code");

	}

}*/
public class TestException123 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			int x=sc.nextInt();
			int=5/x;
			
		}
		finally {
			sc.close();
			System.out.println("finally always excuted");
		}
		System.out.println("rest of code");
	}
}