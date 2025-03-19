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
		System.out.println("등록할 단어 입력 >");
		String name = scan.next();
		System.out.println("단어 뜻 입력 >");
		String mean = scan.next();
	
		map.put(name, mean);
		System.out.println("단어 추가 완료");		
	}

	public void search(Scanner scan) {
		System.out.println("검색 단어 >");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("--검색결과--");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다");
		
	}

	public void update(Scanner scan) {
		//set이 없음-> 삭제 후 추가
		System.out.println("수정할 단어 >");
		String word = scan.next();
		//삭제 값이 없으면 = null / 삭제 값이 있으면 value return
		if(map.remove(word) == null) {
			System.out.println("수정할 단어가 없습니다");
			return;
		}
		System.out.println("뜻 > ");
		String mean = scan.next();
		map.put(word, mean);
		System.out.println("단어 수정 완료");
	}

	public void print() {
		int cnt =0;
		System.out.println("--------------단어장--------------");
		for(String key : map.keySet()) {
			cnt ++;
			System.out.println(cnt+ "."+key+ ":"+map.get(key));
		}	
	}
	
	public void delete(Scanner scan) {
		System.out.println("삭제할 단어 입력 >");
		String name = scan.next();
		map.remove(name);
		if(map.remove(name) == null) {
			System.out.println("삭제할 단어가 없습니다");
			return;
		}
		System.out.println("단어 삭제 완료");
	}

}
