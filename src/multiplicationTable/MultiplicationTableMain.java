package multiplicationTable;
import java.util.Scanner;
public class MultiplicationTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MulTable tabInst = new MulTable();
		System.out.println("Enter the number you want to print");
		tabInst.tableVariable=sc.nextInt();
		tabInst.printTable();

	}

}
