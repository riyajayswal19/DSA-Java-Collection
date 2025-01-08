package Arrays;

public class TotalPairsArray {
	
	public static int totalPairs(int num[]) {
		int n =  num.length;
		
		int totalPairs = (n*(n-1))/2;
		return totalPairs;	

	}
	
	

	public static void main(String[] args) {
		
		 int num[]={2,4,6,8,10};
		 System.out.println("Total Pairs :"+totalPairs(num));
	}

}
