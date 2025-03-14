package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균, pass 여부를 출력
		 * pass 여부는 80점 이상이면 합격
		 * 100점 보다 크거나 0보다 작으면 다시 입력
		 *
		 * 
		 * return : 메서드 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		
		if((kor>100 || kor <0)||(eng>100 || eng <0)||(math>100 || math <0)) {
			System.out.println("잘못된 점수입니다");
		}else {
			int sum =kor + eng + math;
			System.out.println("합계 : " +sum);
			
			double avg = sum / (double)3;
			System.out.println("평균 : " +avg);
			
			if(avg >=80) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}		
		}
		
		scan.close();

	}

}
