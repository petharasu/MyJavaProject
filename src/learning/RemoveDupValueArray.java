package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDupValueArray {

	public static void main(String[] args) {
		//method1();
		method2();

	}

	private static void method2() {
		int[] input= {3,7,9,7,0,0,4,5,6,6};
		int output= 0;
		for(int i=0;i<input.length;i++) {
			for(int j=1;j<input.length;j++) {
				if(input[i]!=input[j]) {
					//System.out.println("unique value"+input[i]);
					output=input[i];
				}
			}
			System.out.println("unique value"+output);
		}
		
	}

	private static void method1() {
		int[] input= {3,7,9,7,0,0,4,5,6,6};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int a:input) {
			al.add(a);
		}
		List<Integer> output=al.stream()
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(output);
		
		
	}

}
