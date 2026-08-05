package learning;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {

	//private static int selldate;

	public static void main(String[] args) {
		
		method1();
		int s=maxProfit(1,2);
		//int s=maxProfit(4,5);
		//System.out.println("profit value"+s);

	}

	private static int maxProfit(int buydate,int selldate ) {
		int profit = 0;
		int[] prices = {7,1,5,3,6,4};
		//int[] prices = {7,6,4,3,1};
		
		if(selldate>buydate && selldate!=buydate) {
			
			 profit=prices[selldate-1]-prices[buydate-1];
			 if(profit>0) 
				 return profit;
			 else
				 return 0;
			
		}//System.out.println("profit value"+profit);
		else if(selldate==buydate) {
			return 0;
		}
		return profit;
		
		
	}

	private static void method1() {
		int[] nums = {2,2,1,1,1,2,2,1,1};
		Map<Integer,Integer> hm=new LinkedHashMap<>();
		for(int n:nums) {
			hm.put(n, hm.getOrDefault(n, 0)+1);
		}
		int maxKey=0,maxValue=0;
		for(int keys:hm.keySet()) {
			if(hm.get(keys)>maxValue) {
				maxValue=hm.get(keys);
				maxKey=keys;
			}
		}System.out.println("max value"+maxValue + "max key"+maxKey);
		
	}

}
