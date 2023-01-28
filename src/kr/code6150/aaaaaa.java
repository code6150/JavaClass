package kr.code6150;

import java.util.Scanner;

public class aaaaaa {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); // instance
		System.out.print(sc.next());
		
		System.gc(); //garbage collecter 호출
		
		System.out.print(sc.next()); //sc가 삭제 되었기 때문에 실행되지 않음
		
		//True(x) / true(o)
		//Null(x) / null(o)
		//(클래스)변수이름은 숫자로  시작될 수 없다.
		//특수 문자는 _,$ 두가지만 허용
		int n10;
		
		//권장
		//클래스의 이름은 항상 대문자로 시작하라.
		//여러 단어가 이어지는 경우, 이어지는 단어의 첫 글자는 대문자로 시작.
		//변수 -> int a = 10; a = 20;
		//상수 -> int n = 10; n = 20; <<--값 변경 금지하고 싶을때 사용.
		//모두다 대문자로 작성 이어지는 단어를_ 구분. STUDENT_NUMBER
		//final int STUDENT_NUMBER <<-- 값 변경 금지
		
		//리터럴(literal) -> 값
		//10, 200, 55,2,'a',"aaa"
		//정수 -> default (int)
		//		10L (long)
		
		//실수-> default - double
		//		5.5F (float)
	}
	
}
