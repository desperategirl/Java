package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * 1. List<PaperVO> paperList를 선언
 * 2. make() method를 정의하고
 * 3. 매개변수로 pay(급여)를 전달받고
 * 4. 화폐매수를 계산하여 "50000", 37 형식으로 paperVO를 만들고
 * 5. paperList에 추가하시오
 *
 * 6. Test를 위해서 PayEx_03을 만들고 main() method에서 테스트를 수행하시오   
 */

public class PaperMakeServiceV2 {

	List<PaperVO> paperList = new ArrayList<PaperVO>();

	public void make(int money) {

		int cash = 50000; // 급여를 나누는 돈
		int count; // 돈의 매수

		while (true) {

			count = money / cash;
			// System.out.println(cash+"원 권의 매수 : " + count );
			money -= count * cash;
			PaperVO pvo = new PaperVO();
			pvo.setCount(count);
			pvo.setPaper(cash + "");

			paperList.add(pvo);

			cash = cash / 5;
			/*
			
			*/

			count = money / cash;
			// System.out.println(cash+"원 권의 매수 : " + count );
			money -= count * cash;
			pvo = new PaperVO();
			pvo.setCount(count);
			pvo.setPaper(cash + "");

			paperList.add(pvo);

			cash = cash / 2;

			if (money == 0)
				break;

		}
		
		
		for (PaperVO pv : paperList)
			System.out.println(pv);
	}

}
