package kr.code6150;

import java.util.Scanner;

public class aaaaaa {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in); // instance
		System.out.print(sc.next());
		
		System.gc(); //garbage collecter ȣ��
		
		System.out.print(sc.next()); //sc�� ���� �Ǿ��� ������ ������� ����
		
		//True(x) / true(o)
		//Null(x) / null(o)
		//(Ŭ����)�����̸��� ���ڷ�  ���۵� �� ����.
		//Ư�� ���ڴ� _,$ �ΰ����� ���
		int n10;
		
		//����
		//Ŭ������ �̸��� �׻� �빮�ڷ� �����϶�.
		//���� �ܾ �̾����� ���, �̾����� �ܾ��� ù ���ڴ� �빮�ڷ� ����.
		//���� -> int a = 10; a = 20;
		//��� -> int n = 10; n = 20; <<--�� ���� �����ϰ� ������ ���.
		//��δ� �빮�ڷ� �ۼ� �̾����� �ܾ_ ����. STUDENT_NUMBER
		//final int STUDENT_NUMBER <<-- �� ���� ����
		
		//���ͷ�(literal) -> ��
		//10, 200, 55,2,'a',"aaa"
		//���� -> default (int)
		//		10L (long)
		
		//�Ǽ�-> default - double
		//		5.5F (float)
	}
	
}
