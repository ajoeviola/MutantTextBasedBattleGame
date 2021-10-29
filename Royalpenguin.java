import java.util.Scanner;

public class Royalpenguin extends Mutant{
	
	/**
	 * Constructor for Mutant Royalpenguin
	 * @param n = name
	 * @param hp = healthpoints
	 * @param st = stamina
	 * @param s = speed
	 * @param t = type
	 */
	public Royalpenguin(String n, int hp, int st, int s,String t) {
		super(n,hp,st,s,t);
	}
	
	
	
	@Override
	public void attack(Mutant other) {
		//Create attacks
		Attack slam = new Slam();
		Attack icestorm = new Icestorm();
		
		Scanner input = new Scanner(System.in);
		//prompt the player for which attack to use
	
			System.out.println("Which attack will you use?\n");
			System.out.println("1 - Slam Staminacost-1\n");
			System.out.println("2 - IceStorm Staminacost-3\n");
			
			String userinput = input.nextLine();
			
			int result = Integer.parseInt(userinput);
		
		if (result == 1) {
			slam.attack(this, other);
		}else if (result == 2) {
			icestorm.attack(this, other);
		}
		
		
	}

	@Override
	public void speak() {
		System.out.println("RoyyyyaallllllPenggguiiiin!!!!!");
	}
			
}
