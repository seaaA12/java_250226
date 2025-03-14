package day12;

public class Customer {

	//멤버변수 선언
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer() {}

	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	//보너스 적립계산 매서드(매서드명: calcPrice)
	//리턴타입: 할인율 적용한 구매금액(int) 매개변수: int price
	public int calcPrice(int price) {
		int point = (int)(price* this.bonusRatio);
		this.bonusPoint= this.bonusPoint + point;
		//실버등급이기 때문에  0%
		return price;
	}
	
	//출력매서드(매서드명: customerInfo)
	public void customerInfo() {
		//홍길동님은 vip고객이며, 보너스 포인트는 10000점 입니다
		System.out.print(customerName+ "님은" + customerGrade +"고객이며");
		System.out.println("보너스 포인트는"+ bonusPoint+"점 입니다");
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
