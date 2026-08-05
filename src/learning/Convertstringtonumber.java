package learning;

import java.util.HashMap;

public class Convertstringtonumber {

	public static void main(String[] args) {
		ConverstionMethod("three thousand five");// 3050

	}

	private static void ConverstionMethod(String input) {
		String outputvalue = "";
		String outputvalue1 = "";
		String curentValue = "";
		String[] splitvalue = input.split("\\s+");
		System.out.println(splitvalue.length);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("zero", 0);
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);
		hm.put("six", 6);
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("hundred", "00");
		hm1.put("thousand", "000");
		for (int i = 0; i <= splitvalue.length - 1; i++) {
			if (hm.containsKey(splitvalue[i])) {
				outputvalue += hm.get(splitvalue[i]);
			} else {
				if (hm1.containsKey(splitvalue[i])) {
					outputvalue1 = hm1.get(splitvalue[i]);
					// System.out.println(outputvalue1);
					if (outputvalue1.equals("00")) {
						curentValue =curentValue.concat("00");
						//System.out.println("current value" + curentValue);
						outputvalue += curentValue;
					}
					if (outputvalue1.equals("000")) {
						curentValue =curentValue.concat("000");
						outputvalue += curentValue;
					}
				} else {
					outputvalue += outputvalue1;
				}
			}

		}
		System.out.println(outputvalue);
	}

}
