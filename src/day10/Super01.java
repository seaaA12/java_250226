package day10;

public class Super01 {

	public static void main(String[] args) {
		/*상속: 부모의 것을 자식에게 물려주는것
		 * -맴버변수/ 매서드만 상속가능
		 * -클래스의 확장 개념
		 * -상속을 하는 이유:재사용을 해서 중복코드를 줄이고, 유지보수를 쉽게하기 위해
		 * 
		 * classA(부모),classB(자식)
		 * 
		 * classB extends A{
		 * 
		 * }
		 * 상속키워드: extends
		 * -상속을 받으면 부모의 맴버변수와 매서드를 사용할 수 있다
		 * -접근제어자가 private 이면 자식이 접근 불가능
		 *- 접근제어자가 protected: 상속받는 자식에게 허용하는 제어자
		 *- 상속은 1개만 부모가 2명이 될수 없음(단일 상속이 원칙)
		 */
		
		A a = new A();
		a.setA(1);
		a.setB(2);
		a.setC(3);
		a.num = 10; // 접근제어자가 protected 직접 접근 가능
		a.print();
		
		System.out.println("--------");
		B b = new B();
		b.setA(10);
		b.setB(20);
		b.setC(30);
		b.setD(40);
		b.setE(50);
		b.setF(60);
		b.num =100;
		b.print();
	}

}

class A{ //부모
	private int a,b,c; //나만 사용가능
	protected int num; //상속 가능 변수
	
	public void print() {
		System.out.println("a:"+a+", b:"+b+", c:"+c);
		System.out.println("num:"+ num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class B extends A{ //자식
	private int d,e,f;

	//override(오버라이드): 부모의 매서드를 재정의 하여 사용하는것
	//super: 부모의 값을 가져올때 키워드
	//this: 내 값을 사용할때 키워드
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("d:"+d+", e:"+e+", f:"+f);
	}	
	
	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}