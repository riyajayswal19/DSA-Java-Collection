package String;

public class ShortestPath {

	public static void main(String[] args) {
		
		String path ="WNEENESENNN";
		
		int X=0 , Y=0;
		
		for(int i=0;i<path.length();i++){
			char dir =path.charAt(i);
			
			//North
			if(dir == 'N'){
				Y++;
			}
			
			//South
			if(dir == 'S'){
				Y--;
			}
			
			//North
			if(dir == 'E'){
				X++;
			}
			
			//North
			if(dir == 'W'){
				X--;
			}
		}
		
		int X2 = X*X;
		int Y2 = Y*Y;
		
		System.out.println(Math.sqrt(X2+Y2));

	}

}
