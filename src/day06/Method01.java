package day06;

public class Method01 {
	
	//메서드 생성 가능 위치
	/*두 정수를 주면(매개변수) 합을 리턴하는 메서드
	 * 리턴타입: int(합)
	 * 베서드명: sum
	 * 매개변수: int num1, int num2
	 * 
	 */
	public static int sum(int num1, int num2) {
		int sum = num1 +num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		//sum 매서드 호출
		int num1 =3, num2 = 5;
		
		int hap = sum(num1, num2);
		System.out.println(hap);
		
		/*클래스: 객체를 생성하기 위한 설계도
		 * 클래스 구성: 멤버변수, 메서드, 생서자로 구성
		 * Method(메서드): 기능(함수), function 
		 * 메서드 선언 및 구현
		 * 접근제어자 리턴타입 메서드명(메게변수){
		 *  구현;
		 * }
		 * 
		 * 접근제어자: 접근할 수 있는 주체의 제한 범위
		 * 리턴타입: 기능을 실행 후 반환 값(반환할 값의 타입)=>반드시 1개/ 없어도 됨
		 * 메서드명: 소문자로 시작
		 * 메개변수: 파라미터 기능을 하기위해 필요로 하는 값(필요한 만큼)
		 * 			반드시 외부에서 들어와야 하는값
		 * void: 리턴할 값이 없다는걸 의미
		 * 
		 * 메서드는 중복 안됨
		 * 메서드 선언 위치
		 * - 클레스 안, 다른 메서드 밖
		 * - 메서드는 독립적 기능
		 * - 메서드의 선언 순서는 아무 상관 없음
		 * - 메서드는 호출이되어야 실행됨
		 */

	}

}
