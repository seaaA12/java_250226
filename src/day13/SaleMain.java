package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleMain {
	
	public static void main(String[] args) {
		/*Kiosk
		 * 메뉴(메뉴명,가격) / 주문(메뉴명,가격,수량,금액)
		 * 주문 class는 메뉴 class를 상속받아 확장
		 * 
		 * --menu--
		 * 1.메뉴추가 | 2.메뉴삭제 | 3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체메뉴출력)| 5.주문| 6.주문내역출력(영수증)| 7.종료
		 */
		
		//메뉴추가 list.add(scan);
		//메뉴삭제 list.remove();
		//메뉴수정 list.set(0,0);
		//메뉴보기 System.out.println(list);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============Kiosk================");
		System.out.println("1.메뉴추가 | 2.메뉴삭제 | 3.메뉴수정");
		System.out.println("4.메뉴보기| 5.주문| 6.주문내역출력| 7.종료");
		
		int menu = 0;
		
		ArrayList<Menu> list = new ArrayList<>();
		
		
		
		scan.close();
	}
}
