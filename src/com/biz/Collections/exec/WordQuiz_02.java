package com.biz.Collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuiz_02 {

	public static void main(String[] args) {
		
		String word = "yesterday";
		List<String> words = Arrays.asList(word.split(""));
		Scanner scan = new Scanner(System.in);
				
		
		Collections.shuffle(words);
		System.out.println("다음 알파벳을 알맞게 배열하여 단어");
		System.out.println(words);
		System.out.println("=====================================");
		System.out.println("단어 ?>>");
		String strWord = scan.nextLine();
		
		if(word.equalsIgnoreCase(strWord)) {
			System.out.println();
			
		}else

		i
	}

}
