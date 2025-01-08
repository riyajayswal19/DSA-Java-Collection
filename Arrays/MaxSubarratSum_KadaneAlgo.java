package Arrays;

public class MaxSubarratSum_KadaneAlgo {
	
	public static void maxSum(int num[]) {
		
		int currSum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++){
			currSum = currSum + num[i];
			if(currSum < 0){
				currSum =0;
			}
			
			max = Math.max(currSum, max);
			
//			if(currSum > max){
//				max = currSum;
//			}
		} System.out.println("Current Sum :"+currSum);
		System.out.println("Maximum Sum :"+max);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={-2,-3,4,-1,-2,1,5,-3};
		maxSum(num);
		

	}

}
