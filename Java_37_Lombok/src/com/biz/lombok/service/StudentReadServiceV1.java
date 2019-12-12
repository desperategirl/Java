package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

import lombok.Getter;

@Getter
public class StudentReadServiceV1 {

	private List<StudentVO> stdList = new ArrayList<StudentVO>();

	/*
	 * public List<StudentVO> getStdList() { return this.stdList; }
	 */

	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	public void readStudent(String fileName) throws IOException {  

		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			String[] studentList;
			studentList = reader.split(":");
			// String strNum = studentList[0];

			StudentVO studentVO = new StudentVO();
			studentVO.setS_num(studentList[0]);
			studentVO.setS_name(studentList[1]);
			studentVO.setS_tel(studentList[2]);
			studentVO.setS_grade(Integer.valueOf(studentList[3]));
			studentVO.setS_addr(studentList[4]);
			stdList.add(studentVO);

		}
		buffer.close();
		fileReader.close();

	}

	public List<StudentVO> getStudentList() {
		return stdList;
	}
	
	
}
