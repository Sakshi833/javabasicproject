package simple;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		int num1,num2,div;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		div=num1/num2;
		System.out.println("Division of two numbers is:"+div);
	}

}
