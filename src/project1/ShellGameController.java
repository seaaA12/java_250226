// 야바위 게임 
/*
 * # 기능 
 *  → 게임시작, 컵 돌리기, 플레이어 컵 선택, 결과 출력, 점수, 하트 상태 출력
 *		반복 (Main 에서 do-while문으로 처리), 승 패 결과 출력
 * 
 * */
package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShellGameController{
	// 멤버 변수 초기화
	// 플레이어 생성, 사용자
	ShellGamePlayer p1 = new ShellGamePlayer(0,10000);
	
	
	// Scanner 설정
	Scanner sc = new Scanner(System.in);
	
	// 기본 생성자 
	public ShellGameController() {};
	
	
	//메서드
	// menuPrint() - 메뉴 출력
	public void menuPrint() {
		System.out.println("야바위꾼이 컵을 섞는중입니다");
//		System.out.println("\r\n"
//				+ "⡑⡑⢕⢱⢑⢕⢕⢕⢍⢎⢇⢇⢏⢽⡹⡱⡱⡑⠕⢅⠕⡅⢅⠑⠌⢌⠱⠱⡑⡕⢕⢍⢎⢕⢽⠸⡸⡱⡱⡑⢕⢑⢕⠱⡱⡱⡍⡯⣏⠪⡨⡨⠨⡪⡪⡣⣫⢯⡣⡑\r\n"
//				+ "⢱⡘⡜⣔⢕⣌⢆⣇⣇⢇⣇⢇⢇⢵⡹⡵⡱⡑⡕⡕⢕⢌⠢⡑⡑⡐⢌⠢⡑⢌⠊⠆⢕⢕⢇⠣⡣⡣⡪⡪⡪⢢⢣⠱⡘⡜⣞⡯⡇⢕⠰⡱⡑⡵⣹⢸⣪⡳⡽⡽\r\n"
//				+ "⣿⢽⡿⣽⣽⣞⣿⣺⣾⣻⣾⣳⡕⡵⣝⣞⠵⡕⡜⡜⡌⡆⡣⡪⡨⡊⡢⡑⢌⠢⡡⡑⡑⢔⠅⢕⢑⢌⢢⠱⡱⡑⡆⡣⡣⣝⣗⢿⡑⡅⢕⢌⠪⡪⣪⢺⣜⢞⢘⠜\r\n"
//				+ "⣿⢯⣿⡽⣾⣗⣿⣺⢷⡿⣾⢯⡯⣿⢹⢘⢜⢜⡵⣝⢮⡺⡸⡨⡪⡘⡔⡅⡣⡱⡨⡪⡪⡢⡑⡑⢔⢑⢔⠱⡨⡊⢎⠪⡪⡺⡺⣻⢨⢊⢆⢕⢕⣽⡮⣗⣗⢇⠢⠡\r\n"
//				+ "⣿⣯⣷⣿⣻⡾⡷⣟⣯⣿⣻⣽⢿⣽⣳⡳⣕⢽⢝⢮⡳⣹⡪⣇⢧⡣⣣⢪⢪⢪⢪⢪⢪⢪⢪⡘⢔⢑⢔⢑⢌⠪⡂⡣⡊⡢⡑⢌⠢⢅⠕⢝⢝⢼⡽⣗⢿⢐⠅⢕\r\n"
//				+ "⣷⣿⢾⣯⣷⡿⣟⣯⣿⢾⣯⣿⣻⡾⣯⣯⣞⣵⢿⡽⣟⡷⣝⡮⣳⢝⠮⡳⢝⢮⣗⣽⣪⢯⣳⢸⢐⢕⢐⠕⢔⢑⢌⢂⢊⠢⡊⡢⡑⡑⢕⢅⢣⢫⡯⣯⡏⡢⡑⢅\r\n"
//				+ "⣿⣽⣟⣷⢿⣽⢿⣯⢿⣻⡾⣷⣟⡿⣽⣞⢷⣻⢽⣫⢯⠻⠪⠩⡨⢪⢘⢌⢆⢣⢣⡳⡽⣵⡫⣗⢕⢕⢅⠣⡑⢕⢔⢅⠥⡑⡘⡔⡌⢌⢢⠱⡨⢪⢫⢗⠇⢕⢌⠢\r\n"
//				+ "⡇⡣⡣⡣⡣⡱⡑⡌⢎⢆⣣⣣⢪⡪⡢⡪⡊⠆⢕⠐⠅⠅⢕⠱⡨⡪⡪⡢⡣⡣⡣⡫⡯⣺⡺⣝⣵⣳⡱⡑⢌⠢⢱⢱⢱⠨⡢⢪⢪⢢⢱⢑⠱⡡⡣⡱⢡⢑⠔⠅\r\n"
//				+ "⡣⣕⢜⡬⣪⣪⣪⠮⡚⡚⡪⡊⡪⡈⡢⡂⡪⠨⡢⢡⢑⢅⠣⡣⡣⣪⡪⡪⡪⣪⢪⡺⣪⢗⣽⣳⣻⡺⡝⡎⢆⠅⢕⢝⢮⢪⢊⠆⢕⢵⡡⠣⡑⠕⡜⡸⡐⡅⡣⡑\r\n"
//				+ "⢻⡫⡏⡏⡓⠅⢕⢑⢐⢌⢎⢎⠢⡑⡢⣕⢜⡌⡎⢆⢣⠪⡪⡪⡺⡪⣪⢳⡹⣜⢵⢝⡮⣫⢾⣺⡪⡮⣪⢪⢪⢊⢎⢪⠪⡪⡢⡡⢡⢱⡹⡌⡌⢌⢪⠢⡱⡨⢢⠱\r\n"
//				+ "⠣⡪⡪⡨⡨⡊⡂⡢⡢⣱⠑⠄⢕⢜⢜⣮⢗⠣⡑⡕⡕⣕⢵⠝⡊⢊⠈⡁⠡⢈⠈⠑⠩⢪⢣⢣⡫⢯⡺⣕⢧⢑⢌⢪⢪⢪⢎⢌⢢⠱⡱⡕⡜⢔⢕⢕⢜⢜⢔⠱\r\n"
//				+ "⡣⡱⡨⡪⡪⢢⠪⡢⡣⡣⡡⡣⡱⣱⡫⡇⡣⡣⡣⣣⡳⣕⡇⠅⢐⠀⡂⢐⠈⠄⠨⠀⢅⠢⡣⡣⡹⣪⢺⢕⡗⡕⡌⢆⠣⡑⢹⢸⢐⢕⢕⢽⢸⢘⢔⢕⢅⢇⢇⢕\r\n"
//				+ "⢎⠪⡢⡣⡣⡣⡣⡳⡱⡑⡜⣜⢼⢺⢸⢰⢱⡱⣝⢮⣫⢾⢕⠅⡂⢂⢐⢀⠂⠅⠌⠌⠢⡑⢌⠪⡪⡪⡪⡳⣹⢪⢪⠢⡑⠄⠅⡇⡇⡕⢕⠅⡇⡇⡕⡱⡱⡡⡱⡡\r\n"
//				+ "⡣⡣⡣⡫⡪⡪⡪⡝⡌⢎⢎⡎⡕⡕⣕⢕⢧⣳⢵⣳⢵⢯⢇⢂⠂⡂⡐⠠⠨⠠⠡⠡⡑⠌⡆⡕⡌⡎⣎⢮⡪⡧⣇⢇⢎⠌⢌⢪⢪⢪⢘⢔⠹⡜⣌⢆⠇⠕⠅⠅\r\n"
//				+ "⡱⡘⡌⡎⡪⡪⣪⢪⢸⢸⡸⡜⡜⡜⡔⡕⡝⣾⣻⣺⢽⢕⢇⢂⠂⡂⠄⠅⠌⡂⠅⠅⠌⢌⢪⢪⢪⢪⢪⠮⡮⣳⡳⡱⠡⡑⡐⡘⡜⡜⡜⠄⡱⡹⡘⠔⠅⠅⢅⠑\r\n"
//				+ "⡇⡣⡣⡪⢐⢈⠢⠣⢑⠕⡕⢕⠌⢌⠪⡘⢌⢗⣯⡺⡕⣝⢔⢐⢐⠠⠡⠨⢐⠠⠡⠡⠡⠡⡱⡱⡱⡱⡱⣙⢮⢺⠸⡈⡂⡂⡂⡂⠅⡑⠨⡐⡐⠌⢌⠪⡨⠨⡂⠅\r\n"
//				+ "⢣⢱⢸⢸⢐⢐⠨⠨⠠⢁⠪⢐⠑⢄⠑⢌⢂⢇⢣⢇⢇⢇⠕⡐⢐⠨⠠⢁⠂⠌⠌⠌⠌⠌⢜⢌⢎⢎⢪⠢⡣⡃⡣⡂⡂⡂⡂⡂⠅⡂⠅⡂⠢⡑⡐⡑⢌⠢⠨⠢\r\n"
//				+ "⡇⡇⡇⡇⠆⡂⠌⡂⠅⡂⠌⡐⠨⠠⡑⡐⡐⢄⢇⢣⠣⡑⡈⡂⠅⠌⠌⡐⠨⠨⠨⠨⠨⠨⠢⢸⠨⡪⡢⡣⡱⣑⢐⢐⢐⢐⢐⠠⢑⠠⢑⢈⢂⠢⠨⡊⡆⢅⠕⠅\r\n"
//				+ "⡇⡇⡇⡇⢅⠂⠅⡂⠅⡂⠅⠌⠌⢂⢂⠔⡜⢌⢎⢆⠇⡕⢄⠂⠅⠌⡂⡂⠅⡡⠡⠡⠡⢡⢱⠱⡑⢕⢜⢌⢪⢂⢇⢆⡐⡐⢐⠨⢐⠨⢐⠐⠄⠅⠕⡰⡱⡑⡅⢅\r\n"
//				+ "⡎⡎⡎⡎⡎⡆⢥⢠⠡⡄⡅⢆⢕⠱⡑⡕⡜⡜⡌⢆⢣⢪⠨⡊⡢⡢⡐⢄⢅⠤⡑⡌⢎⠢⡣⡣⡣⡑⢕⢕⢅⢇⢪⢢⠪⡪⡢⢢⠢⡨⡐⡌⡌⡌⢎⢪⠪⡪⡪⡂\r\n"
//				+ "⢕⢕⢕⢕⢕⢕⢕⢕⢕⢌⢎⢪⢨⠪⡪⡪⡪⡪⡪⡪⡢⡱⡑⢌⢆⠪⡘⢔⢅⠣⡑⢜⢌⡪⢪⠪⡪⡊⢆⢕⢅⢣⠱⡘⡜⢔⢕⢅⠣⡊⢆⢕⠌⡎⡪⡢⡣⡣⡪⡪\r\n"
//				+ "⢕⢕⡕⡕⡕⡕⡕⡕⢕⢕⢕⢱⠱⡑⡕⡕⡕⡜⡌⡎⡪⡢⡣⡑⢅⢣⠱⡑⡌⢎⠜⡔⡕⡕⢕⢕⢕⢜⠔⡕⡱⡑⢕⠕⡜⡜⡔⡕⡕⢕⢕⢌⢪⢊⢎⢪⠪⡪⡪⡪\r\n"
//				+ "⡳⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡱⡑⡕⢕⢌⠪⡨⡢⡣⡣⡱⡑⡕⢜⢜⠜⡜⡌⡆⡣⡣⡱⡑⡕⡱⡑⢕⢜⢜⢜⢜⢜⢔⢕⠱⡑⡕⢕⢕⢕⢕⢕\r\n"
//				+ "");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		System.out.println("세개의 컵 중 구슬이 들어있는 컵을 선택해주세요");
		
	}
	// shuffle() - 컵 섞고 결과를 리턴
	   public int[] shuffle() {
	      int[] tmpArr = new int[3]; 
	      int i = 0;
	      
	      // 섞기 
	      do{
	         int tmpNo = (int)(Math.random()*3) + 1;
	         
	         for(int tmp : tmpArr) {
	            if(tmp != tmpNo) { tmpArr[i] = tmpNo; i++;} 
	            
	            else { continue; }
	         }
	      }while(i < 3);
	      
	      return tmpArr;
	   }
	   
	   // compareResult() - 결과 비교 
	   public void compareResult(int[] arr) {
		  int bettingMoney = 0;
		   
	      System.out.println("3개 중 무엇을 고르시겠습니까?");
	      System.out.println("왼쪽 : 0, 가운데 : 1, 오른쪽 : 2");
	      System.out.print("입력 : ");
	      int n = sc.nextInt();
	      
	      System.out.println("현재 소지금 : " + p1.getMoney()+ "/ 현재 점수 : " + p1.getScore());
	      System.out.print("배팅금액 : ");
	      bettingMoney = sc.nextInt();
	      System.out.println();
	      
	      if(arr[n] == 1) {
	    	  System.out.println("정답!");  p1.answer(bettingMoney);
	    	  System.out.println("현재 소지금 : " + p1.getMoney()+ "/ 현재 점수 : " + p1.getScore());
	      }
	      if(arr[n] == 2) { 
	    	  System.out.println("꽝");  p1.boom(bettingMoney);
	    	  System.out.println("현재 소지금 : " + p1.getMoney()+ "/ 현재 점수 : " + p1.getScore());
	      }
	      if(arr[n] == 3) {
	    	  System.out.println("폭탄");  p1.bomb(bettingMoney);
	    	  System.out.println("현재 소지금 : " + p1.getMoney()+ "/ 현재 점수 : " + p1.getScore());
	      }
	   }    
	   
	public char resume() {
		char c;
		
		System.out.println("다시 배팅 하시겠습니까? (Y/N)");
		System.out.print("입력 (Y/N) : ");
		
		c = Character.toUpperCase(sc.next().charAt(0));
		
		return c;
	}
}
