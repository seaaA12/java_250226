package day09;

public class CardMain {

	public static void main(String[] args) {
			
	/*		Card c = new Card();
			c.print();
			c.setNum(12); 
			c.print();
			c.setShape("＃");
			c.setNum(5);
			c.print();
			System.out.println("-------");
			
			//♥ ,◆, ♠, ♣
			for(int j=1; j<=4; j++) {
				switch(j) {
				case 1: c.setShape("♥"); break;
				case 2: c.setShape("◆"); break;
				case 3: c.setShape("♠"); break;
				case 4: c.setShape("♣"); break;
				}
				System.out.println();
				for(int i=1; i<=13; i++) {
					c.setNum(i);
					c.print();
				}
			}*/

		CardPack cp = new CardPack();
		
		//CardPack 객체 확인
		int cnt =0;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				cp.getPack()[cnt].print();
				cnt++;
			}
			System.out.println();
		}
		System.out.println("-------");
		cp.shuffli();
		cnt =0;
		for(Card card : cp.getPack()) {
			card.print();
		}
		System.out.println();
		System.out.println("--------");
		System.out.println("딜러가 카드를 섞고 있습니다.");
		cp.shuffli();
		for(Card card : cp.getPack()) {
			card.print();
		}
		System.out.println();
		System.out.println("딜러가 카드를 나누고 있습니다");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		Card player3 = cp.pick();
		
		System.out.println("------------");
		System.out.println("player1 Card Open");
		player1.print();
		System.out.println();
		System.out.println("player2 Card Open");
		player2.print();
		System.out.println();
		System.out.println("player3 Card Open");
		player3.print();
		System.out.println();
		System.out.println("------------");
		
		cp.init();
		for(Card card : cp.getPack()) {
			card.print();
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
