package learning.threads;

import java.time.Duration;

public class TryingThreads {
	
	public static int i=0;
	public static void main(String[] args) throws InterruptedException {
//		intro();
//		raceCondition();
		valRef();
	}

	private static void valRef() {
		
		for (int i = 0; i < 12; i++) {
			new Thread(() -> {
				System.out.println("Hello " + Thread.currentThread().getName());	
			}, "Thread "+i).start();
		}
		
	}

	private static void raceCondition() {
		
		Runnable racetask=() ->{
			
//			for(i=0;i<100000000;i++) {
//				
//			}
			System.out.println("result is " + i);
		};
		Thread t1=new Thread(racetask);
		Thread t2=new Thread(racetask);
		Thread t3=new Thread(racetask);
		t1.start();
		t2.start();
		t3.start();
		
	}

	private static void intro() {

//		ThreadByThreadClass1 task1=new ThreadByThreadClass1();
//		ThreadByThreadClass2 task2=new ThreadByThreadClass2();
//		task1.start();
//		task2.start();
//		task1.join();
//		task2.join();
		
		// Using Runnable
		Runnable task3=() ->{
	//		Thread.sleep(5);
			System.out.println("hi Shiffli | " + Thread.currentThread().getName());
		};
		task3.run();
		Thread t1=new Thread(task3, "T1");
		Thread t2 = new Thread(task3,"T2");
		t1.setPriority(2);
		t1.start();
		t2.start();
		//t1.join();
		System.out.println("Main Thread Completed");
	
		// To do: Check thread limit
		
		
}
	
	
}
