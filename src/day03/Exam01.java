package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*up/down 게임
		 * 
		 * 1~50까지의 랜덤 수 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성: 23
		 * 입력> 10
		 * up!
		 * 입력>20
		 * up!
		 * 입력>30
		 * down
		 * 입력>23
		 * 정답!
		 */

		Scanner scan = new Scanner(System.in);

		int randomNum = ((int)(Math.random()*50)+1);
		System.out.println(randomNum);
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다");
		int i = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 :");
			int num = scan.nextInt();
			i++;
			
			if(randomNum == num) {
				System.out.println("정답!");
				break;
			}else if(randomNum > num) {
				System.out.println("up");
			}else if(randomNum < num) {
				System.out.println("down");
			}	
			if(i == 5) {
				System.out.println(i + "회 횟수제한 실패");
				break;
			}
		}
		scan.close();
	}

}
