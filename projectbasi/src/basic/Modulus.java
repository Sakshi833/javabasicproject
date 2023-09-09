package basic;
import java.util.*;
public class Modulus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS:");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int mod=num1%num2;
		
		System.out.println("MODULUS OF TWO NUMBERS IS:\n"+mod);
	}

}
