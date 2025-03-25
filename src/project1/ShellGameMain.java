package project1;

public class ShellGameMain {
	
	public static void main(String[] args) {
		// 멤버 변수 초기화
		ShellGameController sgc = new ShellGameController();
		
		/* 게임을 시작하시겠습니까 Y 게임시작
		 * 셔플 랜덤 수 출력
		 * 컵 위치 입력
		 * 결과 출력
		 * 현재 스코어 출력
		 * 반복
		 */
		do {
			
			sgc.menuPrint();
			sgc.compareResult(sgc.shuffle());

			
		}while(sgc.resume() != 'N');		

		//배팅 종료 후 금액 출력
		
		
	}
}
