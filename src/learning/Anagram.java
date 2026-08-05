package learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Anagram {

	public static void main(String[] args) {
		//firstWay("eln","alen");
		//firstWay("eln","len");
		secondWay("elne","len");
		secondWay("eln","len");

	}

	private static void secondWay(String input1, String input2) {
		HashMap<Character,Integer> hm=new LinkedHashMap<Character, Integer>();
		HashMap<Character,Integer> hm1=new LinkedHashMap<Character, Integer>();
		for(char c:input1.toCharArray()) {
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
//		for(char key:hm.keySet()) {
//			System.out.println("key value "+key +"count"+hm.get(key));
//		}
		for(char ch:input2.toCharArray()) {
			hm1.put(ch,hm1.getOrDefault(ch, 0)+1);
		}
		if(hm.equals(hm1)) {
			System.out.println("Anagram");
		}else
		{
			System.out.println("not Anagrams");
		}
	}

	private static void firstWay(String str1,String str2) {
		char[] strtochar=str1.toCharArray();
		char[] strtochar1=str2.toCharArray();
		System.out.println("checking the inputvalue" +Arrays.toString(strtochar));
		HashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		/*
		 * if(str1.length()!=str2.length()) { System.out.println("not anagram"); return;
		 * }
		 */
		for(char charvalue:strtochar) {
			if(hm.containsKey(charvalue)){
				hm.put(charvalue,hm.get(charvalue)+1);
			}else {
				hm.put(charvalue,1);
			}
		}
		
		boolean anagramfornow=false;
		for(char charval:strtochar1) {
			if(hm.containsKey(charval)) {
				System.out.println("value present in map " +charval);
				anagramfornow=true;
				continue;
			}else {
				System.out.println("value not present in map " +charval);
			//	System.out.println("its not a anagram");
				anagramfornow=false;
				break;
			}
		}
		if(anagramfornow) {
			System.out.println("Anagram");
		}else {
			System.out.println("not anagram");
		}
		
//		for(char key:hm.keySet()) {
//			System.out.println("key value "+key +"count"+hm.get(key));
//		}
//		
		
	}

}
