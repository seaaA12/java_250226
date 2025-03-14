package day07;

public class Method04 {

	/*점수 2~9까지를 입력받아
	 * 정수에 해당하는 구구단을 출력하는 매서드
	 * 리턴타입:
	 * 매서드명: multi
	 * 매개변수:
	 */
	public static void multi(int num1) {
		for(int i =1; i<=9; i++) {
			System.out.println(num1+"*"+i+"="+(num1*i));
		}
	}
	//구구단 출력 매소드
	public static void multi11(int num1) {
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+ " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {

		int num = 3;
		multi(num);
		
		System.out.println("-------");
		multi11(2);
	}

}
