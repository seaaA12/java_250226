package day15;

import java.util.ArrayList;
import java.util.Comparator;

public class Steam03 {

	public static void main(String[] args) {
		// Student class List 생성
		ArrayList<Student>list = new ArrayList<>();
		list.add(new Student("홍길동", 58));
		list.add(new Student("김순이", 89));
		list.add(new Student("이영이", 78));
		list.add(new Student("박순철", 51));
		list.add(new Student("이철이", 59));
		list.add(new Student("홍순이", 78));
		list.add(new Student("박길동", 98));
		list.add(new Student("최수지", 84));
	
		//스트림을 이용하여 출력
		//toString 사용
		list.stream().forEach(n-> System.out.println(n));
		
		System.out.println("-----------");
		
		//toString 미사용
		list.stream()
			.forEach(l->{
				String name = l.getName();
				int score = l.getScore();
				System.out.println(name+":"+score);
			});
		
		System.out.println("-----------");
		
		//list의 점수의 합계
		int sum = list.stream().mapToInt(i-> i.getScore()).sum();
		System.out.println("합계: "+sum);
		
		//list의 인원수
		long count = list.stream().count();
		System.out.println("인원수: "+count);
		
		System.out.println("-----------");
		
		//정렬: 이름을 가나다라 순으로 정렬(오름차순)
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(n->System.out.println(n));
		
		System.out.println("-----------");
		
		//정렬: 높은 점수 순으로 정렬(오름차순)
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getScore() - o1.getScore();
			}
			
		}).forEach(n->System.out.println(n));
		
		System.out.println("-----Comparable-----");
		
		//Comparable<Student> 클래스에서 구현한 정렬
		list.stream().sorted().forEach(n-> System.out.println(n));
		
		
		
		
		
		
		
	}

}
