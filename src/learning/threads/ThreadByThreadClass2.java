package learning.threads;

import java.util.Iterator;

public class ThreadByThreadClass2 extends Thread{
	
	@Override
	public void run() {
		for (int i =101 ; i< 201 ; i++) {
			System.out.println("Thread: C2 "+ i);
			
		}
	}

}
