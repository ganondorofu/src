package test;

public class Student extends Person{
	private String school;
	
	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}
	
	@Override
	public void introduce() {
		System.out.println("私は" + getName() + "です。" + getAge() + "歳です。" + school + "に通っています。");
	}
}
