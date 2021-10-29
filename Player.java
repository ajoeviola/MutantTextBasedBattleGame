
public abstract class Player {
	
	/**
	 *  playerMutant: The player's Mutant that they will battle with
	 *  playerItem: The player's item that they can use in battle
	 */
	Mutant playerMutant;
	Item playerItem;
	
	
	
	/**
	 * 
	 * @param pMutant: Passes in Player's Mutant
	 * @param pItem: Passes in Player's Item
	 */
	public Player(Mutant pMutant, Item pItem) {
		playerMutant = pMutant;
		playerItem = pItem;
	}
	
	public abstract void TakeTurn(Mutant enemy);
	public abstract void run();

	/**
	 * Getters and setters for all our our variables
	 * Our getters return the variable
	 * Our setters set the variable 
	 * 
	 * @return: The variable 
	 */

	public Mutant getPlayerMutant() {
		return playerMutant;
	}

	public void setPlayerMutant(Mutant playerMutant) {
		this.playerMutant = playerMutant;
	}

	public Item getPlayerItem() {
		return playerItem;
	}

	public void setPlayerItem(Item playerItem) {
		this.playerItem = playerItem;
	}
	
}
