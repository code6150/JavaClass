package kr.code6150.folder;

// extends - 클래스 <-> 클래스 간의 상속
//		   - 인터페이스 <-> 인터페이스 간의 상속

//B는 A를 무조건 생성해야만함.
public class B<T> extends A{

	// 상속을 받은 클래스는 자동으로 super() 를 호출
	//public B() {
	//	super;
	//}
	
	//this -> 자기 자신을 참조하는 변수
	//super -> 부모 객체를 참조하는 변수
	public B(T data) {
		super(data);
	}
	
	//오버라이딩
	//어노테이션(@annotation)
	@Override
	public void printdata() {
		//코드는 마음대로 수정 가능
		System.out.println("B:" + data);
	}
	
	
}
