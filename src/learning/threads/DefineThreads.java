package learning.threads;

public class DefineThreads extends Thread{
	@Override
	public void run() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Good Morning");
	}
	public synchronized void run1() {
		int a=1;
		for(int i=0;i<1000;i++) {
			System.out.println("printing the value" + i +" a value " + a);
			a++;
		}
		
	}

}
