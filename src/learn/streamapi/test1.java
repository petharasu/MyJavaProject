package learn.streamapi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class test1 {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		String inputValue = "chennaitechnicalinterview";

		Character result = inputValue.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                c -> c,
		                LinkedHashMap::new,
		                Collectors.counting()
		        ))
		        .entrySet()
		        .stream()
		        .filter(entry -> entry.getValue() == 1)
		        .map(entry -> entry.getKey())
		        .findFirst()
		        .orElseThrow(() -> new RuntimeException("No unique character"));

		System.out.println(result);
		
		
	}

}
