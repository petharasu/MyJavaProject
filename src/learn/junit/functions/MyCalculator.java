package learn.junit.functions;

import java.util.Arrays;

public class MyCalculator {
	
	// sum(), sub, divide, multiply
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int div(int a,int b) {
		return a%b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int sum(int... a) {
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;
	}

}
