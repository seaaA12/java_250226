package day06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiArrayEx01 {

	public static void main(String[] args) {
		/*성적표
		 * 몇명의 성적을 출력할지 결정> 3
		 * 이름 국어 영어 수힉 총점 평균 석차 = > syso 출력
		 * hong 89 60  95 00   00  00
		 * choi 89 60  95 00   00  00
		 * park 89 60  95 00   00  00
		 * "\t" : 탭
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("테스트 참가 인원>");
		int tester = scan.nextInt();
		
		//이름, 점수, 합계, 평균 => 배열을 정의
		String name[] = new String[tester];
		int scores[][]= new int[tester][3];
		int totals[]= new int[tester];
		double avgs[] = new double[tester];
		int ranking[] = new int[tester];
		
		
		for(int i=0; i<tester; i++) {
			System.out.println((i+1)+"번째 이름> ");
			name[i] = scan.next();	
//			System.out.println(name[i]+"학생의 성적(국어 영어 수학)> ");
//			for문 없이 성적 입력 받기
//			scores[i][0]= scan.nextInt();
//			scores[i][1]= scan.nextInt();
//			scores[i][2]= scan.nextInt();
			for(int j=0; j<3; j++) {
				//scores[i][j]= scan.nextInt();
				scores[i][j]= (int)(Math.random()*50)+50;
				totals[i] += scores[i][j]; //합계 계산			
			}
			avgs[i]= totals[i]/ (double)scores[i].length;
		}
		
		DecimalFormat df = new DecimalFormat("#.0");
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		
		for(int i=0; i<tester; i++) {
			System.out.print(name[i]+"\t");
			//성적만 2차원 배열 -> 2중 for문
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(totals[i]+"\t");
			System.out.print(df.format(avgs[i])+"\t");
			
			int rank =1;
			//순위
			for(int r=0; r<tester; r++) {
				if(totals[i]<totals[r]) {
					rank++;
				}
			}
			ranking[i] = rank;
			System.out.print(ranking[i]);
			System.out.println();
		}
		scan.close();
	}

}
