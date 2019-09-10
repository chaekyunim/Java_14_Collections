package com.biz.Collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_03 {

	public static void main(String[] args) {
		
		
		Set<Integer> strSet = new TreeSet<Integer>();
		Random rnd = new Random();
		
		for(int i= 0 ; i < 10 ; i++) {
			strSet.add(rnd.nextInt(10));
			
		
		}
		System.out.println(strSet);
		
		Set<String> strSet1 = new TreeSet<String>();
		
		/*
		 * 문자열을 TreeSet에 저장할때
		 * 문자열의 자릿수 길이가 일정하지 않으면
		 * 원하는대로 정렬이 이루어지지않을수 있다.
		 */
		
		for(int i = 0 ; i < 10 ; i++) {
			strSet.add (String.format("%2d",rnd.nextInt(100));
			
			
		}
		System.out.println(strSet1);



	}

}
