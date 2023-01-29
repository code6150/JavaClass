package kr.code6150;

public class Student {

	//맴버 변수 - private로 선언하라. 
	private String name;
	private int age;
	private String phone;
	
	// 생성자 (constructor)
	// - heap 에 객체를 생성할때 자동으로 호출 됨 ( new ~~() )
	
	//default constructor (기본 생산자) 존재
	// - 다른 생성자가 생길 경우, 삭제됨
	// - public 클래스 이름() {}
	
	// 매개변수, 지역변서 - 함수나 생성자가 호출되었을 때 할당, 함수나 생성자가 끝나면 해제
	
	//지역, 매개 변수 -> 우선순위가 가장 높다.
	
	//오버로딩
	//접근제어자 객체이름(매개변서) {코드;}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	public Student(String name, int age, String phone) {
		this(name,age);
		this.phone = phone;
	}
	
	// getter, setter 
	// getter - 접근제어자 fieldType getfiledName() { return field; }
	// setter - 접근제어자 void setFieldName(fieldType variable) {set code;}
	// 함수 이름 - 소문자로 시작, 이어지는 문자들은 첫 글자 대문자
	
	//함수
	//리턴 -> 함수를 호출한 위치에 돌려줄 값
	//	 -> 리턴을 만나는 순간 함수는 종료
	//   -> 반드시 리턴이 존재 해야한다.
	//접근제어자 리턴타입 이름(매개변수) {
	// 코드;
	//}
	
	
	public int getAge(int az) {
		if(name.equals("홍길동"))
			return age;
		return 0;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name == null) return;
		this.name = name;
	}
	
	public String getPhone() {
		if(phone == null)
			return "알 수 없음";
		return phone;
	}
 	
	//접근제어자
	// - public		:전체공개
	// - private	:내부공개
	// - protected	:상속공개
	// - (default)	:패키지 공개
	
}
