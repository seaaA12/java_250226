package day03;

public class While01 {

	public static void main(String[] args) {
		/*while문
		 * while문은 for문과 순서가 동일한 구문
		 * for: 실행 횟수가 정해져있는 경우 많이 사용
		 * while: 실행 횟수가 일정치 안은 경우 많이 사용
		 * 
		 * while(조건식){ // 조건식이 true 일때 반벅
		 *  실행문;
		 *  }
		 *  실행문안에 조건식이 바뀔 수 있는 증감, 변화가 있엉 함
		 */

		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("--------------");
		
		//whil에서 1~10까지 출력
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("--------------");
		//1~10까지 중 짝수만 출력
		i=1;
		while(i<=10) {
			if(i % 2 == 0 ) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
