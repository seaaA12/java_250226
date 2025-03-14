package day02;

public class For01 {

	public static void main(String[] args) {
		/*반목문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * - for, while 문은 동작방식이 같음
		 * => 조건에 따라 조건이 맞지 않으면 한번도 실행되지 않을 수 있음
		 * 
		 * do~while 문 : 조건에 맞지 않앋 무조건 1번은 실행함
		 * 
		 * for(1초기화; 2 5 8조건식; 4 7 증감식){
		 *  3 6 실행문;
		 *  }
		 * 초기화 : 실행문을 반복하기 위한 변수를 초기화 - 생략가능
		 * 조건식 ㅣ 반복을 결정하는 기능(true -> 반복) - 생략가능
		 * 증감식 : 조건식에서 사용할 변수를 증가 / ㅇ감소시켜 반복횟수를 조절 - 생략가능
		 */

		for(int i=1; i<=10; i++) {
			System.out.print(i);
			System.out.println(": hello");
		}
		
		System.out.println("---------------");
		//1~10에서 짝수값만 출력
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) {
				System.out.println(i);			
			}
		}
		
		System.out.println("---------------");		
		for(int i=2; i<=10; i+=2) {
				System.out.println(i);			
		}
		
		System.out.println("---------------");	
		int even = 0;
/*		for(int i=1; i<=5; i++) {
			even = even +2;
			System.out.println(even);
		}
*/		
		a: for(int i=1; ; i++) {
			even = even +2;
			System.out.println(even);
			if(even == 10) {
				break a;
			}
		}
		
/*		
		System.out.println("---------------");
		//10~1출력
		for(int ii=10; ii>=1; ii--) {
			System.out.println(ii);
		}
		
		System.out.println("---------------");
		for(int i=1; i<=10; i++) {
			System.out.println(11-i);
		}
*/		
		System.out.println("---------------");
		//1~10까지의 랜덤수 5개 출력
		for(int i=1; i<=5; i++) {
			System.out.println((int)(Math.random()*10)+1); 
		}
		
		System.out.println("---------------");
		//1~10까지의 합계출력
		int sum= 0;
		for(int i=1; i<=10; i++) {
			sum = i +sum;
			System.out.println(sum);
		}
		
	}
	
}
