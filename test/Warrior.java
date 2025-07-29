package test;

public  class Warrior extends Character{

	public Warrior(String name, int level) {
		super(name, level);
	}
	
	
	public void introduce() {
		System.out.println("私は" + getName() + "です。" + "レベル" + getLevel() + "です。");
		attack();
	}
	
	public void attack() {
		System.out.println("剣で切かかる!");
	}
}
