package word;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 단어장 프로그램
		 * 하나의 단어에 뜻이 여러개 등록
		 * class 활용. 
		 * Map<String, ArrayList<String>> map
		 * 
		 * 1.단어등록|2.단어검색|3.단어수정|
		 * 4.단어출력|5.단어삭제|6.단어를 파일로 출력|종료
		 * WordController 생성하여 메서드 구현
		 * 기본단어 5가지 등록
		 * 
		 * class로 활용시 
		 * 단어, 뜻(ArrayList equals 사용: 단어가 같으면 같은 객체
		 * 
		 * while로 단어 추가 여부 확인
		 */

		WordController sc = new WordController();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		sc.addPrint();
		
		do {
			System.out.println("===============================");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|");
			System.out.println("4.단어출력|5.단어삭제|6.단어를 파일로 출력|7.종료");
			
			System.out.println("선택 >>");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.add(scan); break;
			case 2: sc.search(scan); break;
			case 3: sc.update(scan); break;
			case 4: sc.print(); break;
			case 5: sc.delete(scan); break;
			case 6: try {
					sc.txtPrint(scan);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} break;
			case 7: System.out.println("종료합니다"); break;
			default:
				System.out.println("error");
			}
		}while(menu !=7);
		System.out.println("종료");
		
		scan.close();
	}

}
