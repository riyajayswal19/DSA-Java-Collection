package funtionss;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static void reverse(int num) {
		int myNum = num;
		int rev =0;
		
		while(num>0){
			int lastDigit = num %10;
			rev = rev * 10 + lastDigit;
			num = num/10;
		}
		
		if(myNum == rev){
			System.out.print("Number is palindrome");	
		}else{
			System.out.print("Number is not palindrome");
		}
		
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number: ");
		 int num = sc.nextInt();
		 reverse(num);
		 
	}

}
