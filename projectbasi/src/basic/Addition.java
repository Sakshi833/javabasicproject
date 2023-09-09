package basic;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		int num1,num2,add;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ADDITION OF TWO NUMBERS:");
		
		num1=sc.nextInt();
		num2=sc.nextInt();
		add=num1-(-num2);
		
		System.out.println("ADDITION OF TWO NUMBERS IS:"+add);
		

	}

}
