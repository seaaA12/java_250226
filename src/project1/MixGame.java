package project1;

import java.util.Scanner;

public class MixGame {
	public static void main(String[] args) {
        //1: 정답, 2:꽝, 3:폭탄
        int[] answer = new int[3];

        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Player[] players = {p1, p2};

        //게임 시작
        while (p1.getHeart() > 0 || p2.getHeart() > 0) {
            //탈출 조건 추가 ( score = 3일 떄 )
            int score = Player.getScore();
            if (score == 3) {
                System.out.println("===== 이김 =====");
                break;
            }

            Scanner sc = new Scanner(System.in);

            for (Player player : players) {
                if(player.getHeart() ==  0) continue;

                //정답 생성
                for (int i = 0; i < 3; i++) {
                    answer[i] = (int) (Math.random() * 3 + 1);
                    for (int j = 0; j < i; j++) {
                        if (answer[i] == answer[j]) {
                            i--;
                            break;
                        }
                    }
                }

                //플레이어 입력 받기
                System.out.print("["+ player.getName()+ "]" + " 게임 시작 1,2,3 중 입력하세요 ! ");
                int guess = sc.nextInt();

                int tmp = player.getHeart();
                int  index = 0;
                for (int i = 0; i < 3; i++) {
                    if (guess == answer[i]) index = i;
                }

                //정답 체크
                if (index == 1) {
                    player.jeongdap();
                } else if (index == 2) {
                    player.kkwang();
                } else {
                   player.bomb();
                }
            }
        }
        System.out.println("============게임 오버===========");
    }
}
