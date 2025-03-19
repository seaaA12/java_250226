package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleController {

		/*멤버변수로 Sale 클래스로 리스트를 생성
		 * 제네릭 클래스 객체 생성
		 */
		
		// 메뉴판
		private ArrayList<Sale<String,Integer>> list = new ArrayList<>();
		
		// 주문내역
		private ArrayList<Sale<String,Integer>> order = new ArrayList<>();
		
		// 합계
		private int price = 0;

		public void add(Scanner scan) {
			//메뉴추가
			System.out.println("메뉴명: ");
			String menu = scan.next();
			System.out.println("가격: ");		
			int price = scan.nextInt();
			
			//객체 생성 후 추가
			Sale<String, Integer> s = new Sale<String, Integer>(menu, price);
			list.add(s);
			System.out.println("제품 추가 완료");
		}

		public void print(Scanner scan) {
			//메뉴출력
			for(Sale<String, Integer> s : list) { //list-> Sale<String, Integer>
				System.out.println(s);
			}
		}

		public void order(Scanner scan) {
			/*주문
			 * 메뉴와 수량을 입력받아 list에서 메뉴의 가격을 찾아와
			 * order메뉴 / 수량*list의 가격을 price에 저장
			 */
			System.out.println("메뉴명: ");
			String menu = scan.next();
			
			System.out.println("수량: ");		
			int n = scan.nextInt();
			
			//menu에 대한 list -> list에 getPrice()
			int index= -1;
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getMenu().equals(menu)) {
					//list에서 메뉴의 가격을 가져오기
					int price = list.get(i).getPrice();
					//가격 * 수량 값 구하기
					int sumPrice = n *price;
					//Sale 객체 생성
					Sale<String, Integer> s = new Sale<String, Integer>(menu, sumPrice);
					//order list 추가
					order.add(s);
					
					//order.add(new Sale<String, Integer>menu,(list.get(i).getPrice())*count);
					
					System.out.println("주문완료");
					return;
				}
			} 
			
			for(Sale<String, Integer> s : list) {
				if(s.getMenu().equals(menu)) {
					//리스트의 가격을 저장
					// 수량*list의 가격을 price에 저장
					price = n * s.getPrice();
					order.add(new Sale<String, Integer>(menu,price));
					System.out.println("주문완료");
					return;
				}
			}	
			System.out.println("없는 메뉴입니다");
		}

		public void orderPrint() {
			// order출력
			//마지막에 총지불금액
			System.out.println("주문내역:" +order);
			System.out.println("총결제금액: "+price);
		}
}
