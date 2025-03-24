package project1;

public class Player {
	private String name;
    private int heart;

    private static int score;

    public Player(String name) {
        this.name = name;
        this.heart = 5;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getHeart() {
        return heart;
    }

    public static int getScore() {
        return score;
    }

    public void jeongdap(){
        this.heart += 1;
		this.score += 1;
       System.out.println("정답입니다! 하트 1 증가 (" + this.heart + ") 점수 1 증가 (" + getScore() + ")");
    }

    public void kkwang(){
        this.heart -= 1;
        System.out.println("꽝입니다! 하트 1 감소 (" + this.heart + ")");
    }

    public void bomb(){
        this.heart -= 1;
        if(score == 0) score = 0;
        else score -= 1;
        System.out.println("폭탄입니다! 하트 1 감소 (" + this.heart + ") 점수 1 감소 (" + getScore() + ")");
    }
}

