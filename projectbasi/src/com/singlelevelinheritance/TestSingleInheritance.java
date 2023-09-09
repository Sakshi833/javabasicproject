package com.singlelevelinheritance;
class Shape{
	double getPerimeteer() {
	return 0.0;
}
	double getArea() {
		return 0.0;
	}
}
class Circle extends Shape{
double radius;
Circle(double radius)
{
	this.radius=radius;
}

double getPerimeter(){
return 2*3.14*radius;
}
double getArea()
{
	return 3.14*radius*radius;
}
}
public class TestSingleInheritance {

	public static void main(String[] args) 
	{
		Circle c=new Circle(2.0);
		double perimeter=c.getPerimeteer();
		System.out.println("Perimeter of circle is "+perimeter);
		double area=c.getArea();
		System.out.println("Area of cirle is "+area);
	}


}
