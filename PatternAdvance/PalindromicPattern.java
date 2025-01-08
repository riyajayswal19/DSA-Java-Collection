package PatternAdvance;

public class PalindromicPattern {
	
	public static void Palindromic(int n){
		
		for(int i=1;i<=n;i++){
			
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			//numbers i to 1
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			
			//number 2 to i
			for(int j=2;j<=i;j++){
				System.out.print(j);
			}System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Palindromic(5);
	}

}
