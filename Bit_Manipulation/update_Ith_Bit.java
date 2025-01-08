package Bit_Manipulation;

public class update_Ith_Bit {
	
	public static int setBit(int n,int i) {

		int bitmask = i<<1;
		return n | bitmask;

	}
	
	public static int clearBit(int n,int i) {
		int bitmask = ~(i<<1);
		return n & bitmask;
	}
	
	public static int update(int n,int i,int newbit) {
		
		//First way/////////
//		if(newbit == 0){
//			return clearBit(n ,i);
//		}else{
//			return setBit(n,i);
//		}
///////////////////////////////////////////////////////////		
		
		//second way
		
		n=clearBit(n ,i);
		int bitmask = newbit<<i;
		return n | bitmask;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(update(10,2,1));

	}

}
