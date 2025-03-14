package day01;

public class Helloworld {

	public static void main(String[] args) {
//		 주석: 프로그램이 읽지 않는 라인 ctrl + / -> 한줄 주석
		/* 여러줄 주석
		 * console: 출력
		 * println(): 줄바꿈을 포함하는 출력
		 * print(): 줄바꿈이 없는 출력
		 * printf(): 형식을 가지는 출력(c언어에서 주로 사용)
		 * 
		 * 문자열은: "", 한글자: '', 숫자는 안씀
		 * */
		
		System.out.println("Hello World"); // 기본 출력 구문
		System.out.println(123);
		System.out.println('a'); // 아스키 코드 97 a
		System.out.println("a"); // 문자 a
		
		char ch = 'a';
		System.out.println(ch);
		
		String s ="Hi";
		System.out.println(s);
		
		int a = 1;
		a = a + 1;
		System.out.println(a);
		a += 1;
		System.out.println(a);
		
//		-----------------------------------------------------
		
		// 변수
		int num = 100;
//		int num = 200; 중복 선언 불가능
		num = 200; // 기존변수 값은 덮어쓰기 된다
		
		int num1, num2, num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		System.out.println(num1 + num2 + num3);
		
		num1 ++; // num1 = num1 + 1
		
		int num4; //선언만
		//기본자료형 초기 값을 가지지 않으면 오류가 난다


	}

}
