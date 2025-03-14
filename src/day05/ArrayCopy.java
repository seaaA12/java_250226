package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 배열 복사
		* 같은 배열을 2개 생성
		* 배열의 길이는 정해져있음
		* 
		*/
		
		int arr[] = new int[] {1,2,3,4};
		int arr1[] = arr;
		int arr2[] = new int[4];
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		arr[0] =10;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		
		//arr(4)-> arr2(10)으로 복사
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		
		//arraycopy
		//System.arraycopy(이전배열,시작번지,새배열,시작번지,개수);
		int arr3[] = new int[7];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		for(int tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
	}

}
