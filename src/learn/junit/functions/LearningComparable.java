package learn.junit.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class LearningComparable {
	public static void main(String args[]) {
		comparableconcept(); // define the class itself which basics need to compare
		//comparatorconcept(); // create the lamda expression then tell the compare logic
	}

	private static void comparableconcept() {
		
		List<Product> ls=Arrays.asList(
				new Product("firstItem", 101),
				new Product("thirditem", 106),
				new Product("seconditem", 100));
       Collections.sort(ls);
       
       for(Product items:ls) {
    	   System.out.println("Learning Comparable  "+items.getItemid()+" "+ items.getItemname());
       }
		
	}

	private static void comparatorconcept() {
		Comparator<Product> productobject=(o1,o2)->{
			return o1.getItemname().compareTo(o2.getItemname());
		};
		List<Product> ls=Arrays.asList(
				new Product("firstItem", 101),
				new Product("thirditem", 106),
				new Product("seconditem", 100));
       Collections.sort(ls);
      
       for(Product items:ls) {
    	   System.out.println("Learning comparator  "+items.getItemname()+" "+ items.getItemid());
       }
		
	}
	

}
