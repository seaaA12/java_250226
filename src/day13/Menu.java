package day13;

import java.util.ArrayList;

public class Menu {
	
	protected String menu;
	protected int price;
	
	public Menu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [menu=" + menu + ", price=" + price + "]";
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}		
}
