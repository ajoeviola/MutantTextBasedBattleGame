import java.util.*;

public class Mutantrunner {

	public static void main(String[] args) {
		

		//Create a new Mutant Object for our Royalpenguin and LightningHorse

		Mutant royalp = new Royalpenguin("Royalpenguin", 95, 15, 10,"Ice");
		Mutant lightningh = new LightningHorse("LightningHorse", 80, 15, 7, "Electric");
		
		//Create two new potion items 
		Item Item1 = new Tonic("Tiny Tonic","N/A", 20);
		Item Item2 = new Tonic("Big Tonic", "N/A", 40);
		
		
		//Create our human trainer with their Mutant and item
		Player Trainer = new HumanPlayer(royalp, Item1); 
		
		//Create our cpu trainer with their Mutant and item
		Player CPU = new ComputerPlayer(lightningh, Item2);
		
		System.out.println("You will be battling with " + royalp.getName() + " against " + lightningh.getName() + " !!! ");
		
		
		//pause the program for 3 seconds
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		
		System.out.println("THE BATTLE HAS BEGUN!\n");
		
		
		//Start the battle!
		//While our health of both Mutant are greater 0, keep battling!
		while (Trainer.getPlayerMutant().getHealthpoints() > 0 && CPU.getPlayerMutant().getHealthpoints() > 0) {
			
			//The Mutant with the greater speed attacks first
			if (Trainer.getPlayerMutant().getspeed() > CPU.getPlayerMutant().getspeed()) {
				
				//Trainer's Mutant will take their turn first 
				Trainer.TakeTurn(CPU.getPlayerMutant());
				//Check if either Mutant's health has reached 0
				if (Trainer.getPlayerMutant().getHealthpoints() <= 0 || CPU.getPlayerMutant().getHealthpoints() <= 0) {break;}
				
				CPU.TakeTurn(Trainer.getPlayerMutant());
				if (Trainer.getPlayerMutant().getHealthpoints() <= 0 || CPU.getPlayerMutant().getHealthpoints() <= 0) {break;}
				
			}else {
				//CPU's Mutant will take their turn first
				  CPU.TakeTurn(Trainer.getPlayerMutant());
				  if (Trainer.getPlayerMutant().getHealthpoints() <= 0 || CPU.getPlayerMutant().getHealthpoints() <= 0) {break;}
				  
				  Trainer.TakeTurn(CPU.getPlayerMutant());
				  if (Trainer.getPlayerMutant().getHealthpoints() <= 0 || CPU.getPlayerMutant().getHealthpoints() <= 0) {break;}
				   }
			
			//pause the program for 2 seconds
			try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			
			}
		
		System.out.println("The battle is now over!\n");
		}
	

	}
