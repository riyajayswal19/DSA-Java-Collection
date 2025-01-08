package Bit_Manipulation;

public class clear_Ith_Bit {

	public static int get(int n,int i) {
		
		int bitmask = ~(i<<1);
		return n & bitmask ;
			
	}
	

	public static void main(String[] args) {
		
		System.out.println(get(10,1));



	}	

}
