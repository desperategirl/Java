package com.biz.dp.exec;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreVO scoreVO = new ScoreVO();
		
		ScoreVO scoreBVO = new ScoreVO.Builder()
				.s_num("001")
				.s_kor(90)
		  		.s_eng(80)
		  		.s_math(70).build();
		
		scoreList.add(scoreBVO);
		
		scoreList.add(new ScoreVO.Builder()
				.s_num("002")
				.s_kor(90)
		  		.s_eng(80)
		  		.s_math(70).build());
		
		// 객체를 생성하면서 필드 값을 주입하는 생성자의 기능
		// + 필드이름과 같은 setter() method를 통해서 값을 주입하는 기능
		// 장점을 모아만든 패턴
		// 1. 생성자를 통해 주입할 때 어떤 필드에 값을 주입하는지
		// 		 불명확하여 잘못 주입될 수 있는 단점을 해결
		// 2. 별도로 객체를 생성하여 setter() 통해 필드값을 주입하는
		// 			형태에서 별도로 객체를 만들지 않아도
		// 
		scoreList.add(new ScoreVo.Builder()
				.s_num("003")
				s_kor(100)
				.build());
		
		// 빌드패턴 생성자를 이용한 객체생성 및 list 추가
		scoreList.add(new ScoreVO.Builder().s_num()
		
		
		
	}
	
}
			
