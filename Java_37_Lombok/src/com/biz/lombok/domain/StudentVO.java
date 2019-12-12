package com.biz.lombok.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
/*
 * lombok.jar (롬복프로젝트)
 * domain, model 클래스에서
 * getter(), setter(), toString()
 * 생성자 등의 코드를 번거롭게 작성할 필요 없이
 * 자동으로 생성해주는 3rd party library이다.
 * 
 * 이클립스와 같은 IDE에서는 일단 agent(plug in)을 설치해주고
 * 프로젝트에서는 build path에서 lombok.jar 파일을 add해서
 * 사용할 수 있다
 */
/*
 * Annotation
 * Java 확장 키워드
 * @keyword라고 작성하면
 * Java 컴파일러는 해당 키워드로 작성된
 * 클래스를 가져다가 코드를 완성해서 컴파일을 시켜준다.
 * 
 */
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Data는 아래 설정한 모든 @~~ 들을 포함한다.
// @Data는 lombok에서 사용할 수 있는 모든 것을 enable하는 keyword이다.
// 실제 사용하지 않는 method들을 생성하여 컴파일 된 코드를 낭비하기도 한다
// 그래서 개발자가 @Data 보다는 필요한 항목들만 설정해서 사용하라고 권장한다.

@Getter
@Setter
@ToString
@AllArgsConstructor // field 생성자
@NoArgsConstructor // 기본생성자
@Builder // 빌더패턴



public class StudentVO {
	
	
	private String s_num;
	private String s_name;
	private String s_tel;
	private String s_addr;
	private int s_grade;
	private String s_dept;

}