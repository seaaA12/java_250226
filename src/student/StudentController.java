package student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController{

	private ArrayList<Student>list = new ArrayList<>();
	private ArrayList<Subject>subList = new ArrayList<>();
	private int cnt;
	
	public int menuPrint(Scanner scan) {
		System.out.println("--menu--");
		System.out.println("1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보)| 4.학생 정보수정");
		System.out.println("5.학생삭제| 6.수강신청 | 7.수강철회 | 8.과목별 신청자리스트");
		System.out.println("9.학생별 성적등록(교수님전용)| 10.학생별 성적표 출력|11. 종료");
		System.out.println("메뉴선택 >");
		return scan.nextInt();
	}
	public void addStudent() {
		list.add(new Student("1", "김순이", "20", "010-1111-1111", "서울 강남구"));
		list.add(new Student("2", "박철수", "20", "010-1111-2222", "수원 영통구"));
		list.add(new Student("3", "황순이", "20", "010-1111-3333", "서울 강서구"));
	}
	
	public void addSubList() {
		subList.add(new Subject("1", "java", 3, 2, "홍길동", "화목/2시~4시", "1강의장"));
		subList.add(new Subject("2", "DB", 3, 2, "이순신", "월수/2시~4시", "2강의장"));
		subList.add(new Subject("3", "HTML", 2, 3, "김영이", "화금/2시~4시", "3강의장"));
		subList.add(new Subject("4", "CSS", 2, 3, "황기동", "월목/2시~4시", "4강의장"));
		subList.add(new Subject("5", "javascript", 3, 3, "박순철", "수목/2시~4시", "5강의장"));
	}
	public void insert(Scanner scan) {
		System.out.println("학번>");
		String num = scan.next();
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("나이>");
		String age = scan.next();
		System.out.println("전화번호>");
		String phone = scan.next();
		scan.nextLine(); 
		System.out.println("주소>");
		String address = scan.nextLine();
		
		Student s = new Student(num, name, age, phone, address);
		list.add(s);
		cnt++;
		System.out.println("등록완료");
	}

	public void printList() {
		System.out.println("--학생명단--");
		for(Student list : list) {
			System.out.println(list);
		}
	}
	
	public void subjectList() {
		System.out.println("--수강 과목 목록--");
		for(Subject s : subList) {
			System.out.println(s);
		}
		System.out.println("----------------");
	}

	public void search(Scanner scan) {
		System.out.println("검색할 학번>");
		String searchNum = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getStdNum().equals(searchNum)) {
				System.out.println(list.get(i));
				return;
			}
		}
		System.out.println("검색한 학생이 없습니다.");
	}

	public void update(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Scanner scan) {
		System.out.println("삭제할 학생 학번>");
		String stdNum = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getStdNum().equals(stdNum)) {
				list.remove(i);
				break;
			}
		}
		System.out.println("삭제되었습니다");
	}

	public void insertSub(Scanner scan) {
		System.out.println("수강신청 학번>");
		String stdNum = scan.next();
		int index = -1;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getStdNum().equals(stdNum)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		subjectList();
		System.out.println("선택과목 번호>");
		String subNum = scan.next();
		int subIndex = -1;
		
		for(int i=0; i<subList.size(); i++) {	
			if(subList.get(i).getSubNum().equals(subNum)) {
				subIndex = i; 
				break;
			}
		}
		if(subIndex == -1) {
			System.out.println("과목정보가 없습니다.");
			return;
		}
		System.out.println("수강신청 완료");
		
		
	}

	public void deleteSub(Scanner scan) {
		System.out.println("수강취소 학번>");
		String stdNum = scan.next();
		int index = -1;
	
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getStdNum().equals(stdNum)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		System.out.println(list);
		
		System.out.println("수강삭제 번호>");
		String subNum = scan.next();
		
		list.remove(index);
	}

	public void score() {
		// TODO Auto-generated method stub
		
	}
	public void scoreInfo() {
		// TODO Auto-generated method stub
		
	}

}
