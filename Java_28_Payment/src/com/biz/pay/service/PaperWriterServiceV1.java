package com.biz.pay.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {

	List<PaperVO>paperList ;
	public void setPaperList(List<PaperVO> paperList) {
		
	}
	
	// setter를 통해서 paperList를 주입받고
	// 파일이름만 매개변수로 받아서 파일 저장을 수행
	public void print(String payFile) throws FileNotFoundException {
		
		PrintWriter fileOut = new PrintWriter(payFile);
		
		for(PaperVO vo : this.paperList ) {
			//출력
			fileOut.print("");
		}
		fileOut.close();
	}
	
	// 매개변수로 paperList 와 파일이름을 전달받아서
	// 파일저장을 수행
	public void print(List<PaperVO> paperList, String payFile) throws FileNotFoundException {
		
		PrintWriter fileOut = new PrintWriter(payFile);
		
		for(PaperVO vo : paperList) {
			
			fileOut.print("");
			
		}
		fileOut.close();
	
		
	}
	
}
