package assignmntApril18StringArray;

public class StringArrayClass {
	String [] stringArrayCityNames = {"Toronto", "Ottawa", "Brampton", "Hamilton", "London","Mississauga", "Burlington", "Kingston", "Kitchener"};
	
	int readCityName(String cityName) {
		int tocken=0;
		for( int i=0;i<stringArrayCityNames.length;i++) {
			
			if(stringArrayCityNames[i].equalsIgnoreCase(cityName)) {
				tocken=1;
				break;
			}
		}
		return tocken;
	}
	
	void findCitiesWithton() {
		
		for( int i=0;i<stringArrayCityNames.length;i++) {
			
			if(stringArrayCityNames[i].endsWith("ton")) {
				
				System.out.println(stringArrayCityNames[i]);
				
			}
		}
	}
	
void replaceTonWithFun() {
		
		for( int i=0;i<stringArrayCityNames.length;i++) {
			
			if(stringArrayCityNames[i].endsWith("ton")) {
				
				stringArrayCityNames[i] = stringArrayCityNames[i].replace("ton", "fun");
				System.out.println(stringArrayCityNames[i]);
				
			}
		}
	}

}
