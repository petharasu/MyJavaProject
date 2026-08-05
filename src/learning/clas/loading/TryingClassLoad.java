package learning.clas.loading;

public class TryingClassLoad {
	public static void main(String[] args) {
		
		RequestClass reqObj = new RequestClass("A", "B", "C");
		
		DbClass dbObj = new DbClass(reqObj);		
		
		
		save(dbObj);
	}
	
	
	
	
	

	private static void save(DbClass reqObj) {
		// TODO Auto-generated method stub
		System.out.println("Saved " + reqObj.getA());
	}
}
