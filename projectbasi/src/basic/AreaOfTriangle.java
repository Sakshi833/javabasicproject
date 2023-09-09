package basic;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		int b;
		int h;
		float area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Area of Triangle:");
		
		b=sc.nextInt();
		h=sc.nextInt();
		area=(float)(b*h)/2;
		
		System.out.println("Area of Triangle is:"+area);

	}

}
