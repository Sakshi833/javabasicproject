package basic;
import java.util.*;
public class EvenOddWithOutUsingIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int v=sc.nextInt();
		
		switch(v%2)
		{
		case 0:
			System.out.println("numbers is even.");
			break;
		case 1:
			System.out.println("number is odd.");
		}
	}
	}