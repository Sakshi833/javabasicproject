package simple;
import java.util.*;

public class MenuDrivenProgram {

	public static void main(String[] args) {
	  
	int num1,num2,add,sub,mul,div,mod;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter addition of two numbers:");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	  add=num1+num2;
	  System.out.println("Additon is:"+add);
	  
	  System.out.println("Enter Substraction of two numbers:");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	  sub=num1-num2;
	  System.out.println("substraction is:"+sub);
	  
	  System.out.println("Enter Multiplication of two numbers:");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	  mul=num1*num2;
	  System.out.println("Multiplication is:"+mul);
	 
	  
	  System.out.println("Enter Division of two numbers:");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	  div=num1/num2;
	  System.out.println("Division is:"+div);
	 
	  
	  System.out.println("Enter Modulus of two numbers:");
	  num1=sc.nextInt();
	  num2=sc.nextInt();
	  mod=num1%num2;
	  System.out.println("Modulus is:"+mod);
	  
	  	  	}

}
