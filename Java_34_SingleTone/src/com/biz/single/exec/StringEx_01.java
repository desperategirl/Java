package com.biz.single.exec;

public class StringEx_01 {
	
	public static void main(String[] args) {
		
		String[] str1 = new String[3];
		String[] str2 = new String[4];
		String[] str3 = new String[5];
		String[] str4 = new String[6];
		String[] str5 = new String[15];
		
		str1[0] = "Republic of Korea";
		str4[0] = "Korea";
		
		str1 = null;
		str2 = null;
		str3 = null; // 대충 지금부터 이 배열들을 안쓸거니까 지우라는 의미
		
		System.out.println(str4[0]);
		
	}
	

}
