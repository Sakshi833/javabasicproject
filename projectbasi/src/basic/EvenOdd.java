package basic;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AN INTEGER:");
		x=sc.nextInt();
		if(x%2==0)
		{
			System.out.println("NUMBER IS EVEN:");
		}
		else
		{
			System.out.println("NUMBER IS ODD:");
		}

	}

}
