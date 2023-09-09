package simple;
import java.applet.*;
import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		int num1,num2,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sub=num1-num2;
		System.out.println("Substraction is:"+sub);
	}

}
