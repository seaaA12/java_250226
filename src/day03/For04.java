package day03;

import java.util.Scanner;

public class For04 {
	
	public static void main(String[] args) {
		/*약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 1~ 6까지 나누어 떨어지는 수
		 * 6의 약수 : 6/1 = 0, 6/2=0, 6/3=0, 6/4=2
		 * 1 2 3 6
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int num = scan.nextInt();
//		int num = 6;
		
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				System.out.println(i);
			}
		}
			
		scan.close();
		
	}
}
