package Arithmaticoperations;

public class MainArithmatic {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Operations opp = new Operations();
		opp.num1=15;
		opp.num2=3;
		opp.addNumbers();
		opp.SubNumbers();
		opp.quotient();
		opp.remainder();
		opp.productNumbbers();
		System.out.println();
		System.out.println("***************------------*****************");
		Assignment ass = new Assignment();
		ass.divNum();
		System.out.println();
		System.out.println("***************------------*****************");
		MulAssignment mulass = new MulAssignment();
		mulass.squareNum();

	}

}
