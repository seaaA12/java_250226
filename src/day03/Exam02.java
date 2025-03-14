package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*주사위 게임
		 * 주사위를 던져서 총 30칸을 이동하는 게임
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * ex)
		 * 주사위: 3
		 * 3칸 전진-> 27칸 남았습니다
		 * 주사위: 3
		 * 1칸 전진-> 26칸 남았습니다
		 * 주사위: 3
		 * 6칸 전진-> 20칸 남았습니다
		 * ...
		 * 도착 총 이동횟수: 10번-> 주사위를 던진 횟수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int i = 0;
		int count = 0;
		
		while(true) {
			System.out.print("주사위:");
			scan.nextLine();
			int random = ((int)(Math.random()*6)+1);
			System.out.println(random);
			count++;
			i = i+random;
			System.out.println(random + "칸 전진 ->" +(30-i) + "칸 남았습니다");		
			
			if(i >=30) {
				System.out.println("--------------------------");
				break;					
			}
			
			
		}
		System.out.println("도착! 총 이동횟수: "+ count +"번");
		
		int sum = 0; //거리 누적 값(주사위 누적)
		int count1 = 0; //주사위 던진 횟수(이동횟수)
		int last = 30; // 최종 목표 이동 수
		
		System.out.println("게임 시작 주사위를 던져주세요(enster)");
		while(sum < last) {
			
			scan.nextLine();
			int random = ((int)(Math.random()*6)+1);
			System.out.println("주사위: " + random);
			//발생거리 합산
			sum += random;
			count++;
			System.out.println(random + "칸 전진->" + (last - sum) + "칸 남았습니다");
			
		}
		System.out.println("도착 총 이동횟수: " + count);
		
		
		scan.close();
	}

}
