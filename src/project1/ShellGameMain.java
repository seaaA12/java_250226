package project1;

public class ShellGameMain {
	public static void main(String[] args) {
		// 멤버 변수 초기화
		ShellGameController sgc = new ShellGameController();
		
		sgc.menuPrint();
		int menu =0;
		
		do {
			System.out.println("게임 시작 컵 하나를 선택하세요");
			switch(menu) {
			case 1: System.out.println("게임시작");break;
			default: 
				System.out.println("error");
			}
		
		}while(sgc.resume() != 'N');
	}
}
