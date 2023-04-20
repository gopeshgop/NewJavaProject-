package assignmntApril15CrsReDo;
import java.util.Scanner;
public class TestWithArrayMain {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateCrs calculateCrs = new CalculateCrs();
		Scanner sc = new Scanner(System.in);
		int crsScore=0;
		
		System.out.println("Enter one amoung the following option ");
		System.out.println("1- PhD\n2- Any Master's Degree");
		System.out.println("3- Two or more university degrees\n    Diplomas at t5he bachelor's level one of which is a thrhee year or longer duration");
		System.out.println("4- 12 + Three Years or longer Degree / Diploma");
		
		crsScore = calculateCrs.addEducationalScore(crsScore);
		
		
		
		System.out.println("Enter your experience in years");
		crsScore = calculateCrs.addExperienceScore(sc.nextInt(), crsScore);
		
		
		
		System.out.println("Enter your age");
		crsScore=calculateCrs.addAgeScore(sc.nextInt(), crsScore);
		
		System.out.println(crsScore);
		crsScore = calculateCrs.addIeltsScore(crsScore);
		calculateCrs.Display(crsScore);
	}

}
