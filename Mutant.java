import java.io.*;
import java.util.*;

public abstract class Mutant {
	
	/**
	 * 	name: The Mutant's name
	 *  healthpoints: The Mutant's max healthpoints
	 *  currhealthpoints: The Mutant's current healthpoints, if this reaches 0, it dies
	 *  stamina: The Mutant's stamina, required to use attacks
	 *  Attacks: A List of the Mutant's attacks
	 *  speed: the Mutant's speed, determines which Mutant attacks first
	 *  Type: The Mutant's type
	 */
	String name;
	int healthpoints;
	int currhealthpoints;
	int stamina;
	int speed;
	String type;
	ArrayList<String> Attacks = new ArrayList<>();
	
	
	/**
	 * Constructor for our Mutant:
	 * 
	 * @param n = name
	 * @param hp = healthpoints
	 * @param pp = stamina
	 * @param s = speed
	 * @param t = type
	 */
	public Mutant(String n, int hp, int pp, int s, String t) {
		name = n;
		healthpoints = hp; 
		currhealthpoints = hp;
		stamina = pp;
		speed = s;
		type = t;
	}
	
	/**
	 * Each Mutant has an abstract method for attacking and speaking 
	 * @param Mutant other: The Mutant that the attack will be performed on 
	 */
	public abstract void attack(Mutant other);
	public abstract void speak();
	
	
	/**
	 * Getters and setters for all our our variables
	 * Our getters return the variable
	 * Our setters set the variable 
	 * 
	 * @return: The variable 
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealthpoints() {
		return currhealthpoints;
	}
	
	public void setHealthpoints(int hp) {
		this.currhealthpoints = hp;
	}
	
	public void healHealthpoints(int hp) {
		this.currhealthpoints += hp;
		
		//if we healed more than the Mutant's MAX hp, reset the Mutant's hp to full. (to avoid going above their max hp)
			this.currhealthpoints = Math.min(this.currhealthpoints,this.healthpoints);
	}
	
	public int getstamina() {
		return stamina;
	}
	
	public void setstamina(int stamina) {
		this.stamina = stamina;
	}
	
	public ArrayList<String> getAttacks() {
		return Attacks;
	}
	
	public void setAttacks(ArrayList<String> attacks) {
		Attacks = attacks;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setspeed(int s) {
		speed = s;
	}
	
	
}
