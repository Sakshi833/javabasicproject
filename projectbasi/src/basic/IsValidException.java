package basic;

/*class IsValidException extends RuntimeException{
	IsValidException (String s)
	{
		super(s);
	}
}
public class IsValidException
{
	static void IsValidException(int empId) {
		if(empId<0||empId>999)
		{
			try
			{
				throw new InvalidException ("Negative number Exception");
			}
			catch(InvalidException e)
			{
				System.out.println(e);
				System.out.println(e.getMessage());
				e.getMessage();
			}
		}
		else
			
		
		{
		System.out.println("Id is not valid");
		

	}

}
	public static void main(String[]args) {
		IsValid(5);
		IsValid(-6);
		System.out.println("rest if code");
	}
}*/
class IsValidException extends Exception{
	IsValidException (String s)
	{
		super(s);
	}
}
