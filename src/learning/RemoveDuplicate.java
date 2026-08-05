package learning;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		findingDuplicate(); //remove the duplicate values

	}

	private static void findingDuplicate() {
		int arr[]= {3,6,7,8,1,2,3,6,1};
		Arrays.sort(arr);
		System.out.println( Arrays.toString(arr));
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=i+1;j<arr.length-1;j++) {
		 * for(arr[i]) } }
		 */
		
	}

}
