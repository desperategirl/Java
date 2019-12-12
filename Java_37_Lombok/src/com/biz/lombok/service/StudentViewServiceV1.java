package com.biz.lombok.service;


import com.biz.lombok.domain.StudentVO;

public class StudentViewServiceV1 extends StudentViewServiceABS {

	

	
	@Override
	public void view() {
	
	
		
		for(StudentVO studentVO : stdList) {
			System.out.print(studentVO.getS_num()+ "\t");
			System.out.print(studentVO.getS_name() + "\t");
			System.out.print(studentVO.getS_tel()+ "\t");
			System.out.print(studentVO.getS_grade() + "\t");
			System.out.print(studentVO.getS_addr() + "\n");
		}
		System.out.println("=====================================");

	}

	@Override
	public void view(String stdName) {
		
	for(StudentVO studentVO : stdList) {
			
			// 문자열이 포함되어 있냐
			if(studentVO.getS_name().equals(stdName)) {
				System.out.print(studentVO.getS_num()+ "\t");
				System.out.print(studentVO.getS_name() + "\t");
				System.out.print(studentVO.getS_tel()+ "\t");
				System.out.print(studentVO.getS_grade() + "\t");
				System.out.print(studentVO.getS_addr() + "\n");
			}
		}
	
		

	}

	@Override
	public void view(int intGrade) {
		// TODO Auto-generated method stub
     for(StudentVO studentVO : stdList) {
			
			// 문자열이 포함되어 있냐
			if(studentVO.getS_grade() == (intGrade)) {
				System.out.print(studentVO.getS_num()+ "\t");
				System.out.print(studentVO.getS_name() + "\t");
				System.out.print(studentVO.getS_tel()+ "\t");
				System.out.print(studentVO.getS_grade() + "\t");
				System.out.print(studentVO.getS_addr() + "\n");
			}
		}
	}

	@Override
	public void view(int grGrade, int lessGrade) {
		// TODO Auto-generated method stub
		
		 for(StudentVO studentVO : stdList) {
				
				// 문자열이 포함되어 있냐
				if(studentVO.getS_grade() >= grGrade && studentVO.getS_grade() <= lessGrade ) {
					System.out.print(studentVO.getS_num()+ "\t");
					System.out.print(studentVO.getS_name() + "\t");
					System.out.print(studentVO.getS_tel()+ "\t");
					System.out.print(studentVO.getS_grade() + "\t");
					System.out.print(studentVO.getS_addr() + "\n");
				}
			}
		
		
	}

}
