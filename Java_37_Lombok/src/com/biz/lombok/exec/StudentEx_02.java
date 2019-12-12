package com.biz.lombok.exec;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentReadServiceV1;
import com.biz.lombok.service.StudentViewServiceV1;
/*
 * 학생정보.txt파일을 읽어서
 * 1. 모든 학생의 리스트를 콘솔에 보이기
 * 2. 이름을 입력받아 해당하는 학생 리스트를 콘솔에 보이기
 * 3. 학년을 입력받아 해당하는 학년의 학생들만 콘솔에 보이기
 * 4. 두 개의 정수를 입력받아 해당 범위의 학년에 해당하는 학생들만 콘솔에 보이기
 */
public class StudentEx_02 {

	public static void main(String[] args) {

		StudentReadServiceV1 sRead = new StudentReadServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV1();
		
		String fileName = "src/com/biz/lombok/학생정보.txt";
		try {
			sRead.readStudent(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<StudentVO> stdList;
		stdList = sRead.getStdList();
		sView.setStdList(stdList);
		sView.view();
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scanner.nextLine();
		sView.view(name);
		
		System.out.println("학년을 입력하세요");
		int grade = Integer.valueOf(scanner.nextLine());
		sView.view(grade);
	
		
		System.out.println("학년 2개를 입력하세요");
		int grade1 = Integer.valueOf(scanner.nextLine());
		int grade2 = Integer.valueOf(scanner.nextLine());
		sView.view(grade1, grade2);
		
		
		
		
		
		
	}

}
