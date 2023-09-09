package basic;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int x=sc.nextInt();
		switch(x%2)
		{
		case 1:
			System.out.println("Number is even.");
			break;
		case 2:
			System.out.println("Number is odd:");
			break;
		}
	

	}

}
