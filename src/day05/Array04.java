package day05;

import java.text.DecimalFormat;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성
		 * 1~50까지의 랜덤 수 저장
		 * 합계, 평균, 최대, 최소
		 */
		DecimalFormat df = new DecimalFormat("#.##");

		int arr[] = new int[10];	
		int sum = 0;
		int max = 0;
		int min = 1000;
		
		for(int i=0; i<arr.length; i++) {				
			arr[i]=(int)(Math.random()*50)+1;
			sum += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);

		}
		float avg = sum/(float)arr.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + df.format(avg));
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

}
