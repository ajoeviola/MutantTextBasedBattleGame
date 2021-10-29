
public class Icestorm implements Attack{
		int damage = 30;
		int stamina = 3;
		String name = "Icestorm";
		String type = "ice";
		
		
		@Override
		public void attack(Mutant attacking, Mutant other) {
			// TODO Auto-generated method stub
			if (attacking.getstamina() >= stamina) {
				System.out.println(attacking.getName() + " attacked " + other.getName() + " with "+ name +"!!!!");
				if (this.superEffective(other.type)) {
					other.setHealthpoints(other.getHealthpoints()-(damage*2));
					System.out.println("It was super effective!!!");
				}
				else if (this.Effective(other.type)) {
					other.setHealthpoints(other.getHealthpoints()-damage);
					System.out.println("It was effective!");
				} else {other.setHealthpoints(other.getHealthpoints()-(damage/2)); System.out.println("It was not very effective...");}
				
				//pause the program for 2 seconds
				try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
				
				System.out.println(other.name + "'s HP is now: " + other.getHealthpoints() + "\n");
				
				attacking.setstamina(attacking.getstamina() - stamina);
			}
		else {System.out.println("You don't have enough stamina! You can't attack!");}
		}


		@Override
		public boolean superEffective(String type) {
			//if type if dragon, fighting, grass, or ground, the attack is supereffective
			if (type == "dragon" || type == "fighting" || type == "grass" || type == "ground") {
				return true;
			}
			return false;
		}


		@Override
		public boolean Effective(String type) {
			//if type is ice of water, the attack is not effective
			if (type == "ice" || type == "water") {
				return false;
			}
			return true;
		}
		
		
}
