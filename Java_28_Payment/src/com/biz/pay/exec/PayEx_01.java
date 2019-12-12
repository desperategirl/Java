package com.biz.pay.exec;

/*
 *  1. main() method에서 
 *  2. 3758750원의 급여를
 *     액면가 5만, 1만, 5천, 1천, 5백, 1백, 50, 10인 화폐로
 *     최소한으로 지급할 수 있도록 매수를 계산하시오.
 */

public class PayEx_01 {
	
	public static void main(String[] args) {
		
	
    int money = 3758750; // 3758750원의 급여
	int cash = 50000; // 급여를 나누는 돈
	int count; // 돈의 매수
	
	/*
	 * 3758750/50000 했을 때 몫이 5만원권의 매수, 나머지가 잔금
	 * 3758750/50000 의 나머지가 다시 1만원권으로 나뉘고, 몫이 1만원권의 매수, 나머지가 잔금
	 */
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/5;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/2;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/5;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/2;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/5;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/2;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/5;
	
	count = money / cash ; 
	System.out.println(cash+"원 권의 매수 : " + count );
	money -= count*cash;
	cash = cash/2;
	
	
	// 총 4번 반복됨
	
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
