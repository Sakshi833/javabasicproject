package basic;
import java.util.*;
public class AreaTriangle {

	public static void main(String[] args) {
		int b;
		int h;
		float area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AREA OF TRIANGLE:");
		
		b=sc.nextInt();
		h=sc.nextInt();
		area=(float)(b*h)/2;
		System.out.println("AREA OF TRIANGLE IS:"+area);
		

	}

}
