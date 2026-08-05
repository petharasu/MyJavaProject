package learning;

public class Checkcharacter {

	public static void main(String[] args) {
		checkCharacterValue("sadbutsad","sad");
		checkCharacterValue("leetcode","leeto");
	}

	private static int checkCharacterValue(String str1,String str2) {
		if(str2.contains(str1)) {
			System.out.println("0");
			return 0;
		}else {
			System.out.println("1");
			return -1;
		}
		
	}

}
