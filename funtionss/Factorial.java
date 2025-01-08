package funtionss;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num) {
		int fact = 1;
		int i = 1;
		
		 while(i<=num){
		      fact = fact*i;
		      i++;
		 }
		 return fact;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number : ");
		num = sc.nextInt();
		int facto = factorial(num);
		System.out.println("Factorial: "+facto);
		 
	}

}
