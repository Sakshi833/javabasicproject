package com.superuse;
//Super can be used to invoke immediate parent class instance variable



/*class Bird  //parent class
{
	String name;
	Bird()

{
	name="Different names of birds";
}
void display()
{
	System.out.println("perent class:"+name);
}
}
class Sparrow extends Bird{
	String name;
	Sparrow()
	{
		name="sparrow";
	}
void display()
{
	super.display();
	System.out.println("child class:+"+name);
}
}

public class TestSuper {

	public static void main(String[] args) {
		Sparrow sp=new Sparrow();
		sp.display();

	}

}*/



//Super can be used to refer immediate parent class instance variable
/*class Bird  //parent class

{
	String name;
	Bird()

{
	name="Different names of bird";
}
void display()
{
	System.out.println(name);
}
}
class Sparrow extends Bird{
	String name;
	Sparrow()
	{
		name="sparrow";
	}
void display()
{
	
	System.out.println(super.name+" "+name);
}
}

public class TestSuper {

	public static void main(String[] args) {
		Sparrow sp=new Sparrow();
		sp.display();

	}

}*/

//super()can be invoke immediate parent  class constructor.
/*class Employee
{
	private int id;
	private String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
}
class Manager extends Employee
{
	String task;
	Manager(int id,String name,String task)
	{
		
		super(id,name);
		this.task=task;
	}
	void display()
	{
		super.display();
		System.out.println(task);
	}
}
public class TestSuper {

	public static void main(String[] args) {
		Manager manager=new Manager(101,"Ajay","Employee management task");
		manager.display();
	}
}*/