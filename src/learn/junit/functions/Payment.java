package learn.junit.functions;

public sealed class Payment permits Card,UPI{
	public static void display() {
		IO.println("Display Method");
	}

}
