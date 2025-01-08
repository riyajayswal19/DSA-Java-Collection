package Bit_Manipulation;

public class clear_LastBit {
	
	public static int lastBit(int n,int i) {
		
		int bitmask = (-1)<<i;
		return n & bitmask;

	}

	public static void main(String[] args) {

		System.out.println(lastBit(15,2));

	}

}
