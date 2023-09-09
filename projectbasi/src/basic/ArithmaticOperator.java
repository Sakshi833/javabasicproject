package basic;
import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int s;
		do
			{
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Reminder");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(n1+n2);
				break;
			case 2:
				System.out.println(n1-n2);
				break;
			case 3:
				System.out.println(n1*n2);
				break;
			case 4:
				System.out.println(n1/n2);
				break;
				default:
					System.out.println("Your choice is wrong");
					}
			System.out.println("Do you want to continue if yes press 1");
				s=sc.nextInt();			
				}while(s==1);
		}

}
