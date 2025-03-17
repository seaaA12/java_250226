package day13;

public class Exception03 {

	public static void main(String[] args) {
		//0으로 나누었을때 발생하는 예외 처리
		// ex) num=1, num=2, op= + => 4
		// ex) num=1, num=0, op= / => 오류 메세지 출력
		
		Exception03 e03 = new Exception03();
				
		try {
			//예외가 발생할 수 있는 구문
			System.out.println(e03.calc(4, 0, '+'));
			System.out.println(e03.calc(4, 0, '-'));
			System.out.println(e03.calc(4, 0, '*'));
			System.out.println(e03.calc(4, 0, '^'));
			System.out.println(e03.calc(4, 0, '/'));
			System.out.println(e03.calc(4, 0, '%'));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(e03.calc(4, 0, '+'));
		System.out.println(e03.calc(4, 0, '-'));
		System.out.println(e03.calc(4, 0, '*'));
		System.out.println(e03.calc(4, 0, '/'));
		System.out.println(e03.calc(4, 0, '%'));
	}
	/*매서드 예외 발생시키기 : throw new로 발생 시킬 수 있음
	 * throw: 예외 떠넘기기(예외를 나를 호출하는 다른 매서드로 넘기)
	 * 예ㅗ이가 발생 시키게 되면 매서드 선언부 끝에 throws 를 적고,  발생할 수 있는
	 * 외ㅇ를 반드시 적어줘야함
	 * throws 는 에외적으로 runTimeException 만 생략가능
	 */
	/*매서드: 두 수를 입력받고 연산자를 입력받아
	 * 4칙연산의 결과를 리턴하는 매서드
	 * 매개변수; 두 정수 연산자 int num2, char op
	 * 리턴타입: double
	 */ 
	
	public double calc(int num1, int num2, char op) throws RuntimeException {
		double res = 0;
		
		if((op=='/'|| op=='%') && num2 == 0) {
			throw new RuntimeException("num2는 0이될 수 없습니다");
		}
		switch(op) {
		case'+' : res = num1 + num2; break;
		case'-' : res = num1 - num2; break;
		case'*' : res = num1 * num2; break;
		case'/' : res = num1 / num2; break;
		case'%' : res = num1 % num2; break;
		default:
			//예외 미리 발생 시키기
			throw new RuntimeException(op +"는 산술 연산자가 아닙니다");
		}
		return res;
	}
	
	
}
