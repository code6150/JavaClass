package kr.code6150;

public class qksqhrans {

	public static void main(String args[]) {
		
		//for �� - �ݺ��ϴ� Ƚ���� �߿��� ��쿡 ���.
		//for(�����;���Ǻ�;������) �ڵ�;
		//����� - ������ ���� ( for���� ����� ��, �Բ� �Ҹ���) *�ݵ�� �ʱ�ȭ�� �� ������ ����ؾ���.
		
		//for(int n = 0;n<5;n++) {
		//	System.out.println("hello");
		//}
		
		//while �� - Ư�� ������ �߿��� ��쿡 ���.
		//while(���Ǻ�) �ڵ�;
		// ���Ǻ� - ���� (or ���� ��) [true/false]
		
		//int i = 1;
		//while(true) {
		//	System.out.println("1");
		//	i++;
		//
		
		//do-while��
		//do ���� �ڵ带 ������ 1ȸ ������, while���� ���ǽ��� �Ǻ�
		//int n = 0;
		//while(n < 10) {
		//	System.out.print(n);
		//	n++;
		//}
		
		//do {
		//	System.out.println(n);
		//	n++;
		//}while(n<10);
		
		// break : �ݺ����� �ٷ� Ż��
		// continue : �ݺ����� ���Ǻη� �̵�
		// label - �̸� �ۼ�( �̸�: )
		
		first:for(int i =0; i < 10; i++) {
			
			if(i%2!=0)break first;
			
			System.out.println(i);
			
		}
		
	}
	
}
