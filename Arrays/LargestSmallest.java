package Arrays;

public class LargestSmallest {
	
	public static float getLargestsmallest(float num[]) {
		
/*int*/		float largest = Integer.MIN_VALUE; // -Infinity
/*int*/		float smallest = Integer.MAX_VALUE; // +Infinity
		   
     		for(int i=0;i<num.length;i++){
			if(largest<num[i]){
				largest = num[i];
		      }
			
			if(smallest>num[i]){
				smallest = num[i];
		      }
		}
		System.out.println("Smallest num :"+smallest);
		return largest;
		

	}

	
	

	public static void main(String[] args) {
		float num[]={3,7,9,11,54,8,2,0.9f};
		System.out.println("Largest num : "+getLargestsmallest(num));

	}

}
