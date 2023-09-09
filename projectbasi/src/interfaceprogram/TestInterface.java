package interfaceprogram;
/*interface Vehicle
{   
	int x=5;// public static final int x=7;
	void findType();//abstract method 
	default void display() 
	{
		System.out.println("default method");
	}
	static void work() 
	{
		System.out.println("static mehtod");
	}
}
class Car implements Vehicle
{
	public void findType()
	{
		System.out.println("This is four wheeler Car");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		Car c=new Car();
		c.findType();
		c.display();
		Vehicle.work();

	}

}*/
interface Company
{   
	String name="TaTa";
}
interface Vehicle extends Company
{
	public static final int x=7;
	void findType();//abstract method 
	default void display() 
	{
		System.out.println("default method");
	}
	static void work() 
	{
		System.out.println("static mehtod");
	}
}
class Car implements Vehicle
{
	public void findType()
	{
		System.out.println("This is four wheeler Car");
	}
}
public class TestInterface {

	public static void main(String[] args) {
		Car c=new Car();
		c.findType();
		c.display();
		Vehicle.work();

	}

}