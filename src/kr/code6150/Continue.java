package kr.code6150;

import java.util.Scanner;

public class Continue {
	
	public static void main(String args[]) {
		
		int money = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		for(;money != 0;) {
			System.out.print("����Ͻ� �ݾ��� �Է��� �ּ��� >>> ");
			int price = sc.nextInt();
			
			if ( price < money ) {
				money -= price;
				System.out.println(money + "�� ���ҽ��ϴ�.");
				continue;
			}
			if (price > money ) {
				System.out.println("����Ͻ� �ݾ��� ���� �ݾ׺��� �����ϴ�.");
				continue;
			}
			if (price == money) {
				System.out.println("0�� �����̽��ϴ�. ���α׷��� �����մϴ�.");
				break;
			}
		}
			
		
	}
	
}
