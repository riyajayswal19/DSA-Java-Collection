package funtionss;

import java.util.Scanner;

public class A1 {
	
        public static int printSum(int a,int b) {
		
		int sum = a+b;
		
		System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		 int a = sc.nextInt();
		 System.out.println("Enter b : ");
		 int b = sc.nextInt();
		 printSum(a,b);
     	
	}
		
	}


