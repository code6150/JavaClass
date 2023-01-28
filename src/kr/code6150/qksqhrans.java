package kr.code6150;

public class qksqhrans {

	public static void main(String args[]) {
		
		//for 문 - 반복하는 횟수가 중요한 경우에 사용.
		//for(선언부;조건부;증감식) 코드;
		//선언부 - 변수의 선언 ( for문이 종료될 시, 함께 소멸함) *반드시 초기화가 된 변수를 사용해야함.
		
		//for(int n = 0;n<5;n++) {
		//	System.out.println("hello");
		//}
		
		//while 문 - 특정 조건이 중요한 경우에 사용.
		//while(조건부) 코드;
		// 조건부 - 논리값 (or 조건 식) [true/false]
		
		//int i = 1;
		//while(true) {
		//	System.out.println("1");
		//	i++;
		//
		
		//do-while문
		//do 안의 코드를 무조건 1회 실행후, while문의 조건식을 판별
		//int n = 0;
		//while(n < 10) {
		//	System.out.print(n);
		//	n++;
		//}
		
		//do {
		//	System.out.println(n);
		//	n++;
		//}while(n<10);
		
		// break : 반복문을 바로 탈출
		// continue : 반복문의 조건부로 이동
		// label - 이름 작성( 이름: )
		
		first:for(int i =0; i < 10; i++) {
			
			if(i%2!=0)break first;
			
			System.out.println(i);
			
		}
		
	}
	
}
