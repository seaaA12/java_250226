package day09;

public class Method08 {

	public static void main(String[] args) {
		/* 가변인자 매ㅓ드
		 * -매개변수의 개수가 고정되어 잇지 않은 경우 사용
		 */
		Method08 m8 = new Method08();
		System.out.println(m8.sum(1,2,3,4,5,6));
		System.out.println(m8.sum(1,2,3,4,5,6,7,8,5));
	}

	public int sum(int ...num) {
		//num은 배열로 인식
		int result =0;
		for(int tmp : num) {
			result += tmp;
		}
		return result;
	}
}
