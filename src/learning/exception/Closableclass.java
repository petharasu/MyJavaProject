package learning.exception;

public class Closableclass implements AutoCloseable  {
	public void display() {
        System.out.println("Using resource...");
    }
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
