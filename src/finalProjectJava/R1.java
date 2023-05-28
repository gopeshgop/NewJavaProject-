package finalProjectJava;

import java.util.Random;

public class R1 extends Rocket {

	Random random = new Random();

	@Override
	public boolean launch() {
		double chanceOfExplotion = 5 * (currentWeight / maxWeightLimit);
		double randomNumLaunch = random.nextInt(5);
		if (chanceOfExplotion < randomNumLaunch) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean land() {
		double chanceOfCrashLanding = (1 * (currentWeight / maxWeightLimit))*10;
		double randumNumLand=random.nextInt(10);
		if (chanceOfCrashLanding < randumNumLand) {
			return true;
		} else {
			return false;
		}
	}

	public R1() {
		super(7000);
		// TODO Auto-generated constructor stub
	}

}
