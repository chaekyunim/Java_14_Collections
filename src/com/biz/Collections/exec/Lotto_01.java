package com.biz.Collections.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_01 {

	public static void main(String[] args) {
		
		/*
		 * List를 사용한 로또번호 추출
		 * 1. 정수까ㅃㅅ을 저장할 리스트를 생성
		 * 2. 1 ~45까지의 값을 add()
		 * 3. Collections.shffle()
		 * 4. index 0부터 5번까지 값을 추출해서
		 *   보여주면 된다.
		 */
		List<Integer> lottos = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 100 ; i++) {
		    Collections.shuffle(lottos);
			
	
		}
		for(int i = 0 ; i < 45 ; i++) {
			lottos.add(i+1);
				
			
			

	}
		System.out.println("=====================================================================");
		System.out.println("대박나세요!!!");
		System.out.println("----------------------------------------------------------------------");
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println("%d, ",lottos.get(i));
	
		}
		System.out.println("|n=====================================================================");
}
}
