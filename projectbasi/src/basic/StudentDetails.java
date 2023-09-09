package basic;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of student");
		String n=sc.nextLine();
		
		System.out.println("Enter roll no of student");
		int r=sc.nextInt();
		
		System.out.println("Enter marks of student");
		float m=sc.nextFloat();
		
		System.out.println("Enter a fees of student");
		double s=sc.nextDouble();
		
		System.out.println("Enter a gender of student");
		char e=sc.next().charAt(0);
		
		System.out.println("Student Details");
		
		System.out.println("name:"+n);
		System.out.println("roll:"+r);
		System.out.println("marks:"+m);
		System.out.println("fees:"+s);
		System.out.println("gender:"+e);
		

	}

}
