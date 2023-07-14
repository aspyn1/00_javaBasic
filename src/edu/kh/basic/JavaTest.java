package edu.kh.basic;

// 한줄주석 : 컴파일러가 해석하지 않는 부분, 주로 코드 설명 작성
/* 
 * 
 * 
 * 범위주석
 */

// 컴파일러(compiler) : 코드를 2진수(0,1)로 변환하는 번역기

// java 코드 실행 순서 :
// 코드 작성 > ctrl+F11 > 실행 > 컴파일러가 2진수로 변역(FVM이 실행)

public class JavaTest {
	// class : 자바 코드가 작성되는 영역
	
	public static void main(String[] args) {
		// main method(메인 메서드) : 자바 애플리케이션(프로그램)을 실행하기 위해서 반드시 필요한 메서드
		
		// ctrl+alt+방향키 : 작성한 방향으로 해당 줄 복사
		System.out.println("*****");
		System.out.println("Hello, world!");
		System.out.println("맛점?");
		System.out.println("14:14");
		System.out.println("*****");
		
		// 숫자 연산
		System.out.println("1+2"); // 1+2
		System.out.println(1 + 2); // 3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		System.out.println("--------");
		System.out.println(50-23);
		System.out.println(12*21);
		System.out.println(12/4);
		System.out.println("--------");
		
		// ""(문자열) + 숫자 함께 작성 
		
		System.out.println("14 * 19 = " + 266); // 14 * 19 =266 -> 이어쓰기
		System.out.println("14 * 19 = " + 14 * 19 ); // 14 * 19 =266 -> 이어쓰기
		System.out.println("90+70+65 = " + 90 + 70 + 65); // -> 이어쓰기
		System.out.println("90+70+65 = " + (90 + 70 + 65)); // -> 괄호 덧셈 연산
		
		// + 기호의 역할
		// -> 숫자+숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or 
		//    문자열 + 문자열 --> 이어쓰기

		// 자바는 사칙연산의 우선순위를 그대로 따른다!
		// -> 우선 계산을 원하면 () 괄호 사용
		
	}

}
