package com.methodoverloading;
class Shape
{
	void area(float r)
	{
		System.out.println("circle area="+3.14f*r*r);
	}
	void area(int x)
	{
		System.out.println("square area="+x*x);
	}
	
}
public class Shape1 
{

	public static void main(String[] args)
	{
		Shape s=new Shape();
		s.area(2.0f);
		s.area(3);

	}

}
