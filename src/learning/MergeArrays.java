package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {

	public static void main(String[] args) {
		//method1();
		method2();
	}

	private static void method2() {
		int[] nums1 = {1,2,3,2,2,3},nums2 = {2,5,6};
		
	}

	private static void method1() {
		int[] nums1 = {1,2,3,0,0,0},nums2 = {2,5,6};
		List<Integer> al=new ArrayList<Integer>(); 
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]!=0)
			{
				al.add(nums1[i]);
			}
		}
		for(int n1:nums2) {
			if(n1!=0)
			{
				al.add(n1);
			}
		}
		Collections.sort(al);
	   System.out.println(al);
	   
		
		
		
		
		
		
		
	}

}
