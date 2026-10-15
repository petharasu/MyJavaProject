package learning.threads;

public class TryingThreads1 {

	public static void main(String[] args) throws InterruptedException {
		//Firstway();
		//SecondWay();
		//Thirdway();//race condition
		//Fourthway();// synchronization
		Sixthway();
}

	private static void Sixthway() throws InterruptedException {
		DefineThreads t1=new DefineThreads();
		t1.start();
		
		Runnable task=()->{
			System.out.println("Good Afternoon");
		};
		Thread t2=new Thread(task);
		t1.join();
		t2.start();
		t2.join();
		System.out.println("Good Night");
		
	}

	private static void Fourthway() throws InterruptedException {
		DefineThreads t1=new DefineThreads();
		t1.run1();
		Thread.sleep(4000);
		DefineThreads t2=new DefineThreads();
		t2.run1();
		
		
	}

	private static void Thirdway() {
		Runnable task=()->{
			for(int i=0;i<1000;i++) {
				System.out.println("printing the value" + i);
			}
		};
		Thread t1=new Thread(task);
		t1.start();
		Thread t2=new Thread(task);
		t2.start();
		Thread t3=new Thread(task);
		t3.start();
		
	}

	private static void SecondWay() {
		Runnable task1=()->{
			System.out.println("lamda expression");
		};
		DefineThreads1 runnable=new DefineThreads1();
		Thread t1=new Thread(runnable);
		t1.start();
		new Thread(task1).start();
	}

	private static void Firstway() {
		Thread t1 = new DefineThreads();
		t1.start();
		System.out.println("main thread completed");

	}

}
