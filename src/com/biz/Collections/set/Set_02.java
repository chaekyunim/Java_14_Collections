package com.biz.Collections.set;

import java.util.HashSet;
import java.util.Set;

public class Set_02 {

	public static void main(String[] args) {
		
		
		//저장도니 순서와 무관하게 저장하며
		// 중복된 값이 없도록 중복 
		Set<String> strSet = new HashSet<String>();
	
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		
		
		
		// 중복배제 형태로 저장하며
		// 저장되는 값을 정렬(오름차순)한다.
		Set<String> strSet1 = new HashSet<String>();
		
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");

		System.out.println(strSet);
		System.out.println(strSet1);
	}

}
