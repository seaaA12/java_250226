package day03;

public class For02 {

	public static void main(String[] args) {
		/*for 예제
		 * 1부터 10까지 출력
		 * for(1초기화; 25조건식; 47증강식){
		 * 36실행문
		 * }
		 * 조건식은 참이여야 실행(true가 될 수 있게 설정)
		 * 초기화 한 ㅂ변수가 조건식을 만족하면 실행-> 증감식(증가, 감소)
		 * 증가한 변수가 다시 조건식을 비교 -> 만족하면 실행 -> 증감식
		 * 증가한 변수를 다시 조건식 비교-> 불만족하면 -> 종료
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		//1부터 10까지 짝수만 출력
		for(int i=1; i<=10; i++) {
			if(i % 2 ==0) {
				System.out.println(i);
			}			
		}
		
		System.out.println("------------------");
		//1부터 10까지으 합계 출력
		int sum=0;		
		for(int i=1; i<=10; i++ ) {
			sum = sum + i;
			System.out.println(sum);
		}
		
		System.out.println("------------------");
		//1~10까지 짝수, 홀수의 합계
		int sum1 = 0;
//		int sum2 = 0;
		sum = 0; //이미 선언된 변수를 다시 활용하려면 다시 초기값 지정 후 사용
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum1 = sum1 + i;
			}else {
				sum = sum + i;
//				sum2 = sum2 + i;
			}
		}
		System.out.println("짝수 합 : " +sum1); 
//		System.out.println("홀수 합 : " +sum2);
		System.out.println("홀수 합 : " +sum);
		
	}

}
