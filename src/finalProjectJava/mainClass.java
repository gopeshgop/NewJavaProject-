package finalProjectJava;

import java.util.ArrayList;
import java.util.List;

public class mainClass {

	public static void main(String[] args) {
		Simulation simulation = new Simulation();
//load items for mars
		ArrayList<Item> arrayListOfObj= new ArrayList<>();
		arrayListOfObj=simulation.loadItems();
		
		List<R1> arrayListOfRockets1 = new ArrayList<>();
		arrayListOfRockets1=simulation.loadU1(arrayListOfObj);
		
		int numOfR1 = simulation.runSimulationR1(arrayListOfRockets1);
		double costR1 =numOfR1*100;
		System.out.println("The cost for R1 rocket is "+costR1+" million");
		
		List<R2> arrayListOfRockets2 = new ArrayList<>();
		arrayListOfRockets2=simulation.loadU2(arrayListOfObj);
		int NumOfR2 = simulation.runSimulationR2(arrayListOfRockets2);
		double costR2 = NumOfR2*120;
		System.out.println("The cost for R2 rocket if "+costR2+" million");
	}

}
