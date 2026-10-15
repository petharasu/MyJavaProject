package interview;

public class Transaction {
	
	public Transaction(String customerId, double amount) {
		super();
		this.customerId = customerId;
		this.amount = amount;
	}
	private String customerId;
    private double amount;
    
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
    
    

}
