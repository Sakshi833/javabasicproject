package com.nested;
/*class A
//member class
{
	int data=20;//data member
	void display()//member function
	{
		B ob=new B();
		ob.msg();
	}
	class B
	{
		void msg()
		{
			System.out.println("Inside B"+data);
		}
		
	}
}

public class TestNestedClass {

	public static void main(String[] args) {
		A ob=new A();
		ob.display();

	}

}*/


//local Inner class:
/*class Outer
{
	int x=10;
	void display()
	{
	   class Inner{
		   void msg() {
			   System.out.println("inside displaly");
		   }
	   }
	   Inner ob=new Inner();
	   ob.msg();
	}
}
public class TestNestedClass {

	public static void main(String[] args) {
		Outer ob=new Outer();
		ob.display();

	}

}*/

//Anonymous inner class ..... it has no name

/*abstract class Vehicle
{
    abstract void details();
}
public class TestNestedClass {

	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
				{
			void details()
			{
				System.out.println("company Maruti");
			}
			
			};
			v.details();
}
}*/

/*interface Vehicle
{
	 void details();
}
public class TestNestedClass{
	public static void main(String[] args)
	{
		Vehicle v=new Vehicle()
				{
			public void details()
			{
				System.out.println("company Maruti");
			}
			
			};
			v.details();
}

}*/

//with thread innerclass
/*public class TestNestedClass{
	public static void main(String[] args)
	{
		Thread t=new Thread()
				{
			public void run()
			{
				System.out.println("create a thread using inner class");
			}
			
			};
		  
		t.start();
}

}*/

//Inner class usigRunnable
/*public class TestNestedClass{
	public static void main(String[] args)
	{
		Runnable r=new Runnable()
				{
			public void run()
			{
				System.out.println("create a thread using inner class");
			}
			
			};
		  
		new Thread(r).start();
}

}*/

class Outer
{
	static int data=10;
	static class Inner{
		int y=20;
		void msg()
		{
			System.out.println(data+y);
			
		}
	}
}
public class TestNestedClass{
public static void main(String[] args)
{
	Outer.Inner ob=new Outer.Inner();
	ob.msg();
}
}