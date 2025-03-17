package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List03 {

	public static void main(String[] args) {
		/* 오늘 하루 일과를 짱하는 list 생성
		 * 출력=> 향상된 for/ iterator
		 */

		ArrayList<String>list = new ArrayList<String>();
		
		list.add("기상");
		list.add("출발");
		list.add("수업");
		list.add("점심시간");
		list.add("수업");
		list.add("저녁");
		list.add("알바");
		list.add("취침");
		
		//향상된 for
		for(String s : list) {
			System.out.println(s);
		}
		
		
		//iterator
		System.out.println("-----------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		//정렬
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo
				//o1.compareTo(o2): 오름차순
				//o2.compareTo(o1): 내림차순
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
		
	}

}
