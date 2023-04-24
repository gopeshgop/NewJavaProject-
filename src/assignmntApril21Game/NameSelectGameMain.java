package assignmntApril21Game;
import java.util.Scanner;
import java.util.Arrays;
public class NameSelectGameMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NameSelectGame nameSelectGame = new NameSelectGame();
		char toCheck; int wrongInputCount=0;
		String randomName = nameSelectGame.randomSelect();
		
		char[]charArrayRandomName = nameSelectGame.convertrandomNameToArray(randomName);
		
		char[] charArrayRandomNameCopy=nameSelectGame.initializeCopyArray(charArrayRandomName);
		System.out.println("Here is a name to guess");
		System.out.println(charArrayRandomNameCopy);
		while(wrongInputCount<5) {
			
			System.out.println("Enter a guess letter ");
			System.out.println("You have "+(5-wrongInputCount)+" chance ");
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
			System.out.println("\nYou have entered wrong input 5 times...You lost ..Game over");
		}	
		
	}

}
