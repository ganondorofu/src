package test;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
		else {
			System.out.println("Invalid value");
		}
	}
	
	public void introduce(){
		System.out.println("私は" + this.name + "です。" + this.age + "です。");
	}
}
