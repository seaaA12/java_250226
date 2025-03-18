package slae;

public class Menu {
	//메누번호, 메뉴명, 가격
	private int menuMo;
	private String menuMame;
	private int price;
	
	public Menu() {}
	
	public Menu(int menuMo,  String menuMame,int price ) {
		this.menuMo = menuMo;
		this.menuMame = menuMame;
		this.price = price;	
	}
	
	@Override
	public String toString() {
		return "[" + menuMo + "." + menuMame + ": " + price + "]";
	}
	public int getMenuMo() {
		return menuMo;
	}
	public void setMenuMo(int menuMo) {
		this.menuMo = menuMo;
	}
	public String getMenuMame() {
		return menuMame;
	}
	public void setMenuMame(String menuMame) {
		this.menuMame = menuMame;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
