package com.interthreadcommunication;

/*class Customer
{
	int amount=10000;
	synchronized public void withdrawl(int amount)
	{
		System.out.println("going to withdrawl");
		if(this.amount<amount)
		{
			System.out.println("less amount waith for deposit");
			try {
			wait();
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
		this.amount-=amount;
		System.out.println("Remaining amount after withdrawl"+this.amount);
	}
	synchronized public void withdrawl1(int amount)
	{
	    System.out.println("Going to deposit");
	    this.amount+=amount;
	    System.out.println("After deposite total amount"+this.amount);
	    notify();
    }
}

class MyThread1 extends Thread
{
	Customer c;
	MyThread1(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.withdrawl(15000);
	}
}
class MyThread2 extends Thread
{
	Customer c;
	MyThread2(Customer c)
	{
		this.c=c;
	}
	public void run()
	{
		c.withdrawl(20000);
	}
}
public class TestInterThreadCommunication {

	public static void main(String[] args) {
	Customer c=new Customer();
	MyThread1 m1=new MyThread1(c);
	MyThread2 m2=new MyThread2(c);
	
	m1.start();
	m2.start();
	

	}

}*/
class Customer
{
	int amount=10000;
	synchronized public void withdrawl(int amount)
	{
		System.out.println("going to withdrawl");
		if(this.amount<amount)
		{
			System.out.println("less amount waith for deposit");
			try {
			wait();
		}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
		this.amount-=amount;
		System.out.println("Remaining amount after withdrawl"+this.amount);
	}
	synchronized public void withdrawl1(int amount)
	{
	    System.out.println("Going to deposit");
	    this.amount+=amount;
	    System.out.println("After deposite total amount"+this.amount);
	    notify();
    }
	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}
public class TestInterThreadCommunication {

	public static void main(String[] args) {
	Customer c=new Customer();
	Thread t1=new Thread() {
		public void run()
		{
			c.withdrawl(15000);
		}
	};
	Thread t2=new Thread() {
		public void run()
		{
			c.deposit(20000);
		}
	};
	
	t1.start();
	t2.start();

}
}

