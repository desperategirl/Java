package com.biz.pay.service;

/*
 * 1. make() method를 정의하고
 * 2. 매개변수로 pay(급여)를 전달받고
 * 3. 화폐매수를 계산하여 console에 보이시오.
 */

public class PaperMakeServiceV1 {
	
	public void make(int money) {
		
		
			int cash = 50000; // 급여를 나누는 돈
			int count; // 돈의 매수
			
		
		while(true) {
			count = money / cash ; 
			System.out.println(cash+"원 권의 매수 : " + count );
			money -= count*cash;
			cash = cash/5;
			
			count = money / cash ; 
			System.out.println(cash+"원 권의 매수 : " + count );
			money -= count*cash;
			cash = cash/2;
			
			if( money == 0) break;
		   }
		
	}
	

}
