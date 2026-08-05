package learning;

public class ValidPalindrome {

	public static void main(String[] args) {
		firstWay("A man, a plan, a canal: Panama222");
		firstWay("A man");
		firstWay(" ");
	}

	private static void firstWay(String inputvalue) {
		String inputvalue1=inputvalue.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(inputvalue1.strip());
		String reverse="";
		for(int i=inputvalue1.length()-1;i>=0;i--) {
			reverse=reverse+inputvalue1.charAt(i);
			
		}
		System.out.println("Reversed String " + reverse);
		if(inputvalue1.equals(reverse)) {
			System.out.println("valid palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
