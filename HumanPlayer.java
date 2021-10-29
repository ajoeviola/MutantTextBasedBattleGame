import java.io.File;
import java.util.*;

public class HumanPlayer extends Player{

	
	/**
	 * 
	 * @param pMutant = player's Mutant
	 * @param pItem = player's item
	 */
	public HumanPlayer(Mutant pMutant, Item pItem) {
		super(pMutant, pItem);
	}
	
	public void run() {
		System.out.println("You can't run from a trainer battle!\n");
	}

	@Override
	public void TakeTurn(Mutant enemy) {
		
		Scanner input = new Scanner(System.in);
		//prompt the player for their action in battle
			System.out.println("Total Stamina left: " + this.getPlayerMutant().getstamina());
			System.out.println("What action will you take?\n");
			System.out.println("1 - Attack\n");
			System.out.println("2 - Use Item\n");
			System.out.println("3 - Speak\n");
			System.out.println("4 - Run\n");
			
			String userinput = input.nextLine();
			
			int result = Integer.parseInt(userinput);
		
		if (result == 1) {
			
			this.playerMutant.attack(enemy);
			
		}else if (result == 2) {
			
			this.playerItem.use(this.playerMutant);
			
		}else if (result == 3) {
			
			this.playerMutant.speak();
			
		}else if (result == 4) {
			
			this.run();
			
		}

	}
	
	
	
	
		
}
