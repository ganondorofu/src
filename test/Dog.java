package test;

public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void introduce() {
		System.out.println("私は犬の" + getName() + "です。" + getAge() + "歳です。");
		speak();
	}
	
	public void speak() {
		System.out.println("ワンワン!");
	}
}
