package assignmntApril21Game;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class NameSelectGame {

	String randomName = "";
	Random random = new Random();

	public String randomSelect() throws Exception {

		File text = new File("nameList1.txt");
		Scanner file = new Scanner(text);

		int n = 0;
	
		while (file.hasNextLine()) {
			file.nextLine();
			n++;

		}

		int selectRandomIndex = random.nextInt(n);
	
		Scanner file1 = new Scanner(text);
		for(int i=0;i<n;i++) {
			file1.nextLine();
			if(i==selectRandomIndex) {
				randomName=file1.nextLine();
			}
		}
		
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

		for (int i = 0; i < charArrayRandomName.length; i++) {

			charArrayRandomNameCopy[i] = '-';

		}
		return charArrayRandomNameCopy;
	}

	char[] checkForTheLetterInName(char[] charArrayRandomName, char[] charArrayRandomNameCopy, char toCheck) {

		for (int i = 0; i < charArrayRandomName.length; i++) {

			if (charArrayRandomName[i] == toCheck) {
				charArrayRandomNameCopy[i] = toCheck;
			}

		}

		return charArrayRandomNameCopy;
	}

	int checkTwoArraysEqualOrNot(char[] testCharArrayRansomNameCopy, char[] charArrayRandomNameCopy,
			int wrongInputCount) {

		int flag = 0;
		for (int i = 0; i < charArrayRandomNameCopy.length; i++) {

			if (testCharArrayRansomNameCopy[i] == charArrayRandomNameCopy[i]) {
				flag = 1;
			}

		}

		if (flag == 1) {
			wrongInputCount++;

		}
		return wrongInputCount;
	}

}
