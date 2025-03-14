package day09;

public class Card {


		/* 숫자 1~10 J(11) Q(12) K(13)
		 * 모양: ♥ ,◆, ♠, ♣
		 * 한장의 카드 모양을 출력하는 기능-> print()
		 * ex) ♥3 ♥12 ->♥Q #5 ->♥5 $15-> ♥1 
		 * 잘못된 모양은 무조건 ♥ 범위 넘어간 숫자는 무조건 1
		 * 
		 *  멤버변수: 숫자(num), 모양(shape) -> private -> getter/setter
		 */
		
		private String shape;
		private int num;
		
		public Card() {
			shape = "♥";
			num = 1;
		}
		
		public void print() {
			
			if(num < 1 || num > 13) {
				this.num = 1;
			}
			switch(num) {
			case 1: System.out.print(shape+"A "); break;
			case 11: System.out.print(shape+"J "); break;
			case 12: System.out.print(shape+"Q "); break;
			case 13: System.out.print(shape+"K "); break;
			default:
				System.out.print(shape+num+ " ");
			}
			//System.out.println();
		}
		
		public String getShape() {
			return shape;
		}
		public void setShape(String shape) {
			switch(shape) { 
			case "♥": case "◆": case "♠": case "♣":
				this.shape = shape; break;
			default:
				this.shape ="♥";
			}
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		
		
	}
