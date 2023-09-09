package simple;
import java.util.*;
public class Modulus {

	public static void main(String[] args) {
		int num1,num2,mod;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		mod=num1%num2;
		System.out.println("Modulus of two numbers is:"+mod);

	}

}
