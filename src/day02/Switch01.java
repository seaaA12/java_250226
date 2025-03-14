package day02;

public class Switch01 {

	public static void main(String[] args) {
		//switch(변수 / 식){
		// case 값1 : 실행문; break;
		// case 값2 : 실행문; break;
		// case 값3 : 실행문; break;
		// default: 실행문;
		// }
		// break; 구문을 빠져나갈때 사용(조건문을 포함)
		
		//짝수 홀수 switch 구문으로 실행
		
		int num = 5;
		
		int mod = num % 2;
		System.out.println(mod);
		
		switch(num % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			default:
				System.out.println("잘못된 값입니다.");
		}
		
		
		//num1의 값이 1, 2, 3이라고 가정하고
		//num1의 값에 따라 1 이면 1칸전진, 2이면 2칸전진, 3이면 3칸전진
		//나머지 값은 다시 입력하세요
		
		int num1 = 1;
		
		switch(num1) {
		case 1:
			System.out.println("1칸 전진");
			break;
		case 2:
			System.out.println("2칸 전진");
			break;
		case 3:
			System.out.println("3칸 전진");
			break;
			default:
				System.out.println("다시 입력하세요");
		}
		System.out.println("---------------");
		
		switch(num1) {
		case 1: System.out.println("1칸전진"); break;
		case 2: System.out.println("2칸전진"); break;
		case 3: System.out.println("3칸전진"); break;
		default:
			System.out.println("다시입력하세요.");
		}
		
		System.out.println("---------------");
		
		switch(num1) {
		case 1: System.out.println(num1+"칸전진"); break;
		case 2: System.out.println(num1+"칸전진"); break;
		case 3: System.out.println(num1+"칸전진"); break;
		default:
			System.out.println("다시입력하세요.");
		}
		
		System.out.println("---------------");
		
		switch(num1) {
		case 1: case 2: case 3:
			System.out.println(num1+"칸전진"); 
			break;
		
		default:
			System.out.println("다시입력하세요.");
		}
		
		System.out.println("---------------");
		
		switch(num1) {
		case 1: case 2: case 3:
			System.out.println(num1+ "칸전진");
			break;
			default:
				System.out.println("다시 입력하세요");
		}
		
		//3,4,5 = 봄 / 6,7,8 = 여름 / 9,10,11 = 가을 / 12,1,2 =  겨울
		// 잘못된 월입니다
		
		int month = 5;
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
			default:
				System.out.println("잘못된 월입니다");
		}
		

	}

}
