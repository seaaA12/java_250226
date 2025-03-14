package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 과제
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 3 * => 2 * 2 = 6
		 * ex) 2 3 ! => 잘못된 연산
		 * 연산자는 + - / * %
		 * 다른 종류이 특수문자가 들어오면 잘못된 연산자로 출력
		 */
		
		// 문자로 받는 케이스 : String == 비교 불가능
		//char : 한글자로 받는 케이스 == 비교 가능 (charAt())
		//scan.next() : 한단어를 입력
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = scan.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		int num2 = scan.nextInt();
		
		System.out.print("연산를 입력하세요: ");
		char c = scan.next().charAt(0);
		
/*		switch(c) {
		case '+':
			System.out.println("" + num1 + c + num2 +"="+ (num1+num2));
			break;
		case '-':
			System.out.println("" + num1 + c + num2 +"="+ (num1-num2));
			break;
		case '*':
			System.out.println("" + num1 + c + num2 +"="+ (num1*num2));
			break;
		case '/':
			if(num2 ==0) {
				System.out.println("0으로 나눌 수 없습니다");
			}else {
				System.out.println("" + num1 + c + num2 +"="+ (num1/num2));			
			}
			break;
		case '%':
			System.out.println("" + num1 + c + num2 +"="+ (num1%num2));
			break;
			default:
				System.out.println("잘못된 연산자입니다.");
		}*/
		
		if((c == '/'|| c== '%')&& num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			switch(c) {
			case '+':
				System.out.println("" + num1 + c + num2 +"="+ (num1+num2));
				break;
			case '-':
				System.out.println("" + num1 + c + num2 +"="+ (num1-num2));
				break;
			case '*':
				System.out.println("" + num1 + c + num2 +"="+ (num1*num2));
				break;
			case '/':
				System.out.println("" + num1 + c + num2 +"="+ (num1/num2));			
				break;
			case '%':
				System.out.println("" + num1 + c + num2 +"="+ (num1%num2));
				break;
			default:
				System.out.println("잘못된 연산자입니다.");
			}			
		}
		
		
		scan.close();
	}

}
