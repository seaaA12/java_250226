package project1;

public class ShellGamePlayer {
	// 멤버 변수 초기화
	int life = 5;
	int score = 0;
	
	// 기본 생성자 

	
	// toString()
	@Override
	public String toString() {
		return "ShellGamePlayer [life=" + life + ", score=" + score + "]";
	}
	
	// 메서드 
		// decreaseLife() - Player life 1 감소 
	public void decreaseLife() {
		this.life = life++;
		System.out.println("하트를 1개 감소");
	}
	
		// increaseLife() - Player life 1 증가 
	public void increaseLife() {
		this.life = life++;
		System.out.println("하트를 1개 획득");
	} 
	
		// decreaseScore() - Player Score 1 증가 
	public void decreaseScore() {
		if(score < 0) { System.out.println("감소할 점수가 없습니다 !"); } 
		
		else if(score > 0) { this.score = score--;
			System.out.println("점수 1점 감소");}
		
	}
	
		// increaseScore() - Player Score 1 증가 
	public void increaseScore() {
		this.score = score++;
		System.out.println("점수 1점 획득");
	}	
	
	// Getter(), Setter() 
	public ShellGamePlayer() {}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
