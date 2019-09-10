package com.biz.Collections.map;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

import com.biz.Collections.model.GradeVO;

public class Map_05 {

	private static final BiFunction<? super String, ? super GradeVO, ? extends GradeVO> VO = null;

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
		
		vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(55);
		vo.setIntEng(77);
		vo.setIntMath(66);
		grades.compute("성춘향", VO);
		
		//Map에 저장된 데이터 전체를 조회하고자 할때
		// 기본적으로 맵은 저장된 리스트르 조회하는데
		// 불편한 부분이 있따
		// 그래서 트릭을 쓰는데
		
		//1. 맵 데이터에 저장된 키만 따로 떼어서
		//      set에 담는다.
		//2. 키를 for반복문으로 처리하려
		//   각 항목을 get(key) aptjemfmf xhdo
		//   값을 읽어낸다.
		
		Set<String> gradeKeys =grades.keySet();
		for(String s : gradeKeys) {
			GradeVO vo1 = grades.get(s);
			System.out.println(vo1.equals(toString);
		}
		vo = new GradeVO();
		vo.setStrName("장길산");
		vo.setIntKor(33);
		vo.setIntEng(44);
		vo.setIntMath(68);
		grades.compute("장길산", VO);
		
		System.out.println("성춘향의 성적:" + grade.get("tjdcnsgid").toString() );



	}

}
