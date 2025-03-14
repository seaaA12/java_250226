package day09;

public class Exam02 {

	public static void main(String[] args) {
		/* 학생정보를 관리하기 위한 클래스 생성(Student)
		 * - 학생 기본정보: 이름, 생년월일, 전화번호, 나이
		 * - 학원 정보: 학원명 "KOREAIT"(final), 지점
		 * - 수강 정보: 수강과목, 기간 
		 *   -> 여러과목을 들을 수 있음[5], 배열로 처리 5과목까지만 가능
		 * 
		 * ex) 홍길동 010101 010-1234-5678 (25)
		 *     KOREAIT(강남)
		 *     공공데이터 국비(25-02-26~ 25-08-01)
		 *     java(25-01-05~ 25-01-30)
		 *     
		 * 매서드
		 * -학생의 기본정보를 출력하는 매서드
		 * -학생의 수강정보를 출력하는 매서드
		 * -학생의 수강정보를 추가하는 매서드
		 */
		
		//Student 클래스 객체를 생성 -> 츨력
		Student st = new Student("hong", "010-1234-5678","강남");
	/*	st.printCmpany();
		st.printInfo();
		*/
		st.setAge(23);
		st.setBirth("030303");
		st.insertCourse("java", "25-01-05~ 25-01-30");
		st.insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		//st.printCourse();
		
		Student st1 = new Student("kim","010101","010-2222-3333", 21, "강남");
		st1.insertCourse("java", "25-01-05~ 25-01-30");
		st1.insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		
	/*	st1.printInfo();
		st1.printCmpany();
		st1.printCourse();
		*/
		Student[] studentArr = new Student[8];
		studentArr[0] = st;
		studentArr[1] = st1;
		
		studentArr[2] = new Student("lee", "970101","010-3333-4444", 31,"수원");
		studentArr[2].insertCourse("java", "25-01-05~ 25-01-30");
		studentArr[2].insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		studentArr[2].insertCourse("DB", "25-02-26~ 25-08-01");
		
		studentArr[3] = new Student("cho", "960406","010-5555-7777", 30,"강남");
		studentArr[3].insertCourse("java", "25-01-05~ 25-01-30");
		studentArr[3].insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		studentArr[3].insertCourse("DB", "25-02-26~ 25-08-01");
		
		studentArr[4] = new Student("pack", "040102","010-3333-6666", 22,"수원");
		studentArr[4].insertCourse("java", "25-01-05~ 25-01-30");
		studentArr[4].insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		studentArr[4].insertCourse("DB", "25-02-26~ 25-08-01");
		
		studentArr[5] = new Student("chol", "980504","010-2222-4444", 28,"강남");
		studentArr[5].insertCourse("java", "25-01-05~ 25-01-30");
		studentArr[5].insertCourse("공공데이터 국비", "25-02-26~ 25-08-01");
		studentArr[5].insertCourse("DB", "25-02-26~ 25-08-01");
		
		studentArr[6] = new Student("kang", "050808","010-8888-9999", 21,"강남");
		studentArr[7] = new Student("hong", "9450505", "010-7575-4444", 34,"수원");
		
		System.out.println("----------------");
		String searchname = "hong";
		
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getName().equals(searchname)) {
				studentArr[i].printInfo();
				studentArr[i].printCmpany();
				studentArr[i].printCourse();
				}
			}
		System.out.println("----------------");
		String searchCourse = "java"; // 학생정보 회사정보만 확인
		System.out.println("--"+searchCourse+"의 수강학생 목록--");
		
		int cnt = 0;
		while(cnt<studentArr.length) {
			for(int i=0; i<studentArr[cnt].getCnt(); i++) {
				if(studentArr[cnt].getcourse()[i].equals(searchCourse)) {
					studentArr[cnt].printInfo();
					studentArr[cnt].printCmpany();
				}
			}
			cnt++;
		}
		System.out.println("----------------");
		String searchBranch = "강남"; // 학생정보 회사정보만 확인
		System.out.println("--"+searchBranch+"의 수강학생 목록--");
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getBranch() != null) {
				if(studentArr[i].getBranch().equals(searchBranch)) {
					studentArr[i].printInfo();
				}
			}
		}
		
	}

}
