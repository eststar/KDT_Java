package com.ruby.java.ch04Array;

import java.util.Random;

/*
 * 배열 사용, 난수로 입력된 10명의 성적 평균 구하기
 * Random rd =new Random();
 * score[i] = rd. nextInt(100);//0 ~ 99 정수 생성
 * 
 * 10명 학생의 학점 출력:
 *    ~90 A, ~80 B, ~70 C, ~60 D, 59~ F
 *    출력은 "99점 - A 학점" 등으로 출력한다.
 */
public class Practice03 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] scorenum = new int[10];
		char[] score = new char[10];
		double avg = 0.0;
		
		
		for(int i = 0; i < scorenum.length;i++)
		{
			scorenum[i] = rd.nextInt(100);
			avg += scorenum[i];
			
			if(scorenum[i] >= 90)
				score[i] = 'A';
			else if(scorenum[i] >= 80)
				score[i] = 'B';
			else if(scorenum[i] >= 70)
				score[i] = 'C';
			else if(scorenum[i] >= 60)
				score[i] = 'D';
			else 
				score[i] = 'F';	
		}
		
		avg /= scorenum.length;
		
		for(int i = 0; i < scorenum.length;i++)
		{
			System.out.println(scorenum[i] +" - "+ score[i] +" 학점");
		}
		
		System.out.println("평균 : " + avg);
	}
}
