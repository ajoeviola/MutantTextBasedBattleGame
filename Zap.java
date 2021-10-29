
public class Zap implements Attack{
		int damage = 30;
		int stamina = 3;
		String name = "Zap";
		String type = "electric";
		
		
		@Override
		public void attack(Mutant attacking, Mutant other) {
			// TODO Auto-generated method stub
			if (attacking.getstamina() >= stamina) {
				System.out.println(attacking.getName() + " attacked " + other.getName() + " with "+ name +"!!!!");
				if (this.superEffective(other.type)) {
					other.setHealthpoints(other.getHealthpoints()-(damage*2));
					System.out.println("It was super effective!!!");
				}
				else if (this.Effective(other.type) && this.effect(other.type)) {
					other.setHealthpoints(other.getHealthpoints()-damage);
					System.out.println("It was effective!");
				} else if (!this.Effective(other.type) && this.effect(other.type)) {
					other.setHealthpoints(other.getHealthpoints()-(damage/2)); 
					System.out.println("It was not very effective...");
				} else {System.out.println("It had no effect...");}
				
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
			//if type if flying or water, the attack is supereffective
			if (type == "flying" || type == "water") {
				return true;
			}
			return false;
		}


		@Override
		public boolean Effective(String type) {
			//if type is electric, grass, or ground, the attack is not effective 
			if (type == "electric" || type == "grass" || type == "ground") {
				return false;
			}
			return true;
		}
		
		public boolean effect(String type) {
			if (type == "ground") {
				return false;
			}
			return true;
		}
		
		
}
