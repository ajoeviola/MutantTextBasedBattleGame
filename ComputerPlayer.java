import java.util.*;

public class ComputerPlayer extends Player{

	
	/**
	 * 
	 * @param pMutant = CPU Mutant
	 * @param pItem = CPU item
	 */
	public ComputerPlayer(Mutant pMutant, Item pItem) {
		super(pMutant, pItem);
	}
	
	public void run() {
		System.out.println("You can't run from a trainer battle!\n");
	}

	@Override
	public void TakeTurn(Mutant enemy) {
	
			double seed = Math.random();
			
			if (seed <= .10) {
				
				this.playerItem.use(this.playerMutant);
				
			}else {
				
				this.playerMutant.attack(enemy);
				
			}
	}
	
	

}
