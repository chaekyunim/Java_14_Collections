package com.biz.Collections.set;

import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {
		
		Set<String> strSet = ArrayList<String>();
		Set<String> strList =HashSet<String>();
		
		// List는 추가한 순서대로 저장이된다
		// 추가한 데이터가 모두 잘 저장이 된다
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("임꺽정");
		strList.add("장길산");
		strList.add("장보고");
		
		// Set은 어떤 원리인지는 모르겠지만 지 맘대로 저장
		// 이 저장도니 값은 다시 저장되지 않는다.
		// 중복된 데이터 제외
		strSet.add("홍길동");
		strSet.add("이몽룡");
		strSet.add("성춘향");
		strSet.add("장보고");
		strSet.add("임꺽정");
		strSet.add("장길산");
		strSet.add("장길산");
		strSet.add("임꺽정");
		strSet.add("장보고");
		
		System.out.println(strList.toString());
		System.out.println(strList.toString());
		
		// List형 데이터를 set형 데이터로 변환
		// list형 담긴 데이터에서 중복값을 제외하고
		// 리스트를 얻기위한 방법
		
		Set<Sstring> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1);
		
		strList = new ArrayList<String>

	}

}
