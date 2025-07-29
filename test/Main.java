package test;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(new Person("Taro", 20));
		people.add(new Person("Hanako", 18));
		
		for (Person p : people) {
			p.introduce();
		}
	}
}
