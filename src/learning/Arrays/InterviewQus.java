package learning.Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQus {

	

	public static void main(String[] args) {
//		moveZerostoLast();
//		charSequence();
		removeCharacter();
		
	}

	private static void removeCharacter() {
		String inputValue="i love india";
		String result=inputValue.chars()
		.mapToObj(eachchar->(char) eachchar)
		.filter(eachchar-> (eachchar!='a' && eachchar!='e'&&eachchar!='i'
		&&eachchar!='o' && eachchar!='u' ))
		.map(String::valueOf)//convert char to string
		
		.collect(Collectors.joining()); //based on string its working
		System.out.println("output result "+result);
		
	}

	private static void charSequence() {
		String inputValue="Welcome to India".toLowerCase();
		Map<Character,Integer> hashmapvalues=new LinkedHashMap<Character,Integer>();
		for(Character eachvalue:inputValue.toCharArray()) {
			if(eachvalue!=' ') {
			hashmapvalues.put(eachvalue, hashmapvalues.getOrDefault(eachvalue, 0)+1);
			}
		}
		System.out.println("final char seq "+ hashmapvalues);
	}

	private static void moveZerostoLast() {
		int arr[]= {7,0,8,0,6,0,4,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("final array "+Arrays.toString(arr));
	}

}
