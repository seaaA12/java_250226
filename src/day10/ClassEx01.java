package day10;

import java.util.Scanner;

public class ClassEx01 {

	public static void main(String[] args) {
		/*Product 클래스 생성: 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품명과 가격을 출력하는 매서드
		 * 상품을 추가하는 매서드
		 */
		
		/*main 클래스에서 처리
		 * 상품 10개를 등록가능한 배열 생성
		 * 스캐너를 통해서 상품을 등록받기
		 * 등록한 상품을 출력
		 */

		Scanner scan = new Scanner(System.in);
		//Product 클래스를 10개 담을 배열 생성
		Product[] productArr = new Product[10];

		//상품등록(y/n) -> n 선택시 그만(출력)
		
		char c = 'y';//반복키워드
		int cnt=0; //index 역할
		
		while(c != 'n') {
			System.out.println("상품 등록(Y/N)");
			c = scan.next().charAt(0);
			if(c=='y') {
				System.out.println("상품명: ");
				String name = scan.next();
				System.out.println("가격: ");
				int price = scan.nextInt();
				
				Product p = new Product();
				p.insertProduct(name, price);
				productArr[cnt]= p;
				cnt++;
				
			}else {
				if(c=='n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("y/n만 가능합니다");
				}
			}
			
		}
		System.out.println("--등록된 상품 List--");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+" "+ productArr[i]);
		}
		scan.close();
	}

}
