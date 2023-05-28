package finalProjectJava;

public class Rocket implements SpaceShip {

	double maxWeightLimit = 0;
	double currentWeight = 0;

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if (currentWeight+item.weight <=maxWeightLimit) {
			return true;
		} else {
			return false;
		}
	}
	
	public Rocket(double maxWeight) {
		this.maxWeightLimit=maxWeight;
	}

	@Override
	public void carry(Item item) {
	currentWeight=currentWeight+item.weight; 	
		
		

	}

}
