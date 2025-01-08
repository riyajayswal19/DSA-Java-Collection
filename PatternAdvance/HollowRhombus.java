package PatternAdvance;

public class HollowRhombus {
	
	
	public static void hollowRh(int n){
		
		
		for(int i=1 ;i<=n;i++){
			
			//spaces
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			
			//stars hollow rectangle ka code
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       hollowRh(10);
	}

}
