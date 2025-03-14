package day08;

public class MethodEx03 {

	public static void main(String[] args) {
		//로또번호 생성
	

		int lotto[] = new int [7];//당첨번호
		int user[] = new int[6];//사용자 로또번호
		int start =1, end =45;
		randomArray(lotto, start, end);//당첨번호 채우기
		randomArray(user, start, end); //사용자 번호
		System.out.println("--당첨번호--");
		printArray(lotto);
		System.out.println("--사용자 번호--");
		printArray(user);
		
		int rank = lottoRank(lotto, user); //등수 리턴
		if(rank ==-111) {
			System.out.println("배열오류입니다");
		}else {
			if(rank ==-1) {
				System.out.println("꽝");
			}else {
				System.out.println(rank+"등 당처");
			}
		}
		
	}
	/*랜덤 배열 채우기 1~45까지 
	 * 배열을 받아서 래덤 수를 채우는 매서드(중복 불가능)
	 * 매개변수: 배열-> int arr[]
	 * 리턴타입: void
	 * 매서드명: randomArray
	 */
	public static void randomArray(int arr[],int start, int end) {
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random(start, end);
			if(isComtain(arr, r)) {
				arr[cnt]=r;
				cnt++;
			}
		}
	}
	
	/*원하는 범위만큼 랜덤수를 추출해주는 매서드
	 * (int)(Math.random()*객수)+시작값;
	 * 1~10 50~100
	 * start ~ end
	 * 갯수 -> (end - start + 1)
	 * (int)(Math.random()*(end - start + 1))+start;
	 */
	public static int random(int start, int end) {
		return (int)(Math.random()*(end - start + 1))+start;
	}
	
	
	/* 중복 확인 매서드
	 * 배열과, 랜덤값을 입력받아 배열에 랜덤값이 존재하면 true, 없으면 false
	 * 매개변수: 배열, 랜덤값-> int arr[], int random
	 * 리턴타입: boolean
	 */
	public static boolean isComtain(int arr[], int random) {
		for(int i=0; i<arr.length; i++){
			if(arr[i]==random) {
				return true;				
			}
		}
		return false;
	}
	
	/*배열 출력 매서드
	 * user: 1 2 3 4 5 6 
	 * 당첨1 2 3 4 5 6 7 
	 * 리턴타입: void
	 * 매개변수: 배열 int arr[]
	 */
	public static void printArray(int arr[]) {
		for(int i=0; i<6; i++) {
			System.out.print(arr[i] + " ");
		}
		if(arr.length == 7) {
			System.out.println("("+arr[arr.length-1]+")");
		}
		System.out.println();
	}
	
	 /* 1~45까지 6개 번호 생성
	 * 당첨번호와 사용자번호 비교 등수 추출
	 * 6개 무두알치 :1 등
	 * 5개일치 + 보너스: 2등
	 * 5개일치 3등
	 * 4개일치 4등
	 * 3개일치 3등
	 * 나머지 꽝 
	 * 리턴타입: 일치객수 리턴 int
	 * 매개변수: 당첨번호, 사용자 번호 int lotto[] int user[]
	 */
	public static int lottoRank(int lotto[], int user[]) {
		//lotto, user 배열의 위치가 바뀌어서 돌아온다면
		if(lotto.length <= user.length) {
			return -111;
		}
		int cnt=0; //일치 갯수 카운트 보너스는 제외
		for(int i=0; i<user.length; i++) { //보너스 제외
			if(isComtain(user, lotto[i])){
				cnt++;
			}
		}
		int b = lotto[lotto.length-1]; // 보너스 번호 추출
		
		switch(cnt) {
		case 6: return 1;
		case 5: ; //보ㅓ스 번호의 일치여부 확인
			if(isComtain(user, b)) {
				return 2;
			}else {
				return 3;
			}
				
		case 4: return 4;
		case 3: return 5;
		default:
			return -1;
		}
	}
	

}
