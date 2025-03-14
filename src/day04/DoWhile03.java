package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고
		 * num1 =2, num2= 3
		 * menu
		 * 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료
		 * menu에 따라서 두 수의 연산 결과를 출력
		 * 1-> 2+3=5
		 * 2-> 2-3=-1
		 * ...
		 * 4-> 2/0= menu를 다시 입력해주세요
		 * 5-> 2%0= menu를 다시 입력해주세요
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1= 0;
		int num2 =0;
		int menu = 0;
		
		do {
			System.out.println("----menu----");
			System.out.println("1.+ | 2.- | 3.*");
			System.out.println("4./ | 5.% | 6.종료");
			System.out.print("num1 > ");
			num1= scan.nextInt();
			System.out.print("num2 >");
			num2= scan.nextInt();
			System.out.print("menu >");
			menu = scan.nextInt();
					
			//실제 처리기능을 구현하는 문
			switch(menu) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case 3: 
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
				break;
			case 4:
				if(num2 ==0) {
					System.out.println("다시 입력해주세요");
				}else {
					System.out.println(num1 + "/" + num2 + "=" + (num1/num2));					
				}
				break;
			case 5: 
				if(num2 ==0) {
					System.out.println("다시 입력해주세요");
				}else {
					System.out.println(num1 + "%" + num2 + "=" + (num1%num2));					
				}
				break;
			case 6: 
				System.out.println("종료");
				break;			
			default:
				System.out.println("잘못된 메뉴입니다. 다시입력");
				break;
			}
		
		}while(menu != 6);
		System.out.println("종료합니다");

			
		scan.close();
	}

}
