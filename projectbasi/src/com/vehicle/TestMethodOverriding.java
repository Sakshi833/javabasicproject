package com.vehicle;
class Vehicle
{
	String name="Tata Vehicles";
	void display()
	{
		System.out.println("vehicle");
	}
}
class Car extends Vehicle
{
	String name="Tata Nano";
	void display()
	{
		System.out.println("Car");
	}
}
public class TestMethodOverriding {

	public static void main(String[] args) {
		Vehicle v=new Car();
		System.out.println(v.name);
		v.display();

	}

}
