package learning;

import java.util.LinkedHashMap;

public class Romantointeger {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		//String s = "IV";
		String s="IV";
		long result=0;
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		for(char eachchar:s.toCharArray()) {
			if(hm.containsKey(eachchar+"")) {
				result=result+hm.get(eachchar+"");
			}
		}System.out.println("Final Result"+result);
		
		
	}

}
