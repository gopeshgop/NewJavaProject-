package assignmntApril18StringExtract;

public class ExtractString {
	
	String str = "100 queen street,Toronto,M5V 3E3 ";
	String streetAddress="";
	String city="";
	String zip="";
	int exctractIndexArray=0;
	int countComa(char comaChar) {
		char[] charStrArray = new char[str.length()];
		int counter = 0;
		for(int i=0;i<str.length();i++) {
			charStrArray[i]=str.charAt(i);
			if(str.charAt(i)==comaChar) {
				counter++;
			}
		}
		return counter;
	}
	
	void extractWords() {
		String [] extractedArray = str.split(",");
		int i =0;
		streetAddress=extractedArray[i];i++;
		city = extractedArray[i];i++;
		zip = extractedArray[i];
		System.out.println("The string is "+str);
		System.out.println("The result is ");
		System.out.println(streetAddress);
		System.out.println(city);
		System.out.println(zip);
	}

}
