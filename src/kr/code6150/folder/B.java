package kr.code6150.folder;

// extends - Ŭ���� <-> Ŭ���� ���� ���
//		   - �������̽� <-> �������̽� ���� ���

//B�� A�� ������ �����ؾ߸���.
public class B<T> extends A{

	// ����� ���� Ŭ������ �ڵ����� super() �� ȣ��
	//public B() {
	//	super;
	//}
	
	//this -> �ڱ� �ڽ��� �����ϴ� ����
	//super -> �θ� ��ü�� �����ϴ� ����
	public B(T data) {
		super(data);
	}
	
	//�������̵�
	//������̼�(@annotation)
	@Override
	public void printdata() {
		//�ڵ�� ������� ���� ����
		System.out.println("B:" + data);
	}
	
	
}
