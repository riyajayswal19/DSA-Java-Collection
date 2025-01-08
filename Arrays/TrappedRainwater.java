package Arrays;

public class TrappedRainwater {
	
	public static int Rainwater(int height[] ) {
		
		int n = height.length;
		//Calcaulate LeftMax boundary
		
		int leftMax[] = new int[n];
		leftMax[0] = height[0];
		for(int i=1;i<n;i++){
		leftMax[i] = Math.max(height[i], leftMax[i-1]);
		}
		
		//Calcaulate rightMax boundary
		
		int rightMax[] = new int[n];
		rightMax[n-1]=height[n-1];
		for(int i=n-2 ; i>=0 ; i--){
			rightMax[i] = Math.max(height[i], rightMax[i+1]);
		}
		
		//Loop
		int tappedWater =0;
		for(int i=0;i<n;i++){
			
			
			//calculate waterlevel
			int waterlevel = Math.min(leftMax[i], rightMax[i]);
			
			//calculate tappedWater
			 tappedWater = tappedWater+ waterlevel-height[i];
			
		}
		
		return tappedWater;

	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int height[] ={4,2,0,6,3,2,5};
		int height[] ={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(Rainwater(height));
		
		

	}

}
