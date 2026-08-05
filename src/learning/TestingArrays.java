package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestingArrays {

	public static void main(String[] args) {
		// Create a N size array
		// Load a random N integer values
		// Find max and min values
		Random obj = new Random();
		System.out.println(obj.nextInt(50));
		int arraySize = 8;
		ArrayList<Integer> ls = new ArrayList<Integer>(arraySize);
		for (int i = 0; i < arraySize; i++) {
			ls.add(obj.nextInt(50));
			// System.out.println("output value"+ls);

		}
		System.out.println(ls.toString());
		Collections.sort(ls);
		System.out.println("Sorted list" + ls);
		System.out.println("min value" + ls.get(0));
		System.out.println("max value" + (ls.get(ls.size() - 1)));
	}
}
