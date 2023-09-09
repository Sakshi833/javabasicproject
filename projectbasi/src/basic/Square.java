package basic;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		int x,y,squ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Area Of Square");
		
		x=sc.nextInt();
		y=sc.nextInt();
		squ=x*y;
		
		System.out.println("Area Of Square:"+squ);

	}

}
