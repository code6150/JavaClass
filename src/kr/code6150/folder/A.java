package kr.code6150.folder;

import java.util.List;

//T - type
//K - key
//V - value
//E - element

//�͸�Ÿ��(���׸� ���)
public class A<T> {
	
	/*
	 * ����������
	 * private
	 * public
	 * protected
	 * (default)
	 */
	
	protected T data;
	
	//�޴� ������ Ÿ�Կ����� ���������� ��ȯ��
	public A(T data) {
		this.data = data;
	}
	
	public void printdata() {
		System.out.println(data);
	}
	
	int[] arr = new int[10];
	// ArrayList, LinkedList
	
}
