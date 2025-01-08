package funtionss;

public class DecimalToBin {
	
	public static void decTOBin(int dec) {
		int power = 0;
		int binary =0;
		while(dec>0){
			int rem = dec%2;
			binary = binary +(rem * (int) Math.pow(10,power));
			power++;
			dec = dec/2;
		}
		
		System.out.println(binary);
	}

	public static void main(String[] args) {
	     decTOBin(4);

	}

}
