package assignmntApril18StringArray;
import java.util.Scanner;
public class StringArrayClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		StringArrayClass stringArray = new StringArrayClass();
		System.out.println("Enter a city name ");
		int token = stringArray.readCityName(sc.next());
		if (token==1) {
			System.out.println("City name found");
		}else {
			System.out.println("City not found in the List");
		}
		System.out.println("The cities with ton endings are :");
		stringArray.findCitiesWithton();
		System.out.println("The replaces strings are : ");
		stringArray.replaceTonWithFun();
		

	}

}
