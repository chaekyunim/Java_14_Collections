package com.biz.Collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {
	
	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	
	private Scanner scan;
	
	public WordService( ) {
		
		scan - new Scanner(System.in);
		
		wordList = new ArrayList<String>();
		wordList.add("yesterday");
		wordList.add("morning");
		wordList.add("tomorrowy");
		wordList.add("school");
		wordList.add("computer");
		wordList.add("zoo");
		wordList.add("chair");
		wordList.add("human");

		count = 0;
		
	}
	     public viod shuffle() {
		 
		 // 단어들 리스트르 뒤 섞기
		 Collections.shuffle(wordList);
		 

		 //추출된 단어를 알파벳단위로 나누어 리스트로 변환
		 words = Arrays.asList(word.split(""));
		 
		 
		// 뒤 섞인 단어 리스트에 0번째 단어만 추출
		 word = wordList.get(0);
		 
	 }
	 public void intput( ) {
		 
		 if(count < 1) ;
		 
		 this.makeWord();
		 
		 System.out.println("====================================================");
		 System.out.println("단어만추기 게임!!");
		 System.out.println("----------------------------------------------------");
		 System.out.println("제시한 알파벳을 잘 배열하여");
		 System.out.println("단어를 완성하시오");
		 System.out.println("-----------------------------------------------------");
		 this.viewWord();
		 System.out.println("------------------------------------------------------");
		 System.out.print(">>");
		 String strKetIn = scan.next.Line();
		 if(anyKey.equals("-1")) {
	    	 return true;
		 
		 if(strKeyIn.equalsIgnoreCase(word)) {
			 System.out.println(count + "번만에 맞추었습니다");
				count = 0;
		 }else
			 System.out.println("틀렸습니다");
			count++;
	 }
     System.out.println("Press Any to Continue...");
     strKey anyKey = scan.nextLine();
     if(anyKey.equals("-1")) {
    	 retur true;
    	 
     }

}
