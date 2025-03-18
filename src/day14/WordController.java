package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private Map<String, String> map = new HashMap<>();
	
	public void addMenu() {
		map.put("플레이리스트", "재생목록을 칭하는 단어로, 원하는 음악을 따로 담아서 재생할 수 있다.");
		map.put("와이파이", "전자기기들을 무선랜으로 연결해주는 기술로, 접속을 통해서 네트워크 연결을 가능하게 해준다.");
		map.put("가가호호", "한 집 한 집");
		map.put("사건선", "문학 작품에서 전개되는 사건의 흐름");
		map.put("타개죽", "수수, 옥수수 따위를 껍질째 타서 쑨 죽.");
	}

	public void add(Scanner scan) {
		System.out.println("등록할 단어 입력>");
		String name = scan.next();
		System.out.println("단어 뜻 입력");
		String min = scan.next();
	
		map.put(name, min);
		System.out.println("단어 추가 완료");		
	}

	public void search(Scanner scan) {
		
		
	}

	public void update(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		for(String key : map.keySet()) {
			System.out.println(key+ ":"+map.get(key));
		}	
	}
	
	public void delete(Scanner scan) {
		System.out.println("삭제할 단어 입력>");
		String name = scan.next();
		map.remove(name);
		
	}

}
