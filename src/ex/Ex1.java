package ex;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		
		while (bool) {
			System.out.println(" === Dice Game === ");
			System.out.println("1. GameStart");
			System.out.println("2. GameScore");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				// 실제 게임 로직 작성

				int comNum = 0;
				int comSum = 0;
				int userNum = 0;
				int userSum = 0;
				
				int myMoney = 10000;
				int myMoney2 = 0;
				for (int i = 0; i < 3; i++) {
					comNum = r.nextInt(6)+1;
					userNum = r.nextInt(6)+1;
					
					

					System.out.printf("%d, %d\n",userNum, userSum);
					System.out.printf("%d, %d\n",comNum, comSum);
				}
				comSum += comNum;
				userSum += userNum;

				System.out.printf("%d, %d\n",userNum, userSum);
				System.out.printf("%d, %d\n",comNum, comSum);

				while (true) {
					System.out.println("<< Game Start >>");
					System.out.println("당신 주사위 3회 합 : " + userNum);
					System.out.println("베팅하시겠습니까?(y/n) : ");
					char ch = sc.next().charAt(0);
					if ((ch == 'y') || (ch == 'Y')) {
						System.out.println("현재 소지금 > " + myMoney);
						System.out.println("베팅금액 > ");
						myMoney2 = sc.nextInt();
					} else {
						break;
					}
					System.out.println("========================");
					System.out.println("컴퓨터 주사위 3회 합 " + comSum);
					System.out.println("<< 게임 결과 >>");

					if (comSum < userSum) {
						System.out.println("당신이 이겼습니다.");
						myMoney += myMoney2;
					} else if (comSum > userSum) {
						System.out.println("당신이 졌습니다.");
						myMoney -= myMoney2;
						
						}
					if (myMoney == 0) {
						System.out.println("게임을 종료합니다");
						break;
					}
				}

			case 2:
				// 맞춘 횟수 출력후 선택화면으로
				break;
			case 3:
				bool = false;
				break;
			}

		}
	}
}