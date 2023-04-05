package factorDivision;

import java.util.Arrays;

public class DivThreeAndFive {
	int[]numberArray=new int[10];
 
	int i;
	
	void checkDivision() {
		
		
			for(int num=1;num>0;num++) {
				if(i<10) {	
					
					if(num%3==0 && num%5==0) {
						numberArray[i]=num;
						i++;
					
					}
					
				}else {
					break;
				}
			}
			
		
	}

}
