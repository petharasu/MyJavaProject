package LearningStream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Testclass_04082026 {

	public static void main(String[] args) {
//		method1();//filter & return the emp working in IT
//		method2();//extract the product names alone
//		method3();// calculate the sum of Engineering emp salary
		method4();//find the highest paid emp
	}

	private static void method4() {
		List<Employee> employees = List.of(
			    new Employee("Alice", "Sales", 60000, 26),
			    new Employee("Bob", "Sales", 82000, 34),
			    new Employee("Charlie", "Sales", 75000, 29)
			);
		employees.stream()
		.map(items->items.salary())
		.sorted(Comparator.reverseOrder());
	}

	private static void method3() {
		List<Employee> employees = List.of(
			    new Employee("Alice", "Engineering", 90000, 30),
			    new Employee("Bob", "Engineering", 110000, 40),
			    new Employee("Charlie", "HR", 60000, 25)
			);
		Double result=employees.stream()
		.filter(items->items.department().equals("Engineering"))
		.map(items->items.salary())
		.mapToDouble(items->items)
		.sum();
		System.out.println("sum of "+result);
	}

	private static void method2() {
		List<Product> products = List.of(
			    new Product("Laptop", "Electronics", 1200.0, 10),
			    new Product("Phone", "Electronics", 800.0, 25),
			    new Product("Desk", "Furniture", 300.0, 5)
			);
		System.out.println(
		products.stream()
		.map(items->items.name())
		.collect(Collectors.toList()));
		
	}

	private static void method1() {
		List<Employee> employees = List.of(
			    new Employee("Alice", "IT", 75000, 28),
			    new Employee("Bob", "HR", 50000, 35),
			    new Employee("Charlie", "IT", 85000, 32),
			    new Employee("Diana", "Finance", 65000, 30)
			);
		System.out.println(
		employees.stream()
		.filter(items->items.department().equals("IT"))
		.collect(Collectors.toList()));
	}

}
