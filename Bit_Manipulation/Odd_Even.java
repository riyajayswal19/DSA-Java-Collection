package Bit_Manipulation;

public class Odd_Even {
	
	public static void oddEv(int n) {
		int bitmask =1;
		if((n & bitmask) == 0){
			System.out.println( n+" is even");
		}else{
			System.out.println( n+" is odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddEv(3);
		System.out.println("-------");
		oddEv(20);
		

	}

}
