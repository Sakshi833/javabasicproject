package basic;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		int num1,num2,div;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO NUMBERS FOR DIVISION:");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		div=num1/(num2);
		
		System.out.println("DIVISION OF TWO NUMBERS IS:"+div);
		

	}

}
