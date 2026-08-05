package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		//method1(arr);
		//method1(arr);
		//method1(arr);
		//System.out.println("one rotation" + Arrays.toString(arr));
		jumpGame();
		hindex();
		//productOfArray();

	}

	private static void productOfArray() {
		//int[] nums = {1,2,3,4};
		int[] nums = {-1,1,0,-3,3};
		int result=1;
		for(int i=0;i<nums.length;i++) {
			//nums[i]=1;
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					result=result*nums[j];
				
				}
				
			}System.out.println("Final Value"+result);
			result=1;
			
		}
		
	}

	private static void hindex() {
		//int[] citations = {3,0,6,1,5};
		int[] citations = {1,3,2};
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int n:citations) {
			al.add(n);
		}
		Collections.sort(al.reversed());
		System.out.println(al);
		int i=1;
		for(int n1:al) {
			if(n1>=i) {
				System.out.println("length values"+i);
				i++;
			}
		}System.out.println("H index Value"+(i-1));
	}

	private static void jumpGame() {
		int[] nums = {2,3,1,1,4,0,1};
		int length=nums[1]+2;
		System.out.println("value" +length);
		for(int i=2;i<length;i++) {
			if(i==nums.length-1)
			{
				System.out.println("true");
				break;
			}if(i!=nums.length-1) {
				System.out.println("false");
				continue;
			}
			i=length;
			length=nums[length];
		} 
		//return false;
		//return 0;
		
	}

	private static int[] method1(int[] arr) {

		// 1.store last value
		int temp = arr[arr.length - 1];
		System.out.println("last variable" + temp);
		// 2.Shift all values to Right
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		// 3.store value in first
		arr[0] = temp;
		return arr;
		// System.out.println("one rotation"+Arrays.toString(arr));
	}

}
