package testPackage;

import java.io.File;
import java.util.random.*;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ReadAFileMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Random random = new Random();
		File text = new File("nameList1.txt");
		Scanner file = new Scanner(text);

		int n = 0;
		
			while (file.hasNextLine()) {
				System.out.println(file.nextLine());

				n++;

			}
			file.close();
			
			Scanner file1 = new Scanner(text);

		String[] nameList = new String[n];
		int i = 0;
		while (file1.hasNextLine()) {
			System.out.println(file1.nextLine());

			n++;

		}

		int selectRandomIndex = random.nextInt(nameList.length);
		String randomName = nameList[selectRandomIndex];

		/*
		 * while (i<n) { System.out.println(nameList[i]); i++; }
		 */

	}

}
