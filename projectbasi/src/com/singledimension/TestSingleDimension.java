package com.singledimension;
import java.util.*;
//create array object using literal.
//create array object using new keyword.(array always starts with index 0)

/*public class TestSingleDimension {

	public static void main(String[] args) {
		int marks[]= {80,60,40,30};
		for(int i=0;i<4;i++)
		{
			System.out.println(marks[i]);
		}

	}

}*/
//create array object using new keyword
	
public class TestSingleDimension {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of an array");
		size=new Scanner(System.in).nextInt();
		int marks[]= new int[4];
		System.out.println("Enter element in array");//data type variable_name=new ..
		for(int i=0;i<4;i++)
		{
			marks[i]=new Scanner(System.in).nextInt();
		}
		System.out.println("Display Array");

		for(int i=0;i<4;i++) {
			System.out.println(marks[i]);
		}

	}

}
	