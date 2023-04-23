package assignmntApril21Game;

import java.util.Random;

public class NameSelectGame {

	
	
	String[] nameList = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };

	Random random = new Random();

	public String randomSelect() {
		int selectRandomIndex = random.nextInt(nameList.length);
		String randomName = nameList[selectRandomIndex];
		return randomName;

	}

	char[] convertrandomNameToArray(String randomName) {

		char[] charArrayRandomName = new char[randomName.length()];

		for (int i = 0; i < randomName.length(); i++) {
			charArrayRandomName[i] = randomName.charAt(i);
		}
		return charArrayRandomName;
		
	}
	
	
	char[] initializeCopyArray(char[] charArrayRandomName) {
		
		char[] charArrayRandomNameCopy = new char[charArrayRandomName.length];
		
		for(int i=0;i<charArrayRandomName.length;i++) {
			
			charArrayRandomNameCopy[i]= '-';
			
		}
		return charArrayRandomNameCopy;
	}
	
	
	char[] checkForTheLetterInName(char[] charArrayRandomName,char[] charArrayRandomNameCopy, char toCheck) {
		
		for(int i=0;i<charArrayRandomName.length;i++) {
			
			if(charArrayRandomName[i]==toCheck) {
				charArrayRandomNameCopy[i]=toCheck;
			}
			
			
		}
		
		return charArrayRandomNameCopy;
	}
	
	
	int checkTwoArraysEqualOrNot(char[]testCharArrayRansomNameCopy, char[]charArrayRandomNameCopy, int wrongInputCount) {
		
		int flag=0;
		for(int i=0;i<charArrayRandomNameCopy.length;i++) {
			
			if(testCharArrayRansomNameCopy[i]==charArrayRandomNameCopy[i]) {
				flag=1;
			}
			
		}
		
		if(flag==1) {
			wrongInputCount++;
			
		}
		return wrongInputCount;
	}
	
	

	/*String displayMaskedName(String randomName, String letterToCheck) {
		randomNameCopy = randomName.replaceAll("[a-zA-Z]", "-");
		int indexOfLetter = 0;
		System.out.println(randomNameCopy);
		
		for(int i=0;i<randomName.length();i++) {
		
			if (randomName.contains(letterToCheck)) {

				indexOfLetter = randomName.indexOf(letterToCheck);

				randomNameCopy = randomNameCopy.substring(0, indexOfLetter) + letterToCheck + randomNameCopy.substring(++indexOfLetter);
				randomName.replace
			}
		}
		
		return randomNameCopy;
	

	}*/

}
