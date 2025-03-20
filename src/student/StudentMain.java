package student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentController sc = new StudentController();
		
		int menu = 0;
		sc.addSubList();
		sc.addStudent();

		do {
			menu = sc.menuPrint(scan);
			
			switch(menu) {
			case 1: sc.insert(scan); break;
			case 2: sc.printList(); break;
			case 3: sc.search(scan); break;
			case 4: sc.update(scan); break;
			case 5: sc.delete(scan); break;
			case 6: sc.insertSub(scan); break;
			case 7: sc.deleteSub(scan); break;
			case 8: sc.subjectList(); break;
			case 9: sc.scoreInfo(); break;
			case 10: sc.score(); break;
			case 11:
				System.out.println("종료");
				break;
				default :
					System.out.println("잘못된 메뉴");
			}
			
		}while(menu !=11);
		
		scan.close();
	}

}
