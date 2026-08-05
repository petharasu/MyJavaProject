package learning.tryinterface;

import java.util.concurrent.atomic.AtomicInteger;

public class Tryingout {

	public static void main(String[] args) {
		InterfaceA obj1=new ClassA();
		InterfaceA.methodA();
		AtomicInteger obj=new AtomicInteger(12);
		obj.addAndGet(34);
		obj.get();
		
		
		

	}

}
