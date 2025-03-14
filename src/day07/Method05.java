package day07;

public class Method05 {
	
	// 두 정수를 입력 받아, 최대공약수를 리턴하는 매서드
	/*리턴타입: 최대공약수-> int
	 * 매개변수: 두정수-> int num1, int num2
	 * 매서드명: gcd
	 */
	public static int gcd(int num1, int num2) {
		int gcd =0;
		for(int i=1; i<= num1; i++) {
			if(num1 % i ==0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	// 두 정수를 입력 받아, 최소공배수를 리턴하는 매서드
	/*리턴타입: 최소공배수-> int
	 * 매개변수: 두정수-> intnum1, int num2
	 * 매서드명: lcm
	 */
	public static void lcm(int num1, int num2) {
		for(int i=num2; ; i= i+ num2) {
			if(i % num1==0 && i % num2 ==0) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 리턴
		 * n
		 */
		
		int num1 = 6;
		int num2 = 12; 
		
		System.out.println(gcd(num1,num2));
		System.out.println("-----");
		lcm(num1,num2);

	}

}
