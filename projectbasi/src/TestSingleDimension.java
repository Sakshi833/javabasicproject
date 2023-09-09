import java.util.*;
/*public class TestSingleDimension {
	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		int[]marks=new int[size];
		System.out.println("Enter elements in an array");
		for(int i=0;i<4;i++)
		{
			marks[i]=new Scanner(System.in).nextInt();
			
		}
		System.out.println("Display Array");
		for(int i=0;i<4;i++) {
			System.out.println(marks[i]);
		}
		
		

	}

}*/
public class TestSingleDimension{
	public static void main(String[]args)
	{
		int marks[]= {80,60,40,30};
		for(int i=0;i<4;i++)
		{
			System.out.println(marks[i]);
		}
	}
}