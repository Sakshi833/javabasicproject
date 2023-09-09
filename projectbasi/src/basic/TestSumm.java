//factorial
package basic;
import java.util.Scanner;

public class TestSumm {
	public static int fact(int n) {
	int f=1;
	for(int i=1;i<=n;i++) {
		f=f*i;
	}
	return f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int terms=sc.nextInt();
		int sum=0;
		for(int i=1;i<terms;i++) {
			System.out.println(fact(i+1)/i);
		sum=sum+fact(i+1)/i;
		

	}
	}
}
