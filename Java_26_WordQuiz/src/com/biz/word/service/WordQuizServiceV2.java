package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

public class WordQuizServiceV2 extends WordQuizServiceV1 {

	// WordVO를 현재 클래스의 모든 method가 볼 수 있다
	// == 값을 읽응ㄹ 수 있다
	
	WordVO wordVO; // = wordVOList.get(index);
	
	int nCount ;
	public WordQuizServiceV2() {
		
		nCount = 0;
			System.out.println();
	}
	
	
	String word; // = wordVO.getEngWord();

	// V1에서 선언된 wordVOList를 사용하기 위해서 제거
	// List<WordVO> wordVOList;

	// V1에서 선언된 setWordVOList()를 사용하기 위해서 제거

	/*
	 * public void setWordVOList(List<WordVO> wordVOList) { this.wordVOList =
	 * wordVOList; }
	 */

	// wordVOList 에서 임의 1개의 영문단어를 추출하여
	// 알파벳을 낱개로 분해한 후
	// 무작위로 섞어서
	// console에 보여주시오

	public void viewEngWord() {
		Random rnd = new Random();
		int nSize = wordVOList.size();

		int index = rnd.nextInt(nSize);

		wordVO = wordVOList.get(index);
		word = wordVO.getEngWord();

		
	}
	// end vieEngWord()
	
	private void viewEngWord(WordVO wordVO) {
		String[] words = word.split(""); // 알파벳 단위로 분해하기

		// 문자열 배열을 문자열형 List로 바꾸는 방법
		List<String> quizWords = Arrays.asList(words);

		System.out.println(quizWords);
		System.out.println();
		
		// 뒤죽박죽 섞는 방법
		for (int i = 0; i < quizWords.size(); i++) {
			Collections.shuffle(quizWords);
			System.out.println(quizWords);
		}

		System.out.println();

		// abc 순으로 정렬하는 방법
		Collections.sort(quizWords);
		System.out.println(quizWords);

	}
	

	/*
	 * viewEngWord() method에서 뒤섞어 보여준 단어의 원형을 키보드로 입력받고 맞는지 틀린지를 보여주는 코드를 작성
	 * 
	 * 예를 들어 [e, n, c, n, c, o, r]를 보여주고 concern이라는 단어를 입력하면 "맞았어요" 아니면 "틀렸어요"를 보여주기
	 */
	public void quizExec() {

		Scanner scan = new Scanner(System.in);

		for (;;) { System.out.print("입력>>");
			String str = scan.nextLine();
			if (str.equalsIgnoreCase(word)) {
				System.out.println("맞았어요");
				break;
			} else {
				System.out.println("틀렸어요");
			}

		}
	}
}
