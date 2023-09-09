package simple;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		int b; //breadth
		int h; //height
		float area; //area
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of breadth and hight:");
		
		b=sc.nextInt();
		h=sc.nextInt();
		
		area=(float)(b*h)/2;
		
		System.out.print("Area of the triangle="+area);

	}

}
