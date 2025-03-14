package day10;

public class Stati01 {

	public static void main(String[] args) {
		/* static
		 * static는 클래스의 맴버변수/ 클래스의 매서드라고 한다
		 * -객체 생성없이 클래스가 만들어지면 생성
		 * -객체 생성없이 클래스만으로 호출 가능
		 * -클래스명, 매서드/ 클래스명, 맴ㅇ버변수 -> 사용방법
		 * -객체를 생성해서 호출도 가능은 하나, 그렇게 사용하지 않은(노란밑줄)
		 * -클래스의 맴버변수/ 매서드는 하나의 맴버변수가 모든 객체에 공유(사용)할때 사용
		 * 
		 * static 안붙은 매서드/ 맴버변수는 객체(인스턴스)의 맴버벼수, 매서드라고 한다
		 * -객체를 통해 사용되고 생성된다
		 * (객체를 생성하지 않으면 맴버변수의 매서드를 사용할 수 없음)
		 * -객체명, 매서드/ 객체명, 맴버변수
		 * -각 객체마다 독립적인 객체-> 독칩적인 맴버변수/매서드를 생성
		 * 
		 * 클래스와 객체는 생성되는 시점이 달라서 매서드와 맴버변수를 사용할 수 있는 환경이 다르다
		 * 객체 맴버는 클래스가 생성되고 객체를 생성한 후 사용할 수 있음
		 * 클래스 맴버는 클래스가 생성되면 바로 사용가능
		 * 
		 * -클래스 맴버는 클래스맴버/객체맴버에서 둘다 사용가능
		 * -객체 멤버는 클래스맴버에서 사용 불가능(객체 생성 후 사용 가능)
		 * -같은 객체 맴버에서만 사용 가능
		 */

		//클래스 맴버(static)에 접근하는 방식
		//현시점에서 static의 맴버변수와 매서드 이미 생성되어 있음
		TV.printBrand(); //클래스명, 매서드명()
		//System.out.println(TV.BRAND);
		
		//객체 맴버 호출
		TV t = new TV(); // 이 시점에서 객체 맴버들이 생성
		t.printPower();
		t.printBrand(); //기능은 하지만 잘쓰지않음
		
		
		
	}

}

class TV{
	private boolean power;
	private static final String BRAND="LG";
	
	public static void printBrand() {
		System.out.println("brand: "+ BRAND);
		//static 매서드에 일반 객체맴버변수 호출 불가능
		//System.out.println(power);
	}
	public void printPower() {
		System.out.println(power);
		//일반 객체매서드에서 static 맴버변수 가능
		System.out.println("brand"+ BRAND);
	}
}
