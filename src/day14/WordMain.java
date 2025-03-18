package day14;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/*map 을 이용한 단어잘 프로그램 작상
		 * 1.단어등록|2.단어검색|3.단어수정|
		 * 4.단어출력|5.단어삭제|6.종료
		 * WordController를 생성하여 메서드 구현
		 * 기본단어 5가지 등록
		 */
		
		WordController sc = new WordController();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(sc);
		
		int menu = 0;
		sc.addMenu();
		
		do {
			System.out.println("===============================");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|");
			System.out.println("4.단어출력|5.단어삭제|6.종료");
			
			System.out.println("선택 >>");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.add(scan); break;
			case 2: sc.search(scan); break;
			case 3: sc.update(scan); break;
			case 4: sc.print(); break;
			case 5: sc.delete(scan); break;
			case 6: System.out.println("종료"); break;
			default:
				System.out.println("error");
			}
		}while(menu !=6);
		
		scan.close();
	}
}