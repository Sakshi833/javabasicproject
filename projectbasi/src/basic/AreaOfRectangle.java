package basic;
import java.util.*;
public class AreaOfRectangle {

	public static void main(String[] args) {
		int length;
		int breadth;
		int area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF RECTANGLE:");
		length=sc.nextInt();
		
		System.out.println("ENTER THE BREADTH OF RECTANGLE:");
		breadth=sc.nextInt();
		
		area=length*breadth;
		System.out.println("AREA OF RECTANGLE:"+area);
		

	}

}
