package day02;

public class If01 {

	public static void main(String[] args) {
		//조건문은 : if문 =, switch문
		//if문: 조건식을 주고, 조건식이 참이면/ 거짓이면 값을 주는 구조
		//if(조건식){실행문; }
		//if 실행문이 한즐이면 중괄호 생략가능
		//실행문이 2줄 이상이면 반드시 {}
		
		int num = 5;
		
		//num가 0보다 크면 양수 / 0보다 작으면 음수 / 0이면 0 출력
		if(num >0) {
			System.out.println("양수");
		}else if(num < 0) {
			System.out.println("음수");
		}else {
			System.out.println(0);
		}
		
		//num가 짝수인지 홀수인지 출력
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		

		
		
	}

}
