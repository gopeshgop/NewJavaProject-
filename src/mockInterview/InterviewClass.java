package mockInterview;

public class InterviewClass {
	int [] sortArray = {3,4,2,6,5};
	int temp;
	
	void arrangeArray() {
		//System.out.println(sortArray.length);
		for(int i=0;i<=sortArray.length-1;i++) {
			for(int j=1;j<=sortArray.length-1;j++) {
			
			if(sortArray[i]<sortArray[j]) {
				temp = sortArray[i];
				sortArray[i]=sortArray[j];
				sortArray[j]=temp;
			}
			}
		}
		System.out.println("the largest one in the array is "+sortArray[0]);
	}

}
