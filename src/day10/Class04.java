package day10;

public class Class04 {

	public static void main(String[] args) {
		/*객체를 생성시 값을 초기하ㅘ 하는 방법
		 * 키본값, 명지적 초기압, 초기화 블럭, 생성자
		 * 
		 * 1.기본값: 멤버변수 선언시 기본적으롲 주는 값 int=0 String = null
		 * 2.명지적 초기화: 기본값을 직접 명시하여 주는값
		 * 3.초기화 블럭: {초기화 지정} 맴버변수 초기화
		 * 4. 생성자: 객체를 생성하할때 초기화해서 생성
		 * 
		 * 초기값 우선순위
		 * 기본값-> 명시적 초기값-> 초기화 블럭-> 생성자(우선순위가 가장 높음)
		 */

		Student s = new Student();
		System.out.println(s);
	}

}
class Student{
	private String gigum= "강남"; //명시적 초기값
	private String name; //기본값 null
	private String phone; //명시적 초기값
	
	{gigum= "수원";
	name = "cho";
	phone= "1111";
	}
	public Student() {}
	public Student(String gigum, String name, String phone) {
		
	}
	

	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", phone=" + phone + "]";
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
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

}
