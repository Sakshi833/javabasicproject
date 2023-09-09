package simple;
import java.util.*;

public class Addition {

	public static void main(String[] args) {
		int num1,num2,add; //input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:"); //print
		num1=sc.nextInt();
		num2=sc.nextInt();
		add=num1+num2;    //logical part
		System.out.println("Addition of two numbers is:"+add); //print
		}

}
