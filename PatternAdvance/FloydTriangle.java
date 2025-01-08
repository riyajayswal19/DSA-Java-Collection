package PatternAdvance;

public class FloydTriangle {
	
	public static void floyd(int n) {
		
         int num =1;
		 for(int i=1;i<=n;i++){                   
		   for(int j=1;j<=i;j++){                             
			   System.out.print(num+" ");                                          
		        num++;                                        
		   }                                                                     
		   System.out.println();                                   
		}
		
		
	}
	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floyd(5);
		

   }
}