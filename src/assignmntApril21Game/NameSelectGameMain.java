package assignmntApril21Game;
import java.util.Scanner;
import java.util.Arrays;
public class NameSelectGameMain {

	public static void main(String[] args) throws Exception {
		
		
		
		NameSelectGame nameSelectGame = new NameSelectGame();
		char charectorToCheck; int wrongInputCount=0;
		String randomName = nameSelectGame.randomSelect();
		
		char[]arrayCreatedFromString = nameSelectGame.convertrandomNameToArray(randomName);
		
		char[] maskedArray=nameSelectGame.initializeCopyArray(arrayCreatedFromString);
		
		System.out.println("Here is a name to guess");
		System.out.println(maskedArray);
		Scanner sc = new Scanner(System.in);
		while(wrongInputCount<5){
			
			System.out.println("Enter a guess letter ");
			System.out.println("You have "+(5-wrongInputCount)+" chance ");
			charectorToCheck = sc.next().charAt(0);
			
			char[]arrayToCheckWithMaskedArray = Arrays.copyOf(maskedArray, maskedArray.length);
			
			maskedArray=
					nameSelectGame.checkForTheLetterInName(arrayCreatedFromString, maskedArray, charectorToCheck);
			int checkArraysEqualOrNot=Arrays.compare(arrayToCheckWithMaskedArray,maskedArray);
			int breakWhileLoop=Arrays.compare(maskedArray,arrayCreatedFromString);
			
			if(checkArraysEqualOrNot==0) {
				wrongInputCount++;
			}
			
			for(int i=0;i<arrayCreatedFromString.length;i++) {
				System.out.print(maskedArray[i]);
			}
			
		
			if(breakWhileLoop==0) {
				
				System.out.println("\nYou win..Game over");
				break;
			}
			
		}sc.close();

		if(wrongInputCount==5) {
			System.out.println("\nYou have entered wrong input 5 times...You lost ..Game over");
		}	
		
	}

}
