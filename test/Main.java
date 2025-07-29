package test;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> Animals = new ArrayList<>();
		
		Animals.add(new Dog("ポチ", 4));
		Animals.add(new Dog("イヌ", 6));
		Animals.add(new Cat("ミー", 3));
		Animals.add(new Cat("ネコ", 5));
		
		
		System.out.println("4歳以上:");
		for (Animal a : Animals) {
			if (a.getAge() >=4)
			a.introduce();
		}
	}
}
