package LearningStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Testclass_02082026 {
	record test(int a) {};

	public static void main(String[] args) {
//		method1(); //1.filter even numbers
//		method2(); //2.upper case
//		method3(); //3.words start A & find char length
//		method4(); //4.Skip duplicates,5.square of each num,6.skip first3 ,7.take the limit 1
		method5(); //remove the "" & null return the non blank string
//		method6(); //extract the domain name after @ symbol
//		method7();//reverse the string
//		method8(); //sum of positive integers
//		method9(); //count the word longer than 4 char
		List<Integer> numbers = List.of(14, 35, 9, 88, 42, 61);
//		method10(numbers); //find the maximum integer
	}

	private static Integer method10(List<Integer> numbers) {
//		List<Integer> numbers = List.of(14, 35, 9, 88, 42, 61);
		var result=numbers.stream()
//		.sorted(Comparator.reverseOrder())
//		.findFirst().orElse(0);
		.mapToInt(item->item)
		.max().orElse(0);
		System.out.println("Max Value  "+result);
		return result;
	}

	
	private static void method9() {
		List<String> words = List.of("cat", "elephant", "dog", "giraffe", "monkey");
		System.out.println(
		words.stream()
		.filter(items->items.length()>3)
		.collect(Collectors.counting()));
	}

	private static void method8() {
		List<Integer> numbers = List.of(-5, 10, -2, 20, 0, 15);
		Integer result=numbers.stream()
		.filter(items->items>=0)
		//.mapToDouble(items->items)
		.mapToInt(items->items)
		.sum();
		
		System.out.println("Add value "+result);
		
		
	}

	private static void method7() {
		List<String> words = List.of("java", "stream", "code");
		System.out.println(
		words.stream()
		.map(items->new StringBuilder(items).reverse())
		.collect(Collectors.toList()));
		Collections.reverse(words);
		
	}

	private static void method6() {
		List<String> emails = List.of("john@gmail.com", "alice@yahoo.com", "bob@outlook.com");
		System.out.println(
		emails.stream()
		.map(items->items.split("@")[1])
		.collect(Collectors.toList()));
	}

	private static void method5() {
		List<String> rawData = Arrays.asList("Java", "      ", null, "  ", "Stream", "API", null);
		var result=
		rawData.stream()
//		.filter(items->items!=null)
//		.map(item->item.trim())
//		.map(items->items.replaceAll("\\s+", " "))
//		.filter(items->(items!=""))
//		.collect(Collectors.toList()));
		.filter(item->(item!=null)&&(!item.isBlank()))
		.toList();
		
		System.out.println(result);
		
	}

	private static void method4() {
		List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 4, 5, 1);
		double response=0.0d;
		Optional<Double> result=numbers.stream()
		.distinct()
		.map(items->Math.pow(items,2))
		.skip(2) //skip first 2 positions
		.limit(1) //take the first one
//		.collect(Collectors.toList()));
		.findFirst();
//		if(result.isPresent()) 
//			response=result.get();
		response=result.orElse(0.0d);
//		System.out.println("method4 output "+result.get());
		
	}

	private static void method3() {
		List<String> words = List.of("Anna", "Alex", "Bob", "apple", "Charlie");
		words.stream()
		.map(items->items.toUpperCase())
		.filter(items->items.startsWith("A",0))
		.map(items->items.length()).toList();
//		.collect(Collectors.toList());
//		.forEach(System.out::println);
		
	}

	private static void method2() {
		List<String> names = List.of("alice", "bob", "charlie", "david");
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

	private static void method1() { 
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers
		.stream()
		.filter(eachitems->eachitems%2==0)
		.forEach(System.out::println);
	}

}
