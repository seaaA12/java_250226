package day04;

public class For07 {

	public static void main(String[] args) {
		// for, while
		/*for문을 이용하여 구구단 5단을 출력
		 * 
		 */

		int dan = 5;
				
		for(int i = 1; i <=9; i++) {
			System.out.println(dan + "*" + i+ "=" +(i*dan));
		}
		
		System.out.println("--------------");
		
		for(int i=1,j=1; j<=9; j++) { 
			System.out.println(dan + "*" + j + "=" +(j*dan));
		}
		
		System.out.println("--------------");
		//이중 for문 //2~9단까지 반복
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i + "*" + j + "=" +(j*i)+ " ");
			}
			System.out.println();//줄바꿈
		}
				
	}

}
