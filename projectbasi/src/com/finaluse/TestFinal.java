package com.finaluse;
/*class DemoFinal
{
	int num=10;
	void display()
	{
		num++;
		System.out.println(num);
	}
}

public class TestFinal {

	public static void main(String[] args) {
		new DemoFinal().display();

	}

}*/


/*class DemoFinal
{
	int num=10;
	void display()
	{
		num++;
		System.out.println(num);
	}
}

public class TestFinal extends DemoFinal{
	public void display()
	{
		
	
}

	public static void main(String[] args) {
		new DemoFinal().display();

	}

}*/
class DemoFinal
{
	int num=10;
	void display(int x)
	{
		x++;
		num++;
		System.out.println(num);
	}
}

public class TestFinal extends DemoFinal{
	public void display()
	{
		
	
    }

	public static void main(String[] args) {
		new DemoFinal().display(0);

	}

}