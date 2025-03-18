package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/*과목과 점수를 입력받아(scanner) map에 저장
		 * 출력 / 합계 / 평균
		 * 종료 키워드가 나올때까지 반복(1=계속, 0=종료)
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * 합계, 평균 출력
		 * map.size(): 전체 개수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer>map = new HashMap<>();
	
		int exit = 1;
		while(exit !=0) {
			System.out.print("과목 점수 >>");
			String subject = scan.next();
			int num = scan.nextInt();
			
			map.put(subject, num);
			System.out.println("1: 계속, 0: 종료");
			exit = scan.nextInt();
		}
		int sum =0;
		int avg =0;

		for(String key : map.keySet()) {
			sum+= map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		avg=sum/map.size();
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		
		scan.close();
	}
}
