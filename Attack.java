
public interface Attack {
		
	/**
	 * This function attacks a Mutant 
	 * @param Mutant attacking: Mutant performing the attack
	 * @param Mutant other: Mutant being attacked
	 */
	public void attack(Mutant attacking, Mutant other);
	
	/**
	 * 
	 * @param type = move type 
	 * @return whether or not move is supereffective or not 
	 */
	public boolean superEffective(String type);
	
	/**
	 * 
	 * @param type = move type 
	 * @return whether or not move is effective or not 
	 */
	public boolean Effective(String type);
}
