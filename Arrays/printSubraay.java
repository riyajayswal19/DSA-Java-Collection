package Arrays;
///////////////////very very very important//////////////////////////////
public class printSubraay {

	public static void subarray(int num[]) {
		
		for(int i=0;i<num.length;i++){
			
			int start = i;
			
			int maximum =Integer.MIN_VALUE;
			int minimum = Integer.MAX_VALUE;
				for(int j=i;j<num.length;j++)
				{
				
						int end=j;
						int sum=0;
						
						for(int k=start;k<=end;k++)
						{
						 System.out.print(num[k]+" ");
						 sum= sum+num[k];
					    }
						System.out.print(" = Sum is "+sum);
						System.out.println( );
						if(maximum<sum){
							maximum =sum;
					      }
						
						if(minimum>sum){
							minimum =sum;
					      }
					
				}
				
				System.out.println("maximum : "+ maximum );
				System.out.println("minimum : "+ minimum );
				System.out.println( );		 
		}
		
	}
	

	public static void main(String[] args) {
		int num[] = {-2,4,-1,6,8,10};

		subarray(num);
	}

}
