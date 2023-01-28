package kr.code6150;

import java.util.Scanner;

public class Continue {
	
	public static void main(String args[]) {
		
		int money = 10000;
		
		Scanner sc = new Scanner(System.in);
		
		for(;money != 0;) {
			System.out.print("사용하실 금액을 입력해 주세요 >>> ");
			int price = sc.nextInt();
			
			if ( price < money ) {
				money -= price;
				System.out.println(money + "원 남았습니다.");
				continue;
			}
			if (price > money ) {
				System.out.println("사용하실 금액이 남은 금액보다 많습니다.");
				continue;
			}
			if (price == money) {
				System.out.println("0원 남으셨습니다. 프로그램을 종료합니다.");
				break;
			}
		}
			
		
	}
	
}
