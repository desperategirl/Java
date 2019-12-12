package com.biz.pay.exec;

import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {
	
	public static void main(String[] args) {
		
		int a = 54654654; 
		
		PaperMakeServiceV1 pms = new PaperMakeServiceV1();
		pms.make(a);
	}

}
