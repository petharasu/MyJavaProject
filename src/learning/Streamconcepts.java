package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamconcepts {

	public static void main(String[] args) {
		 //FilterMethod();
		//StringFilterMethod();
		//SortingMethod();
		//FindingRepeatCharacter();
		calculatingReduce();

	}

//	Source>=====Destination
	// Source - Single - Producer
	// Intermediate 1
	// Intermediate 2
	// Inter
	// Destination - Single - Consumer

	private static void calculatingReduce() {
	    List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
	    int sum = ls.stream()
	                .reduce(1, (a, b) -> a > b ? a : b); // identity 0 ensures no Optional
	    System.out.println(sum); // Output: 15
	}

	private static void FindingRepeatCharacter() {
		//String inputvalue="sweets";
		//String finalvalue;
		List<String> inputvalue1=Arrays.asList("sweets");
		List<String> outputvalue=
				inputvalue1.stream()
				.map((itemvalues)->{
					String finalvalue = null;
					for(int i=0;i<itemvalues.length();i++) {
						for(int j=1;j<itemvalues.length();j++) {
						if(itemvalues.charAt(i)!=itemvalues.charAt(j)) {
							finalvalue+=String.valueOf(itemvalues.charAt(j));
							return finalvalue;
						}
						}
						
					}
					
					return finalvalue;
				})
				.collect(Collectors.toList());
		System.out.println("First non repeating charcter"+outputvalue);
		
	}

	private static void SortingMethod() {
		List<Integer> listOfNumbers=Arrays.asList(2,5,6,8,0,16,78,90,4,5,7,7,9);
		List<Integer> sortedNumbers=
				listOfNumbers.stream()
				.sorted()
				.sorted(Comparator.reverseOrder())
				.skip(1)//where to start
				.limit(1)//
				.collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
	}

	private static void StringFilterMethod() {
		List<String> inputvalue = Arrays.asList("pe", "shiffli", "jhansi");
		List<String> outputvalue = 
				inputvalue.stream()
				//.filter((input) ->input.length() > 3)
				//.filter((input) ->input.startsWith("j"))
				.map((itemInList) ->{
						if(itemInList.length()<3) {
							return itemInList+"invalid input";
						}else{
							return itemInList.toUpperCase();
						}
					})
				.collect(Collectors.toList());
		System.out.println(outputvalue);
	}

	private static void FilterMethod() {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 6, 7, 9, 30, -8, -20);
//		List<Integer> num=numbers1.stream().map(null);
		List<Integer> obj = numbers1.stream()
				.distinct()
				.filter(n -> n % 2 == 0)
				.peek((n) -> {
					System.out.println(n + " filter values");
				})
		        .filter((n) -> {
					if (n >= 1 && n <= 10) {
						return true;
					}
					return false;
				})
		        .map((n) ->{
		        	return n*n;
		        })
		        .map((n) ->{return 1;})
		        .collect(Collectors.toList());
		System.out.println(obj);

	}

}
