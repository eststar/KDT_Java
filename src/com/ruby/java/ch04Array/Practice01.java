package com.ruby.java.ch04Array;

public class Practice01 {
	public static void main(String[] args) {
		int score1 = 49;
		int score2 = 91;
		int score3 = 87;
		int score4 = 67;
		int score5 = 73;
				
		int max = 0;
		int min = 0;
		double avg = 0;
		
		avg = (score1 + score2 + score3 + score4 + score5) / 5.0;
		
		max = score1;
		
		if(max < score2)
			max = score2;
		if(max < score3)
			max = score3;
		if(max < score4)
			max = score4;
		if(max < score5)
			max = score5;
				
		min = score1;
		
		if(min > score2)
			min = score2;
		if(min > score3)
			min = score3;
		if(min > score4)
			min = score4;
		if(min > score5)
			min = score5;
		
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
	}

}
