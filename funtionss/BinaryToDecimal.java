//
///////////////// Using while loop /////////////////////////////
//
//package funtionss;
//
//public class BinaryToDecimal {
//	public static void binToDec(int binNum) {
//		int myNum = binNum;
//		int decimal = 0;
//		int power = 0;
//		 while(binNum >0){
//			 int LastGigit = binNum % 10;
//			 decimal = decimal + (LastGigit * (int) Math.pow(2, power));
//			 
//			 binNum = binNum/10;
//			 
//			 power ++;
//		 }
//		 
//		 System.out.println(myNum+" to decimal : "+ decimal);
//     }
//	
//
//	public static void main(String[] args) {
//		binToDec(11111);
//
//	}
//
//}

/////////////// Using for loop /////////////////////////////
package funtionss;

public class BinaryToDecimal {
	
	public static void binToDec(int binNum) {
		int myNum = binNum;
		int decimal = 0;
		
		 for(int power=0;binNum >0;power++){
			 int LastGigit = binNum % 10;
			 decimal = decimal + (LastGigit * (int) Math.pow(2, power));
			 
			 binNum = binNum/10;
			
		 } 
		 
		 System.out.println(myNum+" to decimal : "+ decimal);
     }
	

	public static void main(String[] args) {
		binToDec(1111);

	}

}

