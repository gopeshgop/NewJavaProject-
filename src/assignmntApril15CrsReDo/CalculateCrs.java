package assignmntApril15CrsReDo;
import java.util.Scanner;

public class CalculateCrs {
	
	Scanner sc = new Scanner(System.in);
	int checkOptionVariable=0;
	
	int addEducationalScore(int crsScore) {
		
		checkOptionVariable = sc.nextInt();
		switch (checkOptionVariable){
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
		return crsScore;
	}
	
	int addExperienceScore(int experience, int crsScore) {
		if(experience>=4 && experience<=5) {
			crsScore+=13;
			
		}else if(experience>=6) {
			crsScore+=15;
		
		}else {
			crsScore+=0;
		}
		return crsScore;
	}
	
	int addAgeScore(int ageOfCandidate, int crsScore) {
		
		int ageCalc=12;
		if(ageOfCandidate>=18 && ageOfCandidate<=35) {
			
			crsScore+=ageCalc;
			
		}else if(ageOfCandidate>35 && ageOfCandidate<48) {
			
		ageCalc=ageCalc - (ageOfCandidate-35);
		crsScore=crsScore+ageCalc;
		
		}else {
			
			crsScore+=0;
		}
		return crsScore;
	}
	
	int addIeltsScore(int crsScore) {
		
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
			
			return crsScore;
	}
	
	int addAdaptabilityScore(int crsScore) {
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
		
		return crsScore;
		
	}
	
	void Display(int crsScore) {
		System.out.println("Total points scored : "+crsScore+" Points");
		if(crsScore>=67) {
			System.out.println("You are qualified to submit an Expression Of Interest (EOI) to Immigration Canada");
		}else {
			System.out.println("You are not qualified to submit an Expression Of Interest (EOI) to Immigration Canada");
		}
		
	}

}
