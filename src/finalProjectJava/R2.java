package finalProjectJava;

import java.util.Random;

public class R2 extends Rocket{
	
	

	Random random = new Random();
	@Override
	public boolean launch() {
		double chanceOfExplotion = 4 * (currentWeight / maxWeightLimit);
		double randomNumLaunch = random.nextInt(6);
		if (chanceOfExplotion < randomNumLaunch) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {
		double chanceOfCrashLanding = (8 * (currentWeight / maxWeightLimit));
		double randumNumLand=random.nextInt(12);
		if (chanceOfCrashLanding < randumNumLand) {
			return true;
		} else {
			return false;
		}
	}

	public R2() {
		super(11000);
		// TODO Auto-generated constructor stub
	}

}
