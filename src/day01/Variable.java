package day01;

public class Variable {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형 변수형
		 * 
		 * 변수 선언 + 초기화
		 * 자료형 변수형 = 값
		 * 기존 데이터타입은 초기화 해야 사용가능
		 */

		int num = 1; // 선언 +  초기화
//		int num = 2; 중복선언 불가능
		System.out.println(num);
		
		int num1 = 3, num2 = 5, num3 = 10;
		System.out.println(num1);
		
		num2 = 10; // =(대입연사자) 오른쪽 값을 왼쪽 변수에 저장(덮어쓰기)
		System.out.println(num2);
		
		//char : 아스키코드(유니코드) 표의 한글자만 가능
		// "문자열", '한글자'
		
		char ch = 'a';
		System.out.println(ch);
		System.out.println((int)ch); // char-> int로 형변환
		
		//double
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 3;
		System.out.println(b);
		
		boolean boo = true; // true false 로만 저장 가능
		System.out.println(boo);
		
		//float, long 접미사를 붙여야 이용가능
		//float (f F), long (l L)
		
		float f = 1.2f;
		System.out.println(f);
		long l = 1L;
		System.out.println(l);
		
		num1 = 010; // 8진수로 인식 0~7 -> 10 = 8
		System.out.println(num1);
		
		num1 = 0x10; //16진수로 이식 (0x00) 0~ 9ABCDEF
		System.out.println(num1);
		
		//기본 자료형 8가지 자연변수 범위 {}
		{
			int a= 100;
			System.out.println(a);
		}
		int a = 50;
		System.out.println(a);


	}

}
