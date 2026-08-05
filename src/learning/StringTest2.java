package learning;

import java.util.HashMap;
import java.util.Map;

public class StringTest2 {

	public static void main(String[] args) {
		passingString("petharasuu");

	}

	private static void passingString(String inputString) {
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(char ch:inputString.toCharArray()) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}else {
				mp.put(ch, 1);
			}
			
		}
		System.out.println("Final output "+mp);
		
	}

}
