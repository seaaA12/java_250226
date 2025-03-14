package day06;

public class MultiArray01 {

	public static void main(String[] args) {
		/* 다차원 배열 - 2차원 배열
		 * 배열먕[] - 1차원 배열 {1,2,3}
		 * 배열명[][] - 2차원 배열{{1,2,3},{1,2,3}}
		 * 배열명[][][]- 3차원 배열{ { {1,2,3},{1,2,3} },{ {1,2,3,}{,1,2,3} } } 
		 * 
		 * {{1,2,3},{1,2,3}}
		 * int arr[][] = new int[2][3];
		 * 1 2 3
		 * 1 2 3
		 * 
		 * 배열의 길이
		 * 1차원 배열 = arr.length for1개
		 * 2차원 배열 = arr[i].length for2개
		 * 3차원 배열 = arr[i][j].length for3개
		 */
		
		int arr [][] = {
				{1,2,3},
				{1,2,3}
		};
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i+10;
//				System.out.println(arr[0][0]); //2차원 배열의 값 넣기
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][1]);

		
	}

}
