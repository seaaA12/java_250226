package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/*계산기 만들기
		 * 
		 * --menu--
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료
		 * >> 메뉴선택 1
		 * >> 숫자입력 1 5
		 * 결과: 1 + 5 = 6
		 * 
		 * 덧셈 뺄셈 곱셈 나눗셈 나머지는 매서드로 호출하여 연산결과를 출력
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int menu = 0;

		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료");
			System.out.print("num1 >> ");
			num1= scan.nextInt();
			System.out.print("num2 >> ");
			num2= scan.nextInt();
			System.out.print("메뉴 선택>> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println(num1+"+"+num2+"="+Method03.sum(num1, num2)); 
				break;
			case 2: 
				System.out.println(num1+"-"+num2+"="+Method03.sub(num1, num2)); 
				break;		
			case 3: 
				System.out.println(num1+"*"+num2+"="+Method03.mul(num1, num2)); 
				break;		
			case 4: 
				double r = Method03.div(num1, num2);
				if(r == -999999999) {
					System.out.println("피연산자가 0입니다");
				}else {
					System.out.println(num1+"/"+num2+"="+Method03.div(num1, num2));
					break;			
				}
			case 5:
				int m = Method03.mod(num1, num2);
				if(m == -999999999) {
					System.out.println("피연산자가 0입니다");
				}else{
					System.out.println(num1+"%"+num2+"="+Method03.mod(num1, num2));
					break;			
				}
			case 6:
				System.out.println("종료");	
				break;
			}
		}while(menu!=6);
		System.out.println("종료합니다");
		
		scan.close();
	}

}
