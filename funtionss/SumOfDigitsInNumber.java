package funtionss;
import java.util.Scanner;

public class SumOfDigitsInNumber {
	
	public static void sumDigits(int num) {
			int myNum = num;
			int sum =0;
			
			while(num>0){
				int lastDigit = num %10;
				sum = sum + lastDigit;
				num = num/10;
			}
			System.out.print("Sum Of "+myNum+" = "+sum);	
		}
		
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.print("Enter number: ");
			 int num = sc.nextInt();
			 sumDigits(num);	 
		}

	}

