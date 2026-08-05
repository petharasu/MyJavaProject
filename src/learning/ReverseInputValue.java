package learning;

public class ReverseInputValue {

	public static void main(String[] args) {
		//ReverseArrayValue();
		//ReverseString("Petharasu");
		 // reverseInteger(123);
		  reverseIntegerway1(-120);

	}
	private static void reverseIntegerway1(int value) {
		int reversevalue=0;
		System.out.println("input value" + value);
		while(value!=0) {
			int inputvalue=value%10;
			reversevalue=reversevalue*10+inputvalue;
			value=value/10;
		}
		System.out.println("Reverse integer"+reversevalue);
		
	}
	private static void reverseInteger(int a) {
		String str=String.valueOf(a);
		char[] charvalue=str.toCharArray();
		System.out.println("String value"+str);
		String output="";
		int inputvalue=0;
		for(int i=str.length()-1;i>=0;i--) {
			output=output+str.charAt(i);
		}if(str.contains("-"))
		{
			inputvalue=Integer.parseInt(output)*-1;
		}else {
			inputvalue=Integer.parseInt(output);
		}
		System.out.println("Final Reverse Value "+inputvalue);
		
	}
	private static void ReverseString(String inputvalue) {
		System.out.println("Inside reverse string");
		for(int i=inputvalue.length()-1;i>=0;i--) {
			char charvalue=inputvalue.charAt(i);
			System.out.print(charvalue);
		}
	}
	public static void ReverseArrayValue() {
		int[] numbers = {10, 20, 30, 40, 50,20,7};
		int output;
		System.out.println("Reverse Arrray ");
		for(int i=numbers.length-1;i>=0;i--) {
			 //output=numbers[i];
			 System.out.print(numbers[i]);
			 System.out.println();
		}
	}

}
