package slae;

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
	
	SaleController sc = new SaleController();
	Scanner scan = new Scanner(System.in);
	
	int menu = 0;
	sc.addMenu();
	
	do {
		System.out.println("===============Kiosk================");
		System.out.println("1.메뉴추가 | 2.메뉴삭제 | 3.메뉴수정");
		System.out.println("4.메뉴보기| 5.주문| 6.주문내역출력| 7.종료");
		
		System.out.println("선택 >>");
		
		menu = scan.nextInt();
		
		switch(menu) {
		case 1: sc.add(scan); break;
		case 2: sc.delete(scan); break;
		case 3: sc.update(scan); break;
		case 4: sc.menuPrint(); break;
		case 5: sc.orderPick(scan); break;
		case 6: sc.orderPrint(); break;
		case 7: System.out.println("종료"); break;
		default:
			System.out.println("메뉴 선택 오류");
		}
	}while(menu != 7);


	scan.close();
	}
}
