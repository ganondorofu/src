package test;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void introduce() {
		System.out.println("私は猫の" + getName() + "です。" + getAge() + "歳です。");
		speak();
	}
	
	public void speak() {
		System.out.println("ニャー！");
	}
}
