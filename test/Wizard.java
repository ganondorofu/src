package test;

public class Wizard extends Character{
	public Wizard(String name, int level) {
		super(name, level);
	}
	
	
	public void introduce() {
		System.out.println("私は" + getName() + "です。" + "レベル" + getLevel() + "です。");
		attack();
	}
	
	public void attack() {
		System.out.println("ファイアボールを唱える!");
	}
}
