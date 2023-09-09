package com.threadgroup;

class MyThread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class TestThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup tg=new ThreadGroup("Parent Group");
		MyThread m=new MyThread();
		Thread t1=new Thread(tg,m,"One");
		t1.start();
		
		Thread t2=new Thread(tg,m,"Two");
		t2.start();
        
		Thread t3=new Thread(tg,m,"Three");
		t3.start();
		
		System.out.println(tg.activeCount());//3
		tg.list();


	}

}
