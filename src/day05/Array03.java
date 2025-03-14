package day05;

import java.text.DecimalFormat;

public class Array03 {

	public static void main(String[] args) {
		//arr배열의 합계와 평균을 출력
		//최대값/ 최소값 출력
		int arr[] = {78,89,75,79,84,95,90};
		
		//정수의 형식을 변경
		DecimalFormat df = new DecimalFormat("#.##");
		
		int sum = 0;
		int max = 0;
		int min = 1000;
		
		for(int i=0; i<arr.length; i++) {				
			sum += arr[i];
//			max = Math.max(max, arr[i]);
//			min = Math.min(min, arr[i]);
			if(max < arr[i]) {
				max= arr[i];
			}
			if(min> arr[i]) {
				min= arr[i];
			}
		}
		float avg = sum/(float)arr.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + df.format(avg));
		System.out.println("max: " + max);
		System.out.println("min: " + min);


	}

}
