package test;

public abstract class Character {
	private String name;
	private int level;
	
	public Character(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public abstract void introduce();
	
	public abstract void attack();
}
