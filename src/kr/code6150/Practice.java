package kr.code6150;

import kr.code6150.folder.A;
import kr.code6150.folder.B;

public class Practice {
	
	// void - 리턴 할 값이 존재하지 않는 경우
	public static void main(String args[]) {
		
		//제네릭 (클래스만 올 수 있다.)
		// int, double, float, ... 기본형 타입은 절대 올 수 없다.
		
		/*
		 * int[] i = {0,10,20,30,40};
		 * 
		 * for (int a = 0;a<5;a++) { System.out.println(i[a]); }
		 * 
		 * for(int e : i) {
		 * 
		 * }
		 */
		
		//객체 지향(java, python, go ,kotlin,...)  / 절차 지향(c)
		// - 기존의 언어에서 몇가지 규칙을 추가한 것 뿐.
		// - 코드의 재사용성이 높음.
		
		//이름, 나이, 전화번호... 을 저장
		
		/*
		 * Student s1 = new Student("홍길동", 15); Student s2 = new Student("아무개", 17);
		 * 
		 * s1.name = "";
		 */
	
		
		Student s1 = new Student("홍길동", 15);
		Student s2 = new Student("홍길동", 15, "01012345678");
		
		System.out.print(s2.getPhone());
		
		A<Integer> a = new A<Integer>(22);
		
		a.printdata();
		
		A b= new B(15);
		
		b.printdata();
		
		/*
		 * //형변환 ((B)b).printdata();
		 * 
		 * double d = 1.5; int data = (int) d;
		 */
		
	}
	
}
