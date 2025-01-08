package patterns;

public class rough2 {
	
	public static void sumArray(int num[]) {
		
		int max = Integer.MIN_VALUE;
		
		
		for(int i=0;i<num.length;i++){
			
			int start = i;
			for(int j=i;j<num.length;j++){
				
				int sum=0;
				int end=j;
				for(int k=start;k<=end;k++){
					System.out.print(num[k]+" ");
					sum = sum+num[k];
					
				}System.out.println(" sum :"+sum);
				System.out.println();
				
				if(max<sum){
					max = sum;
				}
				
			}System.out.println();
		}System.out.println("Max sum " + max);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={-2,4,-1,-6,-8,10};
		sumArray(num);

	}

}
