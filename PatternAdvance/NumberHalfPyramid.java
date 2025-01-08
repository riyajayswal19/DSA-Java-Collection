package PatternAdvance;

public class NumberHalfPyramid 
{
	
//	public static void NumPyramid(int n) 
//	{
//		
//			for(int i =1;i<=n;i++)
//			{
//				for(int j=1;j<=n-i+1;j++)
//				{
//					System.out.print(j+" ");
//					
//				}
//				System.out.println();
//			}
//    }
//	
//	public static void main(String[] args) {
//		NumPyramid(5);
//
//	}
	
	public static void main(String[] args) {
		
		
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
			
		}
	}

}
