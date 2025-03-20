package day16;

public class Customer {
	
	private String name;
	private int age;
	private int money;
	
	public Customer() {};
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.money = age >= 15? 100: 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "[이름:" + name + ", 나이:" + age + ", 비용:" + money + "]";
	}
}
