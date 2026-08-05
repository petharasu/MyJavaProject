package learn.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearningStream {

	public static void main(String[] args) {
		//method1();
		//method2();
		
//		List.of(1,2,3,4,5)
//		.stream().filter(v -> v%2==0)
//		.collect(Collectors.toList());
		

	}

	private static void method2() {
		Student stuobj=new Student("petharasu","S", false);
		Student stuobj1=new Student("shiffli","S", true);
		Student stuobj2=new Student("karthi","k", true);
		
		List<Student> listofStudent=
				new ArrayList<Student>(Arrays.asList(stuobj,stuobj1,stuobj2));
		
		List<String> list1=listofStudent.stream()
		.filter(result->{return result.isResult();})
		.map(resultValue ->resultValue.getFirstName()+ resultValue.getLastName()+" Passed")
		.collect(Collectors.toList());
		//.forEach(Namelist-> System.out.println("Congrats "+Namelist.getFirstName()+Namelist.getLastName() +" you are Passed the exam"));
		System.out.println(list1);
	}
	


	private static void method1() {
		String uniqueId=UUID.randomUUID().toString();
		System.out.println(uniqueId.length());
	}

}
