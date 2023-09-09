package basic;
import java.util.*;

public class Square3 {

	public static void main(String[] args) {
		Float s,v;
		double squ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER AREA OF SQUARE:");
		
		s=sc.nextFloat();
		v=sc.nextFloat();
		squ=(double)(s*v);
		
		System.out.println("AREA OF SQUARE IS:"+squ);
	}

}
