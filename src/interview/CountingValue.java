package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingValue {
	public static void main(String args[]) {
//		countingValues();
		findTargetValue();
		
	}

	private static void findTargetValue() {
		int[]  inputArray= {2,7,11,15};
		int addedValue=0,target=9;
		for(int i=0;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				addedValue=inputArray[i]+inputArray[j];
//				System.out.println("value "+addedValue);
				if(addedValue==target) {
					System.out.println("first indexs " +i+ "second "+ j);
				}
			}
			
		}
 	}
	

    public int[] twoSum(int[] nums, int target) {
        int addedValue=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                addedValue = nums[i] + nums[j];
                //				System.out.println("value "+addedValue);
                if (addedValue == target) {
                    System.out.println("first indexs " + i + "second " + j);
                    return new int[]{i,j};
                }

            }

        }
            return new int[]{};
    }

	private static void countingValues() {
		List<Integer> inputValues=Arrays.asList(1,2,3,4,4,6,7,3,3);
//		Map<Integer,Long> mapValues=new LinkedHashMap<Integer, Long>();
		System.out.println(
		inputValues.stream()
		.collect(Collectors.groupingBy(items->items,
//				()->mapValues,
				LinkedHashMap::new,
				Collectors.counting()))
		.entrySet()
		.stream()
		.filter(item->item.getValue()>1)
		.collect(Collectors.toList()));
//		.map(item->item.getKey())
//		.forEach(System.out::println);
		

		
	}

}
