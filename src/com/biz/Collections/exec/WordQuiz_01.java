package com.biz.Collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordQuiz_01 {

	public static void main(String[] args) {
		
		String strWord = "yestrday";
		
		//문자열을 알파벳단위로 잘라서 무나졍ㄹ배열로
		// 만들어주는 메서드
		String[] words = strWord .split("");
		
		for(int i = 0 ; i < words.length; i++) {
			System.out.println(words[i]);
			
		}
		// Arrays.asList(배열)
		// 배열을 리스트 자료구조로 바꾸 어주는 메서드
		List<String> alpahList = Arrays.asList(words);
		System.out.println(alpahList);
		
		Collections.shuffle(alpahList);
		System.out.println(alpahList);
		

		
	}

}
