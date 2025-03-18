package slae;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleController {

	
	//메뉴 리스트, 주문 리스트
	private ArrayList<Menu> menuList = new ArrayList<>();
	private ArrayList<Order> OrderList = new ArrayList<>();
	private int menuNo = 6;
	
	public void addMenu() {
		menuList.add(new Menu(1,"짜장면", 1500));
		menuList.add(new Menu(2,"짬뽕", 2000));
		menuList.add(new Menu(3,"탕수육", 5000));
		menuList.add(new Menu(4,"음료수", 500));
		menuList.add(new Menu(5,"쟁반짜장", 4000));
		menuList.add(new Menu(6,"유산슬", 5000));
	}
	public void add(Scanner scan) {
		// 메뉴 추가
		menuNo++;
		System.out.println("메뉴 이름 입력>>");
		String name = scan.next();
		System.out.println("메뉴 가격 입력>>");
		int price = scan.nextInt();
		
		menuList.add(new Menu(menuNo, name,price));
		System.out.println("메뉴추가 완료");
	}
	
	//메뉴 번호를 주면 menuList 에서 검색하여 index에 리턴하는 메서드
	public int menuSearch(int menuNo) {
		int index = -1;
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getMenuMo() == menuNo) {
				index = i;
			}
		}
		return index;
		
	}
	
	
	public ArrayList<Menu> getMenuList() {
		return menuList;
	}
	
	public void setMenuList(ArrayList<Menu> menuList) {
		this.menuList = menuList;
	}
	
	public ArrayList<Order> getOrderList() {
		return OrderList;
	}
	
	public void setOrderList(ArrayList<Order> orderList) {
		OrderList = orderList;
	}


	public void delete(Scanner scan) {
		//메뉴 삭제 remove(index)
		System.out.println("삭제할 메뉴 번호>");
		int no = scan.nextInt();
	/*	for(int i=0; i<menuList.size();i++) {
			if (menuList.get(i).getMenuMo() == no) {
				menuList.remove(i);
				System.out.println("메뉴 삭제 완료");
				return;
			}
		}
		
		System.out.println("해당 메뉴가 없습니다");
	}*/
		int index = menuSearch(no);
		if(index == -1) {
			System.out.println("해당 메뉴가 없습니다");
			return;
		}
		menuList.remove(index);
	}

	public void update(Scanner scan) {
		//메누 슈정=> 메뉴 no 받아서 가격만 수정
		System.out.println("수정할 번호>>");
		int no = scan.nextInt();
		
		for(int i=0; i<menuList.size(); i++) {
			if(menuList.get(i).getMenuMo() == no) {
				System.out.println(menuList.get(i));
				
				System.out.println("수정할 가격>>");
				int price = scan.nextInt();
				
				Menu m = new Menu(no, menuList.get(i).getMenuMame(),price );
				menuList.set(i, m);
			}
		}
		

		
	}

	public void menuPrint() {
		//메뉴출력
		System.out.println("----메뉴 ------");
		for(Menu m : menuList) {
			System.out.println(m);
		}
		System.out.println("-----------------");
		
	}

	public void orderPick(Scanner scan) {
		//주문: 주문번호와, 수량을 입력받아 orderList 객쳉 추가
		//order 객체의 주문이름/ 가격은 menu에서 찾아와서 추가
		menuPrint();
		System.out.println("메뉴번호>>");
		int no = scan.nextInt();
		System.out.println("수량>>");
		int count = scan.nextInt();
		
		//메뉴 번호로 이름과 가격을 검색
		for(int i=0; i<menuList.size();i++) {
			if(menuList.get(i).getMenuMo() == no) {
				String name = menuList.get(i).getMenuMame();
				int price = menuList.get(i).getPrice();
				
				Order order = new Order(no, name, price, count);
				OrderList.add(order);
				System.out.println("주문 추가 완료");
				return;
			}
		}

		
	}

	public void orderPrint() {
		// 영수증
		int sum =0;
		System.out.println("주문내역");
		for(int i=0; i<OrderList.size(); i++) {
			sum += OrderList.get(i).getTotal();
			OrderList.get(i).printOrder();
		}
		System.out.println("--------------------");
		System.out.println("총 결제금액: "+ sum);
	
		
		
	}

}
