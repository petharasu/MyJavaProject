package learning.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TryingThreads1708 {
	public static void main(String args[]) {
		method1();
	}

	private static void method1() {
		Runnable task=()->{
			IO.println("Thread Name "+Thread.currentThread().getName());
			for(int i=0;i<5;i++) {
				IO.println(i);
			}
			IO.println(System.currentTimeMillis()/1000);
		};
		
		ExecutorService threadStart=Executors.newFixedThreadPool(3);
		IO.println(System.currentTimeMillis()/1000);
		threadStart.submit(task);
		
		ExecutorService threadStart1=Executors.newVirtualThreadPerTaskExecutor();
		
		threadStart1.submit(task);
	}

}
