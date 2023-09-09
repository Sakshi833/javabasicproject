package basic;
import java.util.*;
/*public class TestException {

	public static void main(String[] args)
	{
		int a[]= {12,13,14,15,16};
		int x=5,y=0;
		try
		{
			a[5]=x/y;
		}
		catch(ArrayIndexOutOfBoundsException e)
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
public class TestException {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
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
}