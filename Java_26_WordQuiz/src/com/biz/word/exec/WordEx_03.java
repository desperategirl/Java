package com.biz.word.exec;

import java.util.List;

import com.biz.word.domain.WordVO;
import com.biz.word.service.WordListMakeService;
import com.biz.word.service.WordQuizServiceV2;

public class WordEx_03 {
	
	public static void main(String[] args) {
		
		String wordFileName = "src/com/biz/word/필수어휘.txt";
		WordListMakeService wk = new WordListMakeService(); // MakeService로부터 단어를 가져오고
		WordQuizServiceV2 wq = new WordQuizServiceV2(); // QuizServiceV1에 단어를 주입
	
		
		// wk 에서 wordVOList를 만들고 가져오기
		
		// 1. 파일을 읽어서 list를 생성해 두어라
		
		try {
			wk.makeWordList(wordFileName);
			
			// 2. 생성 list를 가져오기
			
			List<WordVO> wordList = wk.getWordVOList();
			
			// 3. wq에게 wordList를 주입하기
			wq.setWordVOList(wordList);
			
			// 4. wq에게 주입된 wordList 중에 한 개를 추출하여 
			//    영단어를 콘솔에 보여라

			
			for(;;) {			wq.viewEngWord();
			wq.quizExec();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

}
