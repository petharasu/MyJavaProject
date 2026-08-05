package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Uniquecharcter {

	public static void main(String[] args) {
		findUniqueCharacter();
	}

	private static void findUniqueCharacter() {
		LinkedList<String> al = new LinkedList<>(Arrays.asList("line", "lastline", "aadd"));
		HashMap<Character,Integer> hm=new LinkedHashMap<>();
		String str="";
		for(int i=0;i<al.size();i++) {
			 str=al.get(i);
			System.out.println(al.get(i));
			char[] inputcharvalue=str.toCharArray();
			for(char c:inputcharvalue) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else
			{
				hm.put(c, 1);
			}
			}
			for(char ch:hm.keySet()) {
				System.out.println("Keyset "+ ch + "  values"+hm.get(ch));
				//System.out.print("----------------------------------");
			}
			System.out.print("----------------------------------");
			/*
			 * for(char c:inputcharvalue) { if(hm.get(c) == 1) {
			 * System.out.println("final value" +c); return; } }
			 */
			hm.clear();
		}
		
	}
	

}
