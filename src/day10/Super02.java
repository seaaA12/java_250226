package day10;

public class Super02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("초코", "개과");
		d.printInfo();
		d.howl();
		
		System.out.println("--------------");
		Cat c = new Cat("찹쌀", "고양이과");
		c.printInfo();
		c.howl();
	}

}
class Cat extends Animel{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
}

class Dog extends Animel{
	public Dog(String name, String category) {
		//부모 생성자 호출
		super(name, category);
		//부모 매서드 호출하여 setter
	//	super.setName(name);
	//	super.setCategory(category);
		
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
}

class Animel{ //부모
	private String name; //이름
	private String category; //종
	
	//생성자
	public Animel() {}
	
	public Animel(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	//출력매서드
	public void printInfo() {
		System.out.println("이름: "+ name);
		System.out.println("종: "+ category);
	}
	
	//울음소리 출력 매서드
	public void howl() {
		System.out.println("--"+name +" 울음소리--");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}