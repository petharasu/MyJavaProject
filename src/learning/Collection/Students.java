package learning.Collection;

import java.util.Comparator;
import java.util.Objects;

public class Students  implements Comparable<Students>{
	private String name;
	private int id;
	
	public Students(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}


	@Override
	public int compareTo(Students o) {
		Integer currentVal = this.id;
		Integer nextVal = o.id;
		
		return currentVal.compareTo(nextVal);
		
		

	}


	@Override
	public int hashCode() {
		System.out.println("--");
		return Integer.hashCode(this.id);
		
	}


	@Override
	public boolean equals(Object obj) {
	    System.out.println("----");

	    if (this == obj)
	        return true;

	    if (obj == null || getClass() != obj.getClass())
	        return false;

	    Students other = (Students) obj;

	    return this.id == other.id;
	}
	
	
	

}
