package learning.clas.loading;

public class DbClass {
	private String a;
	private String b;
	private String c;

	public DbClass() {

	}

	public DbClass(String a, String b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public DbClass(RequestClass passedObj) {
		this.a = passedObj.getA();
		this.b = passedObj.getB();
		this.c = passedObj.getC();

	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

}
