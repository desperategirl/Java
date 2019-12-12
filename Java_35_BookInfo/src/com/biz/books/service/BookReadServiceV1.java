package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * 도서정보.txt 파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method를 작성
 */
public class BookReadServiceV1 {

	private List<BookVO> bookList ;
	
	public List<BookVO> getBookList() {
		return bookList;
	}
	
	public BookReadServiceV1() {
		bookList = new ArrayList<BookVO>();
	}
	
	public void readBookInfo(String bookFile) throws IOException{
		
	
		
	
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		int lineNum = 0;
		
		while(true) {
			
			System.out.println(++lineNum);
			
			reader = buffer.readLine();
			if (reader == null) break;
			
			String[] booksList;
			booksList = reader.split(":");
		    String strNum = booksList[0];
		    
		    /*
		    * ISBN : b_isbn String
		    * 도서명 : b_title String
		    * 저자 : b_writer String
		    * 출판사 : b_comp String
		    * 역자 : b_trance String
		    * 가격 : b_price Int
		    * 페이지수 : b_page Int
		    * 발행일 : b_date String
		    */
		    
		    BookVO bookVO = new BookVO();
		    bookVO.setB_isbn(booksList[0]);
		    bookVO.setB_comp(booksList[1]);
		    bookVO.setB_title(booksList[2]);
		    bookVO.setB_writer(booksList[3]);
		    bookVO.setB_trance(booksList[4]);
		    bookVO.setB_date(booksList[5]);
		    bookVO.setB_page(Integer.valueOf(booksList[6]));
		    bookVO.setB_price(Integer.valueOf(booksList[7].trim()));
		    bookList.add(bookVO);
		    
			
		}
		
		buffer.close();
		fileReader.close();
		
		
	}
	
}
