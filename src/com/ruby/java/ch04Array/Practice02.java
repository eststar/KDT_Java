package com.ruby.java.ch04Array;

public class Practice02 {
	public static void main(String[] args) {
		int[] price = {49, 91, 87, 67, 73};
		
		int priceMax = 0;
		
		for(int num : price)
		{
			if(priceMax < num)
				priceMax = num;
		}
		
		System.out.println("최대값 = " + priceMax);
	}

}
