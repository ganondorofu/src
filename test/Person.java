package test;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
			System.out.println(this.name + "の年齢を" + this.age + "に更新しました。");
		}
		else {
			System.out.println("Invailed value");
		}
	}
	
	public void introduce() {
		System.out.println("私は" + name + "です。" + age + "歳です。");
	}
}
