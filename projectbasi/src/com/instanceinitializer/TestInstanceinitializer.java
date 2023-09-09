package com.instanceinitializer;
class Bike
{
	int speed;
	
	Bike()
	{
		System.out.println("default constructor"+speed);
	}//Instance initializer block
	{
		speed=100;
		System.out.println("Instamce Initializer block"+speed);
	}
}
public class TestInstanceinitializer{

	public static void main(String[] args) {
		Bike bike=new Bike();

	}

}
