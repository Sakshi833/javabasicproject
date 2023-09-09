package basic;
import java.util.*;
public class AreaOfSquare3 {

	public static void main(String[] args) {
		int side;
		int area;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AREA OF SQUARE:");
		
		side=sc.nextInt();
		area=sc.nextInt();
		
		area=side*side;
		System.out.println("AREA OF SQUARE IS:"+area);
		

	}

}
