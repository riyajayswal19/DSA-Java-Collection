package Arrays;

public class PairsInArray {
	
	public static void pairs(int num[]) {
		int tp=0;
		
		for(int i=0;i<num.length;i++){
			
			int current = num[i];
			for(int j=i+1;j<num.length;j++){
				System.out.print("("+current+","+num[j]+") ");
				tp++;
			}
			
			System.out.println();	
		}
		System.out.println("Total Pairs :"+tp);
		
		
	}

	public static void main(String[] args) {
		 int num[]={2,4,6,8,10};
		 pairs(num);
		 
	}

}













