package PatternAdvance;

public class InvertedPyramid {
	
    public static void inverted_pyramid(int n)
    {
    	
    	for( int i=1;i<=n;i++)
    	{
    		
    		//spaces	
    		for(int j= 1; j<=n-i;j++)
    		{
    			System.out.print(" ");
    		}
    			
    			//star
    			for(int j= 1; j<=i;j++)
    			{
        			System.out.print("*");
    			}	
    			System.out.println();
    	}
  }
		

    public static void main(String[] args) {
		inverted_pyramid(10);

	}

}
