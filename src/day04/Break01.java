package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/*break : 반복문을 빠져나오게 하는 키워드
		 * 반복문엥서 조건문(if)를 동반하여 조건이 맞을때 반복문을 벗어나게 하는 역할
		 * for, while
		 */
		
		//1~10까지 출력
		//for 문에 무한루프를 생성, break로 빠져나옴
		for(int i =1;; i++) {
			System.out.println(i + " ");
			if(i ==10) {
				break;
			}
		}
		
		//한글자를 입력받아 출력(반복문에서 출력)
		//y를 입력받으면 종료 break;
		Scanner scan = new Scanner(System.in);

		for(;;) {
			System.out.print("한글자를 입력하세요 >");
			char a = scan.next().charAt(0);
			System.out.println(a);
			if(a == 'y') {
				System.out.println("종료");
				break;
			}
		}
		
		//중첩 반복문의 경우 break;는 나를 감싸고 있는 가장 안쪽 for문을 벗어난다
		int i =0, j=0, k=0;
		f: for(;;) {
			j++;
			for(;;) {
				k++;
				for(;;) {
					i++;
					System.out.println("i:"+ i + ", j:"+ j + ", k:"+ k);
					if(i == 10) {
						break f;
					}
				}
			}
		}
		
		
		
		
		scan.close();
		
	}

}
