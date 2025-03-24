package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private Map<String, List<String>> map = new HashMap<>();
	
	
	public void addPrint() {
		map.put("class", Arrays.asList("종류","학급(반)","계급의"));
		map.put("word", Arrays.asList("낱말","가사","대사"));
		map.put("update", Arrays.asList("더하다","합치다","첨가하다"));
		map.put("air", Arrays.asList("공기","외양","외모"));
		map.put("list", Arrays.asList("명부","알림표","목록"));
		
	}
	public void add(Scanner scan) {
		System.out.println("등록할 단어 입력 >");
		String word = scan.next();
		
		String end = "a";
		
		while(! end.equals("y")){
			System.out.println("단어 뜻 입력 >");
			String meaning = scan.next();
			System.out.println("종료(y) > ");
			end = scan.next();
		}	
		System.out.println("단어 추가 완료");
		
	}

	public void search(Scanner scan) {
		System.out.println("검색할 단어 입력>");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("=============검색결과=============");
			System.out.println(word+":"+ map.get(word));
			return;
		}
		System.out.println("검색 결과가 없습니다");
		
	}

	public void update(Scanner scan) {
		System.out.println("수정할 단어>");
		String word = scan.next();
		if(map.remove(word) == null) {
			System.out.println("수정할 단어가 없습니다");
			return;
		}
		System.out.println("뜻>");
		String meaning = scan.next();
		map.put(word, Arrays.asList(meaning));
	}

	public void print() {
		int cnt =0;
		System.out.println("-------------단어장--------------");
		for(String key : map.keySet()) {
			cnt++;
			System.out.println(cnt+"."+key+":"+map.get(key));
		}	
	}

	public void delete(Scanner scan) {
		System.out.println("삭제할 단어 입력>");
		String name= scan.next();
		if(map.remove(name) == null) {
			System.out.println("삭제할 단어가 없습니다");
			return;
		}
		map.remove(name);
		System.out.println("단어 삭제 완료");
	}

	public void txtPrint(Scanner scan) throws IOException {
		/*StringBuffer 객체를 사용
		 * .append: 기존 String 객체에 데이터를 추가
		 */
		FileWriter fw = new FileWriter("D:\\web_0226_sea\\java_workspace\\java_250226\\src\\word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		
		String data = null;
		sb.append("---단어장\r\n");
		
		for(String key : map.keySet()) {
			sb.append(key+":"+map.get(key));
			sb.append("\r\n");
		}
		
		/*객체를 저장할 떄는 String 객체로만 저장이 가능
		 * StringBuffer 객체는 저장이 안됨
		 * StringBuffer -> String 으로 변환
		 */
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fw.close();
	}


}
