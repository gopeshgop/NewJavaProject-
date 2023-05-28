package finalProjectJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Simulation {
	ArrayList<Item> arrayListOfItemObj = new ArrayList<>();

	ArrayList<Item> loadItems() {

		File file = new File("C:/Users/gopes/OneDrive/Desktop/QA Course/Assignments/Final Java Assignment/phase1.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				Item item = new Item("",0);
				String[] splitString = sc.nextLine().split("=");
				item.name = splitString[0];
				item.weight = Integer.parseInt(splitString[1]);

				arrayListOfItemObj.add(item);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		arrayListOfItemObj.sort(Comparator.comparing(Item::getWeight).reversed());

		return arrayListOfItemObj;
	}

	List<R1> loadU1(ArrayList<Item> arrayListOfItemObj) {

		ArrayList<R1> arrayOfRockets1 = new ArrayList<>();
		Item item1 = new Item("",0);
		for (int j = 0; j < arrayListOfItemObj.size(); j++) {
			R1 r1 = new R1();
			
			r1.carry(arrayListOfItemObj.get(j));

			if (r1.currentWeight == r1.maxWeightLimit) {
				arrayOfRockets1.add(r1);
			} else if (r1.currentWeight < r1.maxWeightLimit) {
				for (int i = j + 1; i < arrayListOfItemObj.size(); i++) {
					if (r1.canCarry(arrayListOfItemObj.get(i))) {
						r1.carry(arrayListOfItemObj.get(i));
						arrayListOfItemObj.set(i, item1);
					}
				}
				arrayOfRockets1.add(r1);
			} 

		}
		int endIndex=0;
		for(int i=0; i<arrayOfRockets1.size();i++) {
			if(arrayOfRockets1.get(i).currentWeight==0) {
				endIndex=i;
				break;
			}
		}
		List<R1> arrayOfRockets;
		arrayOfRockets= arrayOfRockets1.subList(0, endIndex+1);
		return arrayOfRockets;
	}
	
//loadu2 for R2
	
	List<R2> loadU2(ArrayList<Item> arrayListOfItemObj) {

		ArrayList<R2> arrayOfRockets1 = new ArrayList<>();
		Item item1 = new Item("",0);
		for (int j = 0; j < arrayListOfItemObj.size(); j++) {
			R2 r2 = new R2();
			
			r2.carry(arrayListOfItemObj.get(j));

			if (r2.currentWeight == r2.maxWeightLimit) {
				arrayOfRockets1.add(r2);
			} else if (r2.currentWeight < r2.maxWeightLimit) {
				for (int i = j + 1; i < arrayListOfItemObj.size(); i++) {
					if (r2.canCarry(arrayListOfItemObj.get(i))) {
						r2.carry(arrayListOfItemObj.get(i));
						arrayListOfItemObj.set(i, item1);
					}
				}
				arrayOfRockets1.add(r2);
			} 

		}
//		trimming list
		int endIndex=0;
		for(int i=0; i<arrayOfRockets1.size();i++) {
			if(arrayOfRockets1.get(i).currentWeight==0) {
				endIndex=i;
				break;
			}
		}
		List<R2> arrayOfRockets;
		arrayOfRockets= arrayOfRockets1.subList(0, endIndex+1);
		return arrayOfRockets;
	}
	
	int runSimulationR1(List<R1> arrayOfRockets) {
		int k=0,counter=0;
		for(int i=0; i<arrayOfRockets.size();i++) {
			boolean testCase1=arrayOfRockets.get(i).launch();
			boolean testCase2=arrayOfRockets.get(i).land();
			
			do{
				
				testCase1=arrayOfRockets.get(i).launch();
				testCase2=arrayOfRockets.get(i).land();
				k++;
			}while(testCase1||testCase2) ;
			counter +=k;
		}
		return counter;
		
	}
	
	//method over loading*********
	
	int runSimulationR2(List<R2> arrayOfRockets) {
		int k=0,counter=0;
		for(int i=0; i<arrayOfRockets.size();i++) {
			boolean testCase1=arrayOfRockets.get(i).launch();
			boolean testCase2=arrayOfRockets.get(i).land();
			
			do{
				
				testCase1=arrayOfRockets.get(i).launch();
				testCase2=arrayOfRockets.get(i).land();
				k++;
			}while(testCase1||testCase2) ;
			counter +=k;
		}
		return counter;
		
	}

}