package funtionss;

import java.util.Scanner;

public class EvenOrOdd {
	
//	public static boolean isEven(int number) {
//		if(number % 2 == 0){
//			return true;
//		}else{
//			return false;
//		}
//
//	}
//    public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int a= sc.nextInt();
//		
//		if(isEven(a)){
//			System.out.println("Even number");
//		}else{
//			System.out.println("Odd number");
//		}
//
//	}
//
//}

	
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num;
	 System.out.print("Enter an integer: ");
	 num = sc.nextInt();
	 if(isEven(num)) {
	 System.out.println("Number is even");
	 } else {
	 System.out.println("Number is odd");
	 
	 }
	 }
	 public static boolean isEven(int number) {
	 if(number % 2 == 0) {
	 return true;
	 }
	 else {
	 return false;
	 }
	 }
}


















