package learning.tryinterface;

public interface InterfaceB {

	static void methodA() {
		System.out.println("Ststic methodA interface b");
	}
	default void methodB() {
		System.out.println("Default methodB Interfaceb");
	}
	static void methodC() {
		System.out.println("Ststic methodC interface b");
	}
	abstract void methodD();
	


}
