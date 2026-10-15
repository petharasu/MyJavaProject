package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		Map<Integer,Employee> addingEmployees=new LinkedHashMap<Integer, Employee>();
		Employee emp1=new Employee("Arun", 101, "2000");
		Employee emp2=new Employee("karthi", 102, "4000");
		Employee emp3=new Employee("Arun", 103, "7000");
		addingEmployees.put(101, emp1);
		addingEmployees.put(102, emp2);
		addingEmployees.put(103, emp3);
		
//		for(Integer eachEmpid:addingEmployees.keySet()) {
//			Employee eachEmp=addingEmployees.get(eachEmpid);
//			if(eachEmp.getName().equals("Arun")) {
//				IO.println("Arun Salary "+eachEmp.getSalary());
//			}
//		}
		
		addingEmployees.entrySet()
		.stream()
		.map(items->items.getValue())
		.filter(item->item.getName().equals("Arun"))
		.map(item->item.getSalary())
		.forEach(System.out::println);
		
//		IO.println(addingEmployees.get(101).getSalary());
		
	}

}
