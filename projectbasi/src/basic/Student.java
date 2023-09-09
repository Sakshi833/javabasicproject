package basic;
import java.util.*;
public class Student {
	private int rno;
	private String name;
	private int marks;
	
	public Student() {
		
	}
	public Student(int rno,String name) {
		this.rno=rno;
		this.name=name;
	}
	public Student(int rno,String name,int marks) {
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	void input()
	{
		System.out.println("Enter rno,name,marks");
	}
	rno=new Scanner(System.in).nextInt();
	name=new Scanner(System.in).nextInt();
	marks=new Scanner(System.in).nextInt();
}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
