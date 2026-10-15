package learning.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {

	public static void main(String[] args) {
		method1();
		
	}

	private static void method1() {
		Map<Character,Integer> countingtheChar=new LinkedHashMap<Character,Integer>();
		 String str1 = "listen";
	     String str2 = "silent";
	     
	     if(str1.length()!= str2.length()) {
	    	 IO.println("Not a anagram");
	     }
	     
	     for(char charval:str1.toCharArray()) {
//	    	 int gettingTheCurrentVal=countingtheChar.get(charval);
//	    	 gettingTheCurrentVal++;
	    	 countingtheChar.put(charval, countingtheChar.getOrDefault(charval, 0)+1);
//	    	 countingtheChar.put(charval, gettingTheCurrentVal);
	     }
		System.out.println(countingtheChar);
		
		for(char charval:str2.toCharArray()) {
			countingtheChar.put(charval, countingtheChar.getOrDefault(charval, 0)-1);
//	    	 countingtheChar.put(charval, gettingTheCurrentVal);
		}
		System.out.println("second paert "+countingtheChar);
		boolean isvalid=false;
		for(int keys:countingtheChar.values()) {
			if(keys!=0) {
				isvalid=false;
				break;
			}else {
				isvalid=true;
				continue;
			}
		}if(isvalid) {
			IO.println("Anagram");
		}else {
			IO.println("not");
		}
		
	}

}
