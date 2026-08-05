package learning;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindNonReaptingChar {

	private static final Object c = null;

	public static void main(String[] args) {
		findNonReaptingChar("Petharasu");

	}

	private static void findNonReaptingChar(String input) {
		char[] arr=input.toCharArray();
		int count=0;
		char initialvalue = 0;
		HashMap<Character,Integer> hm=new HashMap<>();
		System.out.println("char array"+arr);
		for(int i=0;i<arr.length;i++) {
			  initialvalue=arr[i];
			if(hm.containsKey(initialvalue)) {
				hm.put(initialvalue, hm.get(initialvalue)+1);
			}else
			{
				hm.put(initialvalue, 1);
			}
			
		}for(char c:hm.keySet()) {
			System.out.println(c +"count " +hm.get(c));
			
			}
		for (char c : arr) {
            if (hm.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return; // stop after first match
            }
        }
		
	}

}
