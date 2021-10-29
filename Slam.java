
public class Slam implements Attack{
		int damage = 20;
		int stamina = 1;
		String name = "Slam";
		String type = "normal";
		
		
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
			//return false since normal moves are not super effective against ANY other types
			return false;
		}


		@Override
		public boolean Effective(String type) {
			//normal type moves are effective against all moves except ghost types
			if (type == "ghost") {
				return false;
			}
			return true;
		}
		
		public boolean effect(String type) {
			if (type == "ghost") {
				return false;
			}
			return true;
		}
		
		
}
