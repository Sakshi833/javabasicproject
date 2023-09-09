
package com.deadlock;

public class TestDeadLock {

	public static void main(String[] args) {
		String resource1="Java";
		String resource2="Python";
		
		Thread t1=new Thread() {
			public void run()
			{
				while(true)
			
			{
				synchronized(resource1)
				{
					System.out.println("thread1 occupies resource1"+resource1);
				}
				try
				{
					sleep(100);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(resource2)
				{
					System.out.println("thread2 occupies resource1"+resource2);
				}
			}
			}
		};
		//thread making
		Thread t2=new Thread() {
			public void run() {
				while(true) {
				
				synchronized(resource2) {
					System.out.println("thread2 occupies resource1"+resource2);
				
				}
				try {
				sleep(100);
				}
				catch(InterrupedException e)
				{
					e.printStackTrace();
				}
				synchronized(resource1) {
					System.out.println("thread1 occupies resource1"+resource1);
				}
				}
				
		}

	};
	t1.start();//for calling the thread
    t2.start();
}
}

