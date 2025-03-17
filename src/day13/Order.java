package day13;

public class Order extends Menu{

	private int cnt;
	private int amount;
	
	
	
	public Order(String menu, int price,int cnt, int amount) {
		super(menu, price);
		this.cnt = cnt;
		this.amount = amount;
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
