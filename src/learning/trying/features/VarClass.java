package learning.trying.features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;

public class VarClass {
	public static void main(String args[]) {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();//readString
//		method6();
		method7();
	}
	
	private static void method7() {
		RandomGenerator ranobj=RandomGenerator.getDefault();
		
		for(int i=0;i<3;i++) {
		IO.println("double "+ranobj.nextDouble(100));
		}
	}

	private static void method6() {
		try {
			Files.writeString(Path.of("C:\\Users\\petha\\OneDrive\\Desktop\\sample.txt"), "Hello Java 11");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method5() {
		try {
			Path path = Path.of("C:\\Users\\petha\\OneDrive\\Desktop\\sample.txt");
			String content = Files.readString(path);
			System.out.println("Reading the content ");
			IO.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method4() {
		String inputName=" hello ";
		IO.println("3 times count "+inputName.repeat(3));
		IO.println("empty  "+inputName.repeat(0));
//		IO.println(""+inputName.repeat(-1));
		IO.println(inputName.stripTrailing());
		String text="""
				{
				"name":"petharasu",
				"id":"101",
				"city":"chennai"
				}
				""";
		IO.println("multiline command " + text);
	}

	private static void method3() {
		String inputValue=" ";//blank
		String inputValue1=" ";//empty
		IO.println("empty length of String "+inputValue1.length());
		IO.println("isBlank-length of string "+inputValue.length());
		IO.println(inputValue1.isEmpty());
		IO.println(inputValue.isBlank());
		
	}

	private static void method2() {
		var name="peth";
		var x=10;
		IO.println(name);
		IO.println(x);
		
	}

	private static void method1() {
		List<String> students = Arrays.asList("peth", "navii", "arivv", "abii");
		students.stream().
		filter((var items) -> items.startsWith("a"))
		.forEach(System.out::println);

		IO.println(students.getClass());

	}

}
