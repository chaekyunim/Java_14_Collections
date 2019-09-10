package com.biz.Collections.map;

import java.util.Map;

import com.biz.Collections.model.GradeVO;

public class Map_04 {

	public static void main(String[] args) {
		
		/*
		 * map 데이터 구조
		 * 데이터를 저장할때 키 value의 쌍 으로 put을 하며
		 * 데이터를 조회 할때 키 값만으로
		 * 빠르고 쉽게 찾을수 있따.
		 * 데이터가 어떤 위치에 있는지 몰라도
		 * 내용으로 검색하는 연상검색 기능을 구현한다.
		 */
		
		Map<String,GradeVO> grades = new HachMap<String,String>();
		
		GradeVO vo = new GradeVO();
		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		grades.compute("홍길동", VO);
		
		vo.setStrName("성춘향");
		vo.setIntKor(55);
		vo.setIntEng(77);
		vo.setIntMath(66);
		grades.compute("성춘향", VO);
		
		vo.setStrName("장길산");
		vo.setIntKor(33);
		vo.setIntEng(44);
		vo.setIntMath(68);
		grades.compute("장길산", VO);
		
		System.out.println("성춘향의 성적:" + grade.get("tjdcnsgid").toString() );



	}

}
