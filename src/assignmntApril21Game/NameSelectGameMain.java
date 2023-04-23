package assignmntApril21Game;
import java.util.Scanner;
import java.util.Arrays;
public class NameSelectGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NameSelectGame nameSelectGame = new NameSelectGame();
		char toCheck; int wrongInputCount=0;
		//System.out.println("Enter your name to start the game");
		//String getNameOfPlayer = sc.next();
		
		String randomName = nameSelectGame.randomSelect();
		
		System.out.println(randomName);
		
		char[]charArrayRandomName = nameSelectGame.convertrandomNameToArray(randomName);
		
		char[] charArrayRandomNameCopy=nameSelectGame.initializeCopyArray(charArrayRandomName);
		
		
		while(wrongInputCount<5) {
			System.out.println();
			System.out.println("Enter a letter to check ");
			toCheck = sc.next().charAt(0);
			
			char[]testCharArrayRansomNameCopy = Arrays.copyOf(charArrayRandomNameCopy, charArrayRandomNameCopy.length);
			
			charArrayRandomNameCopy=
					nameSelectGame.checkForTheLetterInName(charArrayRandomName, charArrayRandomNameCopy, toCheck);
			
			
			int checkArraysEqualOrNot=Arrays.compare(testCharArrayRansomNameCopy,charArrayRandomNameCopy);
			int breakWhileLoop=Arrays.compare(charArrayRandomNameCopy,charArrayRandomName);
			
			if(checkArraysEqualOrNot==0) {
				wrongInputCount++;
			}
			
			for(int i=0;i<charArrayRandomName.length;i++) {
				System.out.print(charArrayRandomNameCopy[i]);
			}
		
			if(breakWhileLoop==0) {
				
				System.out.println("\nYou win..Game over");
				break;
			}
			
		}
		if(wrongInputCount==5) {
			System.out.println("You have entered wrong input 5 times...You lost ..Game over");
		}
		
		
		
		
		
		
	}

}
