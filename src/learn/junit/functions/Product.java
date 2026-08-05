package learn.junit.functions;



public class Product implements Comparable<Product> {
	private String itemname;
	private int itemid;
	
	public Product(String itemname, int itemid) {
		super();
		this.itemname = itemname;
		this.itemid = itemid;
	}
	
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	@Override
	public int compareTo(Product o) {
		Integer callingId=this.itemid;
		return callingId.compareTo(o.itemid);
	}
	
	
}
