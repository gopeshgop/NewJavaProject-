package assignmntApril15CrsScore;
import java.util.Scanner;
public class CrsScoreCalc {
	int crsScore = 0, checkVar=0;
	
	Scanner sc = new Scanner(System.in);
	
	void educationScore() {
		System.out.println("Enter one amoung the following option ");
		System.out.println("1- PhD\n2- Any Master's Degree");
		System.out.println("3- Two or more university degrees\n    Diplomas at t5he bachelor's level one of which is a thrhee year or longer duration");
		System.out.println("4- 12 + Three Years or longer Degree / Diploma");
		checkVar = sc.nextInt();
		switch (checkVar){
		case 1:
			crsScore+=25;
			break;
		case 2:
			crsScore+=23;
			break;
		case 3:
			crsScore+=22;
			break;
		case 4:
			crsScore+=21;
			break;
			default:
				System.out.println("Wrong option selected");
		}		
	}
	
	void experienceScore() {
		System.out.println("Enter your experience in years: ");
		checkVar = sc.nextInt();
		if(checkVar>=4 && checkVar<=5) {
			crsScore+=13;
		}else if(checkVar>=6) {
			crsScore+=15;
		}else {
			crsScore+=0;
		}
	}
	void ieltsScore() {
		
		System.out.println("Enter the IELTS Scores for Listening: ");
		double listening=sc.nextDouble();
		System.out.println("Enter the IELTS Scores for Speaking: ");
		double speaking=sc.nextDouble();
		System.out.println("Enter the IELTS Scores for Reading: ");
		double reading=sc.nextDouble();
		System.out.println("Enter the IELTS Scores for Writing: ");
		double writing=sc.nextDouble();
		
			
			if(listening>=8){
				crsScore+=6;
			}else if(listening == 7.5){
				crsScore+=5;
			}else {
				crsScore+=0;
			}
			
			if(speaking>=7) {
				crsScore+=6;
			}else if(speaking==6.5) {
				crsScore+=5;
			}else {
				crsScore+=0;
			}
			
			if(reading>=7) {
				crsScore+=6;
			}else if(reading==6.5) {
				crsScore+=5;
			}else {
				crsScore+=0;
			}
			
			if(writing>=7) {
				crsScore+=6;
			}else if(writing==6.5) {
				crsScore+=5;
			}else {
				crsScore+=0;
			}
	}
	
	void ageScore() {
		int ageCalc=12;
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18 && age<=35) {
			
			crsScore+=ageCalc;
			
		}else if(age>35 && age<48) {
			
		ageCalc=ageCalc - (age-35);
		crsScore=crsScore+ageCalc;
		
		}else {
			
			crsScore+=0;
		}
	}
	
	void adaptabilityScore() {
		System.out.println("If you have a relative in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle\nNephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		String adaptVariable = sc.next();
		if(adaptVariable.equals("Y")) {
			crsScore+=5;
		}
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		adaptVariable=sc.next();
		if(adaptVariable.equals("Y")) {
			crsScore+=5;
		}
		
		System.out.println("Have you worked in Canada for atleast one year at NOC 0,A,B (Y/N)");
		adaptVariable=sc.next();
		if(adaptVariable.equals("Y")) {
			crsScore+=10;
		}
		
	}
	
	void Display() {
		System.out.println("Total points scored : "+crsScore+" Points");
		if(crsScore>=67) {
			System.out.println("You are qualified to submit an Expression Of Interest (EOI) to Immigration Canada");
		}else {
			System.out.println("You are not qualified to submit an Expression Of Interest (EOI) to Immigration Canada");
		}
		
	}

}
