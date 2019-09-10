package com.biz.Collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		
		/*
		 * Collection 프레임워크의
		 *        List,Set과는 다른 형식으 ㅣ데이터 구조이다
		 * list set은 한가지 타입만을 리스트로 포함하는 구조인데
		 * map은 2가지 타입의 자료를 한묶음의 리스트로 포함하며
		 * 키, value 라는 독특한 구조를 가지고 있다
		 * 
		 */
		Map<String, String> strMap = new HashMap<Sting, strMap>();

		// Map에 데이터 추가
		strMap.put("1","홍길동");
		strMap.put("2","성춘향");
		strMap.put("3","이몽룡");
		strMap.put("4","장길산");
		strMap.put("5","임꺽정");
		
		System.out.println(strMap.get(9));
		
	}

}
