package learning.clas.Deadlock;

public class LearningDeadLock {
	public static void main(String arges[]) {
		firstWay();
	}

	private static void firstWay() {
		final Object LOCK1 = new Object();
		final Object LOCK2 = new Object();
		Runnable task1=()->{
			synchronized (LOCK1) {
			IO.println("first Thread Started-1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
			synchronized (LOCK2) {
				IO.println("second thread started-1");
			}
		};
		
		Runnable task2=()->{
			synchronized (LOCK2) {
				IO.println("First Thread Started-2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				}
				synchronized (LOCK1) {
					IO.println("second thread started-2");
				}
		};
		
		Thread threadone=new Thread(task1);
		threadone.start();
		
		Thread threadsecond=new Thread(task2);
		threadsecond.start();
		
		
	}
}
