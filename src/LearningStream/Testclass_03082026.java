package LearningStream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Testclass_03082026 {

	public static void main(String[] args) {
//		method1();//product of all integers->need to check
//		method2();//Integer Summary Statistics
//		method3();//Join Strings with Separator
		

	}

	private static void method3() {
		String result="";
		List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date");
		System.out.println("\""+
		fruits.stream()
		.collect(Collectors.joining(","))+"\"");

		
		
	}

	private static void method2() {
		List<Integer> numbers = List.of(10, 20, 30, 40, 50);
		IntSummaryStatistics result=numbers.stream()
		.mapToInt(items->items)
		.summaryStatistics();
		System.out.println("sum of values "+result);
		
	}

	private static void method1() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		int sum=1;
		for(int i=0;i<numbers.size();i++) {
			sum=sum*numbers.get(i);
		}
		System.out.println("final value " + sum);
	}
	

	
}
