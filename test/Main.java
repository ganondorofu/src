package test;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Character> characters = new ArrayList<>();
		
		characters.add(new Warrior("Taro", 12));
		characters.add(new Wizard("Hanako", 9));
		characters.add(new Archer("Souta", 15));
		characters.add(new Warrior("Ken", 8));
		characters.add(new Wizard("Ami", 13));
		characters.add(new Archer("Ren", 7));
		
		System.out.println("【全キャラクター紹介】");
		for (Character c : characters) {
			c.introduce();
		}

		System.out.println("【レベル10以上のキャラクター】");
		for (Character c : characters) {
			if (c.getLevel() >= 10) {				
				c.introduce();
			}
		}
		
		System.out.println("【魔法使いのみ】");
		for (Character c : characters) {
			if (c instanceof Wizard) {				
				c.introduce();
			}
		}
		
		System.out.println("【登録されたキャラクター数: " + characters.size() + "】");
	}
}
