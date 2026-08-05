package learning.tryinterface;

public class ClassA implements InterfaceA,InterfaceB{

	@Override
	public void methodD() {
		// TODO Auto-generated method stub
		
	}
//	void methodA() {
//		System.out.println("child class");
//	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		InterfaceA.super.methodB();
	}

}
