package basic;
import java.util.*;
public class TestTerms{
	public static int power(int n, int p) {
		int r-=1;
		for(int i=0;i<p;i++) {
			r=r*n;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
	    int terms=sc.nextInt();
	    int temp=1;
	    int temp1=10;
		int sum=0;
		
		while(terms>0) {
			System.out.println(temp+",");
			sum=sum+temp;
			temp=(temp*10)+1;
			--terms;

	}
	System.out.println("\n"+sum);
	int series;
	int sum=0;
	
	for(int i=0; i<terms; i++) {
		series=(int)(i+Math.pow(2,i));
		System.out.println(series+",");
		sum=sum+series;
	}
	System.out.println("\n"+sum);
}
}
