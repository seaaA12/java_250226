package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*야구 게임
		 * 컴퓨터가 3자리의 숫자를 생성(각 자리수는 0~9의 수)
		 * -> 각 배열로 저장(랜덤)(중복 안됨)
		 * 유저는 3자리 숫자를 입력하여 맞추는 게임
		 * -> 중복되지 않게 3자리 입력
		 * 자리와 숫자가 일치하면 strike
		 * 자리는 일치 x 숫자만 일치하면 bell
		 * 아무것도 맞지 않으면 out
		 * ex) com:1 2 3
		 * me: 1 8 9 -> 1s
		 * me: 9 8 7 -> out
		 * me: 1 3 2 -> 1s 2b
		 * me: 1 2 3 -> 3s 정답
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int me[] = new int[3];	
		int com[] = new int[3];

		//com을 중복없이 출력
		for(int i=0; i<com.length; i++) { //com 을 채우기 위한 반복
			int r = (int)(Math.random()*10);
			com[i] = r;
			for(int j=0; j<i; j++) { //배열에 r이 존재하는지 확인하기 위한 반복
				if(com[i] ==com[j] ) {
					i--;
					break;
				}
			}
		}
		
		for(int c: com) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("======");
			 
		while(true) {
			//me 입력
			System.out.println("숫자 입력>");
			//숫자를 하나의 문자로 받아 me에 나누어 저장(숫자로)
			String myStr = scan.next();
			String[] myStrTemp = myStr.split(""); //한글자씩 배열로 저장
				 
			//숫자로 변환해서 저장
			for(int i=0; i<me.length; i++) {
					 me[i] = Integer.parseInt(myStrTemp[i]);
					 
			}
			//숫자비교
			int stk = 0;
			int ball =0;
				 
			for(int i=0; i<com.length;i++) {
				for(int j=0; j<me.length; j++) {
					if(com[i]==me[j] && i==j) {
						//값도 같고 위치도 같으면
						stk++;
					}else if(com[i] == me[j] && i!=j) {
						//값만 같다면
						ball++;
					}
				}
			}
			//출력
			if(stk==0 && ball ==0) {
				System.out.println("out");
			}else {
				System.out.println(stk + "s "+ ball+ "b");
			}
			//종료 조건
			if(stk==3) {
				System.out.println("정답 종료합니다");
				break;			 		 
			}
		}
		scan.close();
	}

}
