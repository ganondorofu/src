package test;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void introduce() {
		System.out.println("私は" + this.name + "です。" + this.age + "歳です。");
	}
	
	public abstract void speak();
}
