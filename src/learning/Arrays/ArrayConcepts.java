package learning.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayConcepts {

	public static void main(String[] args) {
		int returnvalue=method1();
		System.out.println("Final Output "+returnvalue);

	}

	private static int method1() {
		int arr[]= {2,2,5,6,-2};
		int firstsum = 0,secondsum = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==2) {
				continue;
			}
			if(i<=1) {
				firstsum+=arr[i];
			}else {
				secondsum+=arr[i];
			}
		}
		System.out.println(firstsum);
		System.out.println(secondsum);
		if(firstsum==secondsum) {
			return 5;
		}else {
			return -1;
		}
	}

}
