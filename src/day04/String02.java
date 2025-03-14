package day04;

public class String02 {

	public static void main(String[] args) {
		//String 매서드
		
		String str= "홍길동";
		String str2= "";
		
		//tolLowerCase(), ToUpperCase(): 대소문자 변환
		System.out.println("--tolLowerCase(), ToUpperCase()--");
		System.out.println("tolower".toLowerCase()); //소문자로 변환
		System.out.println("tolower".toUpperCase());//대문자로 변환
		
		//isEmpty(): 값이 비었는지 확인
		System.out.println("--isEmpty()--");
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		
		//trim():불필요한 공백제거
		System.out.println("--trim--");
		System.out.println("    hello    ");
		System.out.println("    hello    ".trim());
		
		//replace(): 글자를 치환(변환)
		System.out.println("--realace()--");
		String str3 = "apple,banana,kiwi";//apple/ banana/ kiwi
		System.out.println(str3.replaceAll(",", "/"));
		
		//split(): 특정값 기준으로 나누기 -> 배열로 리턴
		System.out.println("--split()--");
		String[] arr = str3.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//문자를 숫자로 Integer.parseInt()
		String num1 = "1";
		int num2 = Integer.parseInt(num1);
		
		//숫자를 문자로 String.valueOf()
		String as = String.valueOf(num2);
		
		System.out.println(as);
		System.out.println(as instanceof String);
		
	
	}

}
