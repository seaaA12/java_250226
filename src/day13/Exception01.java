package day13;

public class Exception01 {

	public static void main(String[] args) {
		/*Exception: 예외. 예외처리
		 * 오류의 종류
		 * 논리적 에러:실행은 되지만 의도와는 다르게 동작하는것
		 * 컴파일 에러: 컴파일 시 발생하는 에러 (문법 구문 오류: syntax error)
		 * 란터임 에러: 실행시 잘못된 결과를 얻거나, 외부적인 요인으로 비정상 종료가 되는 경우
		 * 
		 * 실행시(runTime) 발생할 수 있는 오류를 에러(error), 예외(exception)두가지로 구분
		 * 에러(error): 프로그램 코드에 의햇 수습될 수 없는 심각한 오류
		 * 예외(exception): 코드에 의해 수습될 수 이쓴ㄴ 비교적 절 심각한 오류
		 * 문제가 발생할 때를 대비하여 이에 대한 대응 코드를 미리 작성함-> 예외처리
		 * 예외처리를 통해 비정상 종료를 막을 수 있음
		 * 
		 * 예외가 발생되면 예외 발생 시점부터 코드는 중지0.예외 문구 출력
		 *  예외처리->예외가 발생되면 코드만 배고 나머지는 정상적처리로 유지시키는 기능
		 *  
		 *  try~ catch
		 *  tyy catch finally
		 *  try:예외가 발생할 가능성이 있는 구문을 작성
		 *  catch; try 구문에서 발생한 에외를 처리
		 *  finally: try구문에서 반드시 실행되어
		 */  	 		 
		
		/*	System.out.println(1+0);
			System.out.println(1/0);	
			System.out.println(1-0);  */
				
			try {
				//예외 발생 가능성이 있는 코드 작성
				System.out.println(1+0);
				System.out.println(1/0);	
				System.out.println(1-0); 
				
			}catch(Exception e){
				//e:클래스의객체(예외 모든 클래그를 ㅅ잡아주는 역할)
				e.printStackTrace(); //예외 구문을 콘솔에 출력
				System.out.println("0으로 처리 되었습니다");
				System.out.println(e.getMessage());
				
				
			}
			//exceptoin 발생해도 처리되는 구역
			System.out.println(3+4);
			
				
	}
}
