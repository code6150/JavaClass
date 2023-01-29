package kr.code6150;

public class Student {

	//�ɹ� ���� - private�� �����϶�. 
	private String name;
	private int age;
	private String phone;
	
	// ������ (constructor)
	// - heap �� ��ü�� �����Ҷ� �ڵ����� ȣ�� �� ( new ~~() )
	
	//default constructor (�⺻ ������) ����
	// - �ٸ� �����ڰ� ���� ���, ������
	// - public Ŭ���� �̸�() {}
	
	// �Ű�����, �������� - �Լ��� �����ڰ� ȣ��Ǿ��� �� �Ҵ�, �Լ��� �����ڰ� ������ ����
	
	//����, �Ű� ���� -> �켱������ ���� ����.
	
	//�����ε�
	//���������� ��ü�̸�(�Ű�����) {�ڵ�;}
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	public Student(String name, int age, String phone) {
		this(name,age);
		this.phone = phone;
	}
	
	// getter, setter 
	// getter - ���������� fieldType getfiledName() { return field; }
	// setter - ���������� void setFieldName(fieldType variable) {set code;}
	// �Լ� �̸� - �ҹ��ڷ� ����, �̾����� ���ڵ��� ù ���� �빮��
	
	//�Լ�
	//���� -> �Լ��� ȣ���� ��ġ�� ������ ��
	//	 -> ������ ������ ���� �Լ��� ����
	//   -> �ݵ�� ������ ���� �ؾ��Ѵ�.
	//���������� ����Ÿ�� �̸�(�Ű�����) {
	// �ڵ�;
	//}
	
	
	public int getAge(int az) {
		if(name.equals("ȫ�浿"))
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
			return "�� �� ����";
		return phone;
	}
 	
	//����������
	// - public		:��ü����
	// - private	:���ΰ���
	// - protected	:��Ӱ���
	// - (default)	:��Ű�� ����
	
}
