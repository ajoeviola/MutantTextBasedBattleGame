
public class Tonic implements Item{
	/**
	 *  name: Each Item has a name
	 *  effect: The effect of each Item (poison, pp increase, attack priority, etc.)
	 *  healing: Stores an int based on the item's healing value
	 */
	String name;
	String effect;
	int healing;
	
	/**
	 * @param n = name
	 * @param e = effect
	 * @param h = healing 
	 */
	public Tonic(String n,String e, int h) {
		name = n;
		effect = e;
		healing = h;
	}


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
	
	public String getEffect() {
		return effect;
	}
	
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	public int getHealing() {
		return healing;
	}
	
	public void setHealing(int healing) {
		this.healing = healing;
	}


	@Override
	public void use(Mutant p) {
		System.out.println("Trainer used a " + this.name);
		
		//pause the program for 2 seconds
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		p.healHealthpoints(this.healing);
		System.out.println(p.getName() + "'s HP is now: " + p.getHealthpoints());
		
	}
	
	
}
