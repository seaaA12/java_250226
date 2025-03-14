package day01;

public class Casting {

	public static void main(String[] args) {
		/* casting : 자료형 변환
		 * a = b : 두 변수의 자료형이 맞지 않는다면 오류
		 * 양쪽의 자료형을 맞춰주는 역할
		 * 
		 * 자동 자료형 변환 : auto casting
		 * byte < short < char < int < long -> float -> double
		 * float < double
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에(타입)
		 */

		byte b = 1;
		short sh = b; //자동형 변환
		System.out.println(sh);
		
		char ch = (char)sh; //명시적 형변환
		System.out.println(ch);
		
		double num1 = 3.14;
		int num = (int)num1; //소수점이 날아감
		System.out.println(num1);
		System.out.println(num);
		
		int i = ch;
		System.out.println(i);
		long l = i;
		float f= l;
		double d= f;
		System.out.println(d);
		
		double d2 = 3.14;
		float f2 = (float)d2;
		System.out.println(f2);
		long l2 = (long)f2;
		int i2 = (int)l2;
		System.out.println(i2);
		char ch2 = (char)i2;
		System.out.println(ch2);
		//실행시 크기가 범위를 초과할 경우 표시x, error
		short sh2 = (short)ch2;
		byte b2 = (byte)sh2;
		System.out.println(b2);
		
		//문자를 숫자로 변환
		String str = "1234";
		int strNum = Integer.parseInt(str);
		System.out.println(strNum + 10);
		System.out.println(str + 10);
		
		//숫자를 문자로 변환
		int numStr= 123456;
		String numStr2 = String.valueOf(numStr);
		System.out.println(numStr2);
		System.out.println(numStr2 + 10);


	}

}
