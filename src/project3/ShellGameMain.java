package project3;

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
		System.out.println("\r\n"
				+ " _    _ _____ _     _____ ________  ________ \r\n"
				+ "| |  | |  ___| |   /  __ \\  _  |  \\/  |  ___|\r\n"
				+ "| |  | | |__ | |   | /  \\/ | | | .  . | |__  \r\n"
				+ "| |/\\| |  __|| |   | |   | | | | |\\/| |  __| \r\n"
				+ "\\  /\\  / |___| |___| \\__/\\ \\_/ / |  | | |___ \r\n"
				+ " \\/  \\/\\____/\\_____/\\____/\\___/\\_|  |_|____/ \r\n"
				+ "");
		System.out.println("\r\n"
				+ " _____ _____   _____ _   _ _____   _____  ___  _____ _____ _   _ _____ \r\n"
				+ "|_   _|  _  | |_   _| | | |  ___| /  __ \\/ _ \\/  ___|_   _| \\ | |  _  |\r\n"
				+ "  | | | | | |   | | | |_| | |__   | /  \\/ /_\\ \\ `--.  | | |  \\| | | | |\r\n"
				+ "  | | | | | |   | | |  _  |  __|  | |   |  _  |`--. \\ | | | . ` | | | |\r\n"
				+ "  | | \\ \\_/ /   | | | | | | |___  | \\__/\\ | | /\\__/ /_| |_| |\\  \\ \\_/ /\r\n"
				+ "  \\_/  \\___/    \\_/ \\_| |_|____/   \\____|_| |_|____/ \\___/\\_| \\_/\\___/ \r\n"
				+ "");
		
		do {
			// 메뉴 출력 
			sgc.menuPrint();
			
			// 컵 섞기 
			sgc.compareResult(sgc.shuffle());
		}while(sgc.p1.getScore() < 3 && sgc.resume() != 'N');		
	}
}
