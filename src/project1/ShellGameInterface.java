// 야바위 게임 
/*
 * # 기능 
 *  → 게임시작, 컵 돌리기, 플레이어 컵 선택, 결과 출력, 점수, 하트 상태 출력
 *		반복 (Main 에서 do-while문으로 처리), 승 패 결과 출력
 * 
 * */
package project1;

interface ShellGameInterface {	
	// 메서드
	// menuPrint() - 메뉴 출력 
		// 1) 게임 시작  2) 종료 (나가기)
	public void menuPrint();
	
	// shuffle() - 컵 섞기 
	public int[] shuffle();
	
	// compareResult() 
		// 사용자의 선택 번호를 입력 받아 야바위의 결과를 출력하고
		// score 와 life 를 출력
	public void compareResult();	
}
