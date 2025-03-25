package project1;

public class ShellGamePlayer {
	// 멤버 변수 초기화
	private int score;
	private int money;
	
	// 기본 생성자 
	public ShellGamePlayer(int score,int money) {
		this.score = score;
		this.money = money;
	}
	
	// 메서드 
	// 정답: 배팅머니 얻고 +10 점수 1점
	public void answer(int bettingMoney) {
		this.money += bettingMoney +100;
		this.score+= 1;
	}
	
	// 꽝: 배팅 머니 잃음
	public void boom(int bettingMoney) {
		System.out.println(bettingMoney);
		this.money -= bettingMoney;
	} 
	
	// 폭탄: 돈 잃고 점수 1감소
	public void bomb(int bettingMoney) {
		if(score <= 0) { 
			this.money -= 100;
			System.out.println("감소할 점수가 없습니다 !");
			System.out.println("소지금 -100 차감합니다");
		}else if(score > 0) { 
			this.money -= bettingMoney;
			this.score -= 1;
			
		}
	}
	
	// toString()
	@Override
	public String toString() {
		return "ShellGamePlayer [score=" + score + ", money=" + money + "]";
	}
	
	// Getter(), Setter() 
	public ShellGamePlayer() {}


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
