package learning.tryinterface;

public interface InterfaceA {
	static void methodA() {
		System.out.println("Ststic methodA interface A");
	}
	default void methodB() {
		System.out.println("Default methodB InterfaceA");
	}
	static void methodC() {
		System.out.println("Ststic methodC interface A");
	}
	abstract void methodD();
	
}
