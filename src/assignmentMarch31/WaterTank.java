package assignmentMarch31;

import java.util.Scanner;

public class WaterTank {
	int currentLevel, checkLevel;
	Scanner sc = new Scanner(System.in);

	void checkLevel() {
		do {
			System.out.println("The Tank is not filled yet, fill water");
			checkLevel=sc.nextInt();
			if(checkLevel<=10) {
			if(checkLevel<=100-currentLevel) {
				currentLevel+=checkLevel;
			}else {
				System.out.println("The tank can only take "+(100-currentLevel)+"-litres more");
			}
			}else {
				System.out.println("The maximum capacity of bucket is 10 liters");
			}
			
		}while(currentLevel<100);
		
		System.out.println("The Tank is filled");
	}

}
