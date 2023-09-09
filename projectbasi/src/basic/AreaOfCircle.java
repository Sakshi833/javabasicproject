package basic;
import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		int radius;
		float area;
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTERR THE AREA OF CIRCLE:");
		
		radius=sc.nextInt();
		area=(float)(3.14*radius*radius);
		System.out.println("AREA OF CIRCLE IS:"+area);
        
	}

}
