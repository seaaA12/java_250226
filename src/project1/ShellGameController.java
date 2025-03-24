package project1;

import java.util.Scanner;

public class ShellGameController implements ShellGameInterface{
	// 멤버 변수 초기화
		// 플레이어 생성, 사용자
	ShellGamePlayer p1 = new ShellGamePlayer();
	
	
		// Scanner 설정
	Scanner sc = new Scanner(System.in);
	
	// 기본 생성자 
	public ShellGameController() {};
	
	
	//메서드
		// menuPrint() - 메뉴 출력 
		// 1) 게임 시작  2) 종료 (나가기)
	@Override
	public void menuPrint() {
		
		
	}

	// shuffle() - 컵 섞고 결과를 리턴
	@Override
	public int shuffle() {
		// 결과를 0 ~ 2 (3개의 선택지) 사이에 저장 
		int[] result = new int[3];
		//int result = 0;
		for(int i=0; i<3; i++) {
			result[i] = (int) (Math.random() * 3);
			for(int j=0; j< i; j++) {
				i--;
				break;
			}
		}

		
		// Logic 구현
		//0: 정답, 1:꽝, 2:폭탄
		
		return result;
	}
	

	// compareResult() 
		// 사용자의 선택 번호를 입력 받아 승부 결과를 출력하고
		// score 와 life 를 출력
	@Override
	public void compareResult() {
		// 패배
			p1.decreaseLife();
			System.out.println("진행할 수 있는 하트가 없습니다");
			
		// 승리 
			// suffle() 로 return 받은 숫자와 사용자의 입력 숫자가 같은 경우에만 승리 
			p1.increaseLife(); p1.increaseScore();
			System.out.println("점수 3점 획득! 축하합니다 승리입니다");
			
		// 폭탄 
			p1.decreaseLife(); p1.decreaseScore();
			System.out.println("폭탄입니다! 하트 1감소 점수 1감소");
	}
	
	
	// resume() - 계속 진행할지 묻기 
	public char resume() {
		char c;
		
		System.out.println("의미를 계속 등록하시겠습니까? (Y/N)");
		System.out.print("입력 (Y/N) : ");
		
		c = Character.toUpperCase(sc.next().charAt(0));
		
		return c;
	}
}
