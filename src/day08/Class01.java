package day08;

public class Class01 {

	/* 클래스의 구성요소: 멤버변수, 매서드, 생성자
	 * 멤버변수 먼저, 매서드가 뒤에 선언
	 * 
	 * 클래스- 객체를 성공하기 위한 설게도
	 * 객체- 제품(클래스로부터 생성된 베품)
	 * 매서드- 기능
	 * 맴버변수- 속성(매서드의 기능에 필요한), 정보
	 * 
	 * 프린트 클래스
	 * -속성(맴버변수): 크기, 색, 제조사, 제품명, 종류
	 * -기능(매서드): 인쇄, 복사, 스캔, 팩스
	 * 
	 * 클래스는 다른 클래스와 겹쳐지지 않게 정의
	 * 클래스 선언
	 * class 클래스명
	 * - public class -> 파일명과 같은 이름의 클래스에게만 부여
	 * 
	 * 객체 선언
	 * 클래스명 객체명 = new 클래스명(); -> 클래스명 객체명 = new 생성자;
	 * 
	 * 객체 선언
	 * 클래스명 객체명; -> 같은 null
	 * 객체명 = new 클래스명();
	 * 
	 * 매서드 사용방법(static이 안붙은 일반 매서드)
	 * -다른 클래스에서 호출할 경우 -> 객체를 선언 후 객체명, 매서드명(); 
	 * -같은 클래스 안에서 매서드를 호출할 경우-> 매서드명();
	 * 
	 * 접근제어자(제한자)
	 * public; 모두 사용가능
	 * protected: 나+ 패키지+ 자식클래스
	 * (default): 나+ 패키지
	 * private: 나
	 * 
	 * private <default <protected <public
	 * 
	 * -하나의 파일 안에 하나의 클래스만 있을 수 있는건 아님
	 * -하지만 일반적으로 하나의 파일에 하나의 클래스를 사용
	 * -클래스에서 public를 붙일 수 있는건 파일명 == 클래스명 같을 경우만 가능
	 * -멤버 변수나, 매서드에서는 public 가능
	 * -멤버변수는 private, 매서드는 public 선언이 일반적
	 * -private으로 선언된 멤버변수는 getter/setter 매서드를 만들어서
	 * 해당 변수로 접근 가능하도로 만들어줌
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.print();
//		p.x= 10;
//		p.y= 20;
		p.setX(10);
		p.setY(5);
		System.out.println(p.getX());
		System.out.println(p.getY());
		p.print();
		
		
		Point p2= new Point();
		p2.print();
//		p2.x= 5;
//		p2.y= 3;
		p2.setX(2);
		p2.setY(5);
		p2.print();
		
		//x+Y 값으로 설정
		p2.setX(p2.getX()+p2.getY());
		p2.print();
		p.print();
		
	}

}
//(0.1) -> (x,y)
class Point{
	//멤버변수 위치
	//맴버변수는 초기값을 설정하지 않아도 자동 설정
	// int = 0, String = null
	int x;
	int y;
	
	//멤버변수와 배개변수의 이름이 같은경우
	//멤버변수에 this.멤버변수
	//멤버변수 선언 후 매서드
	
	// x,y 출력 매서드
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	//getter/ setter 매서드 생성
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x= x;
	}
	public void setY(int y) {
		this.y= y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
