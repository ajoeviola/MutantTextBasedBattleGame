
public class LightningHorse extends Mutant{

	/**
	 * Constructor for Mutant LightningHorse
	 * @param n = name
	 * @param hp = healthpoints
	 * @param pp = powerpoints
	 * @param s = speed
	 * @param t = type
	 */
	public LightningHorse(String n, int hp, int pp, int s, String t) {
		super(n,hp,pp,s,t);
	}
	
	
	@Override
	public void attack(Mutant other) {
		//Create attacks
		Attack slam = new Slam();
		Attack zap = new Zap();
		
		
		double seed = Math.random();
		
		if (seed <= .60) {
			
			slam.attack(this, other);
			
		}else {
			zap.attack(this, other);
		}
	}

	@Override
	public void speak() {
		System.out.println("Light-ning-HORSE!!!!!");
	}

}
