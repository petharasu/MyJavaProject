package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Leetcode58 {

	public static void main(String[] args) {
		// find the length of last word
		// method1();
		// longest common prefix
		// method2();
		// find index of first occurence
		// method3();
		

	}

	private static void method3() {
		String str1 = "sadbutsad", str2 = "sad";
		boolean isvalue = false;
		int i = 1;
		// str1.indexOf(str2);
		if (str1.substring(i, str2.length() - 1).equals(str2)) {
			System.out.println("index " + i);
		}
		i = i + str2.length() - 1;
	}

	private static void method2() {
		String[] inputStrings = { "flower", "flow", "floght" };
		String reference = inputStrings[0];
		String commonChar = "";
		boolean isMatching = false;
		for (int i = 0; i < reference.length(); i++) {
			char referenceChar = reference.charAt(i);
			System.out.println("Checking " + referenceChar);
			isMatching = false;
			for (int j = 1; j < inputStrings.length; j++) {
				String curWord = inputStrings[j];
				if (i > curWord.length() - 1)
					continue;
				char currentChar1 = curWord.charAt(i);
				if (referenceChar == currentChar1) {
					isMatching = true;
					continue;

				} else {
					isMatching = false;
					break;
				}
			}
			if (isMatching) {
				System.out.println("i is present" + referenceChar);
			} else {
				// break;
			}
		}

	}

	private static void method1() {
		String input = "luffy is still joyboy".trim();
		String[] words = input.split("\s+");
		System.out.println(Arrays.toString(words));
		String finalvalue = words[words.length - 1];
		System.out.println("length of last word " + finalvalue.length());

	}

}
