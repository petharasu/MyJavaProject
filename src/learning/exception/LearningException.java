package learning.exception;

public class LearningException {

	private static Object finaly;

	public static void main(String[] args)  {
		//method1();
		method2();

	}

	private static void method2() {
		try(Closableclass obj=new Closableclass()
				
				){
			
			obj.display();
		}catch(Exception e){
			e.printStackTrace();
		}
			
		 finally {
			    System.out.println("Finally block executed");
			}
		
	}

	private static void method1() {
		int a=10,b=0;
		try {
			int c=a/b;
			throw new Exception("Arithmetic Exp");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
		
	}

}
