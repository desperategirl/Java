package com.biz.list.exec;

import java.util.List;

import com.biz.list.service.ListMakeServiceV1;
import com.biz.list.service.ListRecServiceV1;

public class ListEx_01 {

	public static void main(String[] args) {
	    
		ListMakeServiceV1 lm = new ListMakeServiceV1();
		ListRecServiceV1 lr = new ListRecServiceV1();
		
		lm.makeStrList();
		List<String> strList = lm.getStrList();
		
		lr.setStrList(strList);
		lr.viewList(); // lr한테 viewList()를 실행시킴
		// ListMake에서 strList로 보내고 strList에서 ListRec에서 리스트를 보이기
		
		

	}

}
