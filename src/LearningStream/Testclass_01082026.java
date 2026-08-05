package LearningStream;

import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Testclass_01082026 {
	public static void main(String args[]) {
		
		
				
		//System.out.println("String Value "+ isvalue);
		method1();
	}

	private static void method1() {
		List<String> input= List.of("$12.50", "$1.99", "invalid", "null", "$100", "");
		DoubleSummaryStatistics result=input.stream()
		.filter(items->items.startsWith("$",0))
		.map(items->items.substring(1))
		.map(items->Double.valueOf(items))
		.mapToDouble(items->items)
		.summaryStatistics();
		System.out.println("sum of value "+result.getSum() +" Average value "+ result.getAverage());
		
	}
}
