package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*컴퓨터와 가위바위보 게임.
		 * 컴퓨터는 랜덤으로 가위,바위,보 중 하나를 선택
		 * 0= 가위, 1=바위, 2=보
		 * 
		 * ex) 
		 * com = 0(가위), me= 2(보)
		 * com 승리
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int me = 0;
		
		System.out.println("----가위바위보 게임----");
		int comNum = (int)(Math.random()*3); //0 1 2
		System.out.println("0= 가위 | 1= 바위 | 2= 보");
		System.out.print("입력 >");
		String myChoice = scan.next(); 
		String comChoice = comNum == 0? "가위" : 
			comNum == 1? "바위" : "보";
		
		System.out.println("comChoice > " + comChoice);
		System.out.println("myChoice > " + myChoice);
		
		//비교.
		if(!(myChoice.equals("가위")|| myChoice.equals("바위")||myChoice.equals("보"))){			
			System.out.println("입력 오류 입니다");
		}else {
			if(comChoice.equals(myChoice)) {
				System.out.println("무승부");
			}else {
				//승 / 패
				if(comChoice.equals("가위")){
					//바위
					System.out.println(myChoice.equals("바위")? "승": "패");
					
				}else if(comChoice.equals("바위")) {
					//보
					System.out.println(myChoice.equals("보")? "승":"패");
				}else {
					//가위
					System.out.println(myChoice.equals("가위")? "승":"패");
				}			
			}	
		}
		
		scan.close();
	}

}
