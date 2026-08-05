package learn.streamapi;

public class Student {
	private String firstName;
	private String lastName;
	private boolean result;
	
	public Student(String firstname,String lastname,boolean result) {
		this.firstName=firstname;
		this.lastName=lastname;
		this.result=result;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	

}
