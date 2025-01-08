package Bit_Manipulation;

public class get_Ith_Bit {
	
	public static int get(int n,int i) {
		
		int bitmask = i<<1;
		if((n & bitmask) == 0){
			return 0;
		}else{
			return 1;
		}
		
	}
	

	public static void main(String[] args) {
		
		System.out.println(get(12,3));

	}

}
