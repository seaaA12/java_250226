package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*숫자를 입력받아(0이나 -숫자를 입력하면 종료)
		 * 입력받은 숫자의 합계와 평균을 출력
		 * ex) 3+5+4+8+9+ = 합, 평균 출력
		 */
		
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		int i = 0;
		
		do {
			System.out.print("입력:");
			num = scan.nextInt();
			
			sum = sum + num;
			i++;
			
		}while(num >0);
			if(i > 1) {
				System.out.println("합계:"+sum+" 평균:"+(sum/i));				
			}
		
			
			System.out.println("종료합니다");
		
		
		scan.close();
	}

}
