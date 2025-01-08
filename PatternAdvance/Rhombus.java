package PatternAdvance;

public class Rhombus {
	
	public static void rhom(int n) {

		for(int i=1;i<=n;i++){
			
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			//stars
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
		//  nhi likha to bhi chalega , kyuki baad vali spaces ignore hoti hai
//			//spaces
//			for(int j=n;j>=n-i;j--){
//				System.out.print(" ");
//			}
		System.out.println();
			
		}


	}
	
	

	public static void main(String[] args) {


		rhom(10);

	}

}
