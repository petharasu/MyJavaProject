package learning;

import java.util.stream.Stream;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LearningStraemApi {

	public static void main(String[] args) {
		Stream.of("first","second","th")
		.map(inputvalue ->inputvalue.toUpperCase())
		.map(LearningStraemApi::reverseStringvalue)
		.filter(checkinglegth -> checkinglegth.length()>3)
		.forEach(System.out::println);

	}
public static String reverseStringvalue(String uppercasevalue) {
		StringBuilder sp=new StringBuilder(uppercasevalue);
		return sp.reverse().toString();
		
	}
}
