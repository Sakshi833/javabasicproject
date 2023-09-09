package basic;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {
		int a[]= {12,13,14,15,16};
		int x=5,y=2;
		try
		{
			a[5]=x/y;
			
		}
		catch(ArrayIndexOutOfBoundsException e)
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

}
