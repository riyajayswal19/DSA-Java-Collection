package PatternAdvance;

public class NumberPyramid {
	
	public static void numPyramid(int n) {
		
		for(int i=1;i<=n;i++){
			
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			//stars
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		numPyramid(5);
	}

}
