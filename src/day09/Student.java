package day09;

public class Student {
	/* 학생정보를 관리하기 위한 클래스 생성(Student)
	 * - 학생 기본정보: 이름, 생년월일, 전화번호, 나이
	 * - 학원 정보: 학원명 "KOREAIT"(final), 지점
	 * - 수강 정보: 수강과목, 기간 
	 *   -> 여러과목을 들을 수 있음[5], 배열로 처리 5과목까지만 가능\
	 *   
	 *   1.맴버변수 선언 2. 생성자 3.getter/ setter 4.매서드 생성
	 */
	
	 //맴버변수 선언
	private String name; 
	private String phone;	
	private String birth;	
	private int age;
	private final String KOREAIT = "KOREAIT";
	private String branch;	
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //수강기간
	private int cnt;
	
	//생성자
	public Student() {}
	public Student(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	//생성자 오버로딩
	public Student(String name, String birth, String phone, int age, String branch) {
		//생성자 호출: 매서드의 첫 라인에서만 호출 가능
		this(name,phone, branch);
		this.age = age;
		this.birth = birth;
	}
	//method
	 //학생의 기본정보를 출력하는 매서드
	public void printInfo() {
		System.out.println("--학생정보--");
		System.out.println("이름: "+ name+"("+age+"/"+birth+")"+phone);
		
	}
	 //학생의 수강정보를 출력하는 매서드
	public void printCmpany() {
		System.out.println("--수강정보--");
		System.out.println(KOREAIT+"("+branch+")");
		
	}
	 //학생의 수강정보를 출력하는 매서드
	public void printCourse() {
		if(cnt == 0) {//등록한 과목이 없음
			System.out.println("수강과목이 없습니다");
			return;
		}
		//cnt까지만 출력=> 중복되지 않은 빈값은 출력X
		for(int i=0; i<cnt; i++) {
			System.out.println(course[i]+ "("+ period[i]+")");
		}
	}
	 //학생의 수강정보를 추가하는 매서드
	//매개변수: 수강과목, 기간=> 배열에 추가 /리턴타입X
	public void insertCourse(String coures,String period) {
		//cnt =0-> 아직 추가된 값이 없음
		if(cnt >=5) {
			//더이상 담을 공간이 없음-> 배열을 복사 다시 생성
			//System.out.println("더 이상 수강하실 수 없습니다");
			//return;
			String courseTmp[] = new String[this.course.length+5];
			String periodTmp[] = new String[this.period.length+5];
			//arraycopy
			System.arraycopy(this.course, 0, courseTmp, 0, this.course.length);
			System.arraycopy(this.period, 0, periodTmp, 0, this.period.length);
			//기존 배열의 참조변수와 객체를 바꿔치기
			this.course = courseTmp;
			this.period = periodTmp;
		}
		this.course[cnt] = coures;
		this.period[cnt] = period;
		cnt++;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getcourse() {
		return course;
	}
	public void setcourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getKOREAIT() {
		return KOREAIT;
	}
}
