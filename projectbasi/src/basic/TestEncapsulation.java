package basic;
class person
{
	private int id;
	private String name;
	private int age;
	private String country;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	} 
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getCountry()
	{
		return country;
	}
	
	
	
}

public class TestEncapsulation {

	public static void main(String[] args) {
		person person=new person();
		System.out.println(person.getId()+" "+person.getName()+" "+person.getAge()+" "+person.getCountry());
		person.setId(101);
		person.setName("sakshi");
		person.setAge(23);
		person.setCountry("India");
		System.out.println(person.getId()+""+person.getName()+""+person.getAge()+""+person.getCountry());
		

	}

}
/*
class Circle
{
	private float radius;
	
	
	
	public void setRadius(float radius)
	{
		this.radius=radius;
	}
	public float getRadius()
	{
		return radius;
	}
	
float calculateArea()
{
	float r=5;
	float area=3.14f*r*r;
	System.out.println("Area of circle is"+area);
	return area;
}

float calculatePerimeter()
{
	float r=5;
	float perimeter=2*3.14f*r;
	System.out.println("Area of perimeter is"+perimeter);
	return perimeter;
}

}


public class TestEncapsulation {

	public static void main(String[] args) {
		Circle circle=new Circle();
		float area=circle.calculateArea();
		float perimeter=circle.calculatePerimeter();
		System.out.println(circle.getRadius()+""+area+""+perimeter);

	}
}*/

