package simple;
import java.util.Scanner;
public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0)
				hcf=i;
		}
	       System.out.println("hcf="+hcf);

	}

}
