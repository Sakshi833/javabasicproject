package simple;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int ch;
		for(int i=0;i<=n;i++) {
			ch=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ch+"\t");
				ch++;
			}
			System.out.println();
			
		}
	}

}
