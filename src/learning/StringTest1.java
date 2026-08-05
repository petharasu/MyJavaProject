package learning;

import java.util.ArrayList;
import java.util.List;

public class StringTest1 {

	public static void main(String args[]){
		gettingString("i am petharasu","computer","java is more topics");
	}

	private static void gettingString(String... stringsagrments) {
		List<String> al=new ArrayList<String>();
		for(int i=0;i<stringsagrments.length;i++) {
			String splitstring=stringsagrments[i];
			String[] splitValue=splitstring.split(" ");
			for(int j=0;j<splitValue.length;j++) {
				String finalValuetoInsert=splitValue[j];
				al.add(finalValuetoInsert);
			}
			
		}System.out.println("Get the String value based on Index "+al.get(4).toString());
		
	}
	
	 
}
