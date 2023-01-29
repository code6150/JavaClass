package kr.code6150.folder;

import java.util.List;

//T - type
//K - key
//V - value
//E - element

//익명타입(제네릭 기술)
public class A<T> {
	
	/*
	 * 접근제어자
	 * private
	 * public
	 * protected
	 * (default)
	 */
	
	protected T data;
	
	//받는 데이터 타입에따라 유동적으로 변환됨
	public A(T data) {
		this.data = data;
	}
	
	public void printdata() {
		System.out.println(data);
	}
	
	int[] arr = new int[10];
	// ArrayList, LinkedList
	
}
