package basic;

import java.util.Scanner;

public class Largest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		double n1 =sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        
        if(n1>=n2&&n1>=n3)
        {
        	System.out.println("n1 is maximum number");
        }
        else if(n2>n1&&n2>n3)
        {
        	System.out.println("n2 is maximum number");
        }
        else
        {
        	System.out.println("n3 is maximum number");
        }
	}

}
