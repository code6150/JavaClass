package kr.code6150;

import kr.code6150.folder.A;
import kr.code6150.folder.B;

public class Practice {
	
	// void - ���� �� ���� �������� �ʴ� ���
	public static void main(String args[]) {
		
		//���׸� (Ŭ������ �� �� �ִ�.)
		// int, double, float, ... �⺻�� Ÿ���� ���� �� �� ����.
		
		/*
		 * int[] i = {0,10,20,30,40};
		 * 
		 * for (int a = 0;a<5;a++) { System.out.println(i[a]); }
		 * 
		 * for(int e : i) {
		 * 
		 * }
		 */
		
		//��ü ����(java, python, go ,kotlin,...)  / ���� ����(c)
		// - ������ ���� ��� ��Ģ�� �߰��� �� ��.
		// - �ڵ��� ���뼺�� ����.
		
		//�̸�, ����, ��ȭ��ȣ... �� ����
		
		/*
		 * Student s1 = new Student("ȫ�浿", 15); Student s2 = new Student("�ƹ���", 17);
		 * 
		 * s1.name = "";
		 */
	
		
		Student s1 = new Student("ȫ�浿", 15);
		Student s2 = new Student("ȫ�浿", 15, "01012345678");
		
		System.out.print(s2.getPhone());
		
		A<Integer> a = new A<Integer>(22);
		
		a.printdata();
		
		A b= new B(15);
		
		b.printdata();
		
		/*
		 * //����ȯ ((B)b).printdata();
		 * 
		 * double d = 1.5; int data = (int) d;
		 */
		
	}
	
}
