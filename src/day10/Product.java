package day10;

public class Product {
	
	
	private String product;
	private int price;
	
	public Product() {}
	public Product(String product, int price) {
		this.product = product;
		this.price = price;
	}
	public void insertProduct(String product, int price) {
		this.product = product;
		this.price = price;
	}
	public void printInfo() {
		System.out.println("상품명: "+ product + " / " +price+"원");
	}
	//기본 출력 매서드 toString
	//부모의 매서드를 자식이 사용하는것(자식입장: 네 형식에 맞게 수정가능)
	@Override
	public String toString() {
		return " [" + product + ": " + price + "]";
	}
		
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}