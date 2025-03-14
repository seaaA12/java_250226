package day09;

public class Exam01 {

	public static void main(String[] args) {
		/* 매서드로 작업
		 * 두 정수의 값이 주어졌을 뗴
		 * 두 정수 사이의 모든 정수의 합을 리턴하는 매서드
		 * ex0 a= 3, b=5 => 3+4+5
		 * a=10, b=5=> 5+6+7+8+9+10
		 * a=10, b=10=> 10
		 */

		Exam01 ex = new Exam01();
		System.out.println(ex.sum(3, 5));
		System.out.println(ex.sum(10, 5));
		System.out.println(ex.sum(3, 3));
	}
	//매개변수: 두 정수 -> int num1, int num2
	//리턴타입: 합 -> int
	public int sum(int num1, int num2) {
		int a=0, b=0, sum=0;
/*		if(num1 > num2) {
			a= num2;
			b= num1;
		}else if(num1 < num2) {
			a= num1;
			b= num2;
		}else {
			return num1;
		}
		*/
/*		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2= tmp;
		}
		*/
		a= Math.min(num1, num2);
		b= Math.max(num1, num2);
		num1= a; num2= b;
		for(int i =a; i<=num2; i++) {
			sum+=i;
		}
		return sum;
	}
}
