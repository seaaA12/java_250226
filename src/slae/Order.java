package slae;


public class Order extends Menu{
	

	private int conut;
	private int total;
	
	public Order() {}
	
	public Order(int menuMo,  String menuMame,int price, int count) {
		//메뉴 샌성자 호출
		super(menuMo,menuMame,price);
		this.conut = count;
		this.total= price * count;
	}
	
	//프린트 메서드 추가
	public void printOrder() {
		System.out.println(super.getMenuMo()+"."+super.getMenuMame()+" "+
				super.getPrice()+" "+this.conut+ "=>"+ this.total);
	}
	

	public int getConut() {
		return conut;
	}

	public void setConut(int conut) {
		this.conut = conut;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [conut=" + conut + ", total=" + total + "]";
	}
}
