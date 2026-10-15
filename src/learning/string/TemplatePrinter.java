package learning.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TemplatePrinter {

	public static void main(String[] args) {
		
		//method1();
		//method2();
//		method3();
//		reverseEachword();
		method4();
		

	}

	private static void method4() {
		
			String input="i love india";
			System.out.println(
			input.chars()
			.mapToObj(eachchar->(char)eachchar)
			.filter(eachchar->(eachchar!='a' && eachchar!='e'
					&& eachchar!='i'&& eachchar!='o'&& eachchar!='u'))
			.map(String::valueOf)
			.collect(Collectors.joining("")));
			
		
		
		
	}

	private static void reverseEachword() {
		String input="welcome to the fss for inteview";
		String[] str1=input.split(" ");
		
		//String[] str2=input.substring(0, input.indexOf(" "))[];
		String output="";
		for(String words:str1) {
			StringBuilder obj=new StringBuilder(words);
			output	= output+" " + obj.reverse().toString();
		}
		System.out.println("reverse of "+output);
	}

	private static void method3() {
		String inputValue="welcome     to @ the fss for #inteview";
		String output=inputValue.chars()
		.mapToObj(items-> (char) items) 
		.filter(eachchar-> eachchar!='@' && eachchar!='#')
		.map(String::valueOf)
		.collect(Collectors.joining(""))
		.replaceAll("\\s+"," ");
		IO.println("the final output is "+ output);
		
	}

	private static void method2() {
		String inputValue="welcome     to @ the fss for #inteview".trim().replaceAll("\\s+", " ");
		
		String outputValue="";
		for(int i=0;i<inputValue.length();i++) {
			if(inputValue.charAt(i)!='&'&&inputValue.charAt(i)!='@'
					&&inputValue.charAt(i)!='#') {
				outputValue=outputValue+inputValue.charAt(i);
			}
		
			
		}
		System.out.println("Final String " + outputValue);
	}

	private static void method1() {
		String template="NAME_CURCY_R1, ARowNum, Row1, Row1b\r\n"
				+ "NAME_CURCY_R2, BRowNum, Row2, Row2b\r\n"
				+ "NAME_CURCY_R3, CRowNum, Row3, Row3b";
		List<String> currencylist=Arrays.asList("AED", "INR", "USD", "EUR", "AUD");
		int startingVal = 12;
		
		for(String curr:currencylist) {
			String currencyUpdated = template.replace("CURCY", curr);
			String rowNumUpdated = currencyUpdated.replace("RowNum", (startingVal)+"");
			System.out.println(rowNumUpdated);
			startingVal+=10;
		}
		
	}

}
