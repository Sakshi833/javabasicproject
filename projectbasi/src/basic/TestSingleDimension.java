package basic;

import java.util.Scanner;

public class TestSingleDimension {
	int[]input(){
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		return a;
	}
	float average(int marks[]) {
		int sum=0;
		for(int m:marks) {
			sum=sum+m;
		}
		return(float)sum/marks.length;
	}
	

	public static void main(String[] args) {
		TestSingleDimension s=new TestSingleDimension();
		
		int a[]=s.input();
		System.out.println(s.average(a));

	}

}
