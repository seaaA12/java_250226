package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*파일명을 저장하고 있는 배열이 주어졌을 떄
		 * 검색어를 입력하면 해당 검색어를 포함하는 파일을 출력
		 * 만약 검색 결과가 없으면-> 검색결과가 없습니다. 출력
		 */

		String[] fileName = {"이것이 자바다.java","java의 정석.java"
				,"Arrat.txt","array.java","String Method.txt"
				,"Array Method.jpg","Method.png","java Method.java"};

		//System.out.println(file.contains("java"));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색어를 입력하세요: ");
		String s = scan.next();
		
		int l = 0;
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(s)) {
				System.out.println(fileName[i]);
				l++;
			}
		}
		if(l == 0) {
			System.out.println("검색결과가 없습니다.");			
		}else {
			System.out.println("-----------");
			System.out.println("검색결과 "+ l +"게");
		}
		
		/*CRUD
		 * Create(생성)
		 * Read(일기 검색)
		 * Update(수정)
		 * Delete(삭제)
		 */
		
		scan.close();
	}

}
