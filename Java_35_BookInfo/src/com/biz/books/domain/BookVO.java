package com.biz.books.domain;
/*
 * 도서정보를 관리하기 위한
 * 도서정보를 저장, 연산하기 위한 domain class 선언
 * 
 * ISBN : b_isbn String
 * 도서명 : b_title String
 * 저자 : b_writer String
 * 출판사 : b_comp String
 * 역자 : b_trance String
 * 가격 : b_price Int
 * 페이지수 : b_page Int
 * 발행일 : b_date String
 */
public class BookVO {
	
	String b_isbn;
	String b_title;
	String b_writer;
	String b_comp;
	String b_trance;
	int b_price;
	int b_page;
	String b_date;
	
	
	
	
	public BookVO(String b_isbn, String b_title, String b_writer, String b_comp, String b_trance, int b_price,
			int b_page, String b_date) {
		super();
		this.b_isbn = b_isbn;
		this.b_title = b_title;
		this.b_writer = b_writer;
		this.b_comp = b_comp;
		this.b_trance = b_trance;
		this.b_price = b_price;
		this.b_page = b_page;
		this.b_date = b_date;
	}
	@Override
	public String toString() {
		return "BookVO [b_isbn=" + b_isbn + ", b_title=" + b_title + ", b_writer=" + b_writer + ", b_comp=" + b_comp
				+ ", b_trance=" + b_trance + ", b_price=" + b_price + ", b_page=" + b_page + ", b_date=" + b_date + "]";
	}
	public String getB_isbn() {
		return b_isbn;
	}
	public void setB_isbn(String b_isbn) {
		this.b_isbn = b_isbn;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	public String getB_comp() {
		return b_comp;
	}
	public void setB_comp(String b_comp) {
		this.b_comp = b_comp;
	}
	public String getB_trance() {
		return b_trance;
	}
	public void setB_trance(String b_trance) {
		this.b_trance = b_trance;
	}
	public int getB_price() {
		return b_price;
	}
	public void setB_price(int b_price) {
		this.b_price = b_price;
	}
	public int getB_page() {
		return b_page;
	}
	public void setB_page(int b_page) {
		this.b_page = b_page;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public BookVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
