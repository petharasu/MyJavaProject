package interview;

import java.security.PublicKey;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

public class TransactionTest {
	static List<Transaction> inputList=List.of(
			new Transaction("c1", 100),
			new Transaction("c2", 500),
			new Transaction("c1", 300),
			new Transaction("c3", 200),
			new Transaction("c2", 100),
			new Transaction("c4", 1000)			);
	
	public static void main(String args[]) {
		sortingSalary(inputList);
	}

	private static void sortingSalary(List<Transaction> inputList) {
		var result=
		inputList
		.stream()
		.collect(Collectors.groupingBy(item->item.getCustomerId(),
				HashMap::new,
				Collectors.summingDouble(item->item.getAmount())))
		.entrySet()
		.stream()
//		.sorted(Comparator.comparing(Map.Entry	::getValue).reversed())
		.sorted(Map.Entry.<String, Double>comparingByValue()
                .reversed())
		.limit(3)
//		.forEach(item->System.out.println(item.get))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a,b)->a,LinkedHashMap::new));
//		.forEach(item->System.out.println(item.getKey()+"->"+item.getValue()));
		
		for(String key: result.keySet()) {
			System.out.println(key +"-> "+result.get(key));
		}
		
	}

}
