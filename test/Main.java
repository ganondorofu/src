package test;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("Taro", 20));
		people.add(new Person("Taro", 20));
		people.add(new Person("Hanako", 18));
		people.add(new Person("Jiro", 25));
		people.add(new Person("Ami", 17));
		people.add(new Person("Satoshi", 30));
		people.add(new Student("Kenta", 19, "東京高校"));
		people.add(new Student("Mai", 21, "大阪大学"));

		
		System.out.println("全員の自己紹介:");
		for (Person p : people) {
			p.introduce();
		}
		
		System.out.println("20歳以上の人");
		for (Person p : people) {
			if (p.getAge() >= 20) {
				p.introduce();
			}
		}
		
		System.out.println("登録された人数: " + people.size());
	}
}
