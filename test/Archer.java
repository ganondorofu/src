package test;

public class Archer extends Character{
	public Archer(String name, int level) {
		super(name, level);
	}
	
	
	public void introduce() {
		System.out.println("私は" + getName() + "です。" + "レベル" + getLevel() + "です。");
		attack();
	}
	
	public void attack() {
		System.out.println("弓で遠距離攻撃!");
	}
}
