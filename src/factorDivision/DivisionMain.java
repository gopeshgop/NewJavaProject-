package factorDivision;

import java.util.Arrays;

public class DivisionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivThreeAndFive divInsta = new DivThreeAndFive();
		divInsta.checkDivision();
		System.out.println("The first 10 numbers divisible by 3 and 5 are ");
		System.out.println(Arrays.toString(divInsta.numberArray));
		

	}

}
