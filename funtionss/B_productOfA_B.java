package funtionss;

import java.util.Scanner;

public class B_productOfA_B {
	
	public static int multilpy(int a,int b) {
	      int product = a*b;
	    	return product;
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a  : ");
		int x = sc.nextInt();
		System.out.println("Enter value of b  : ");
		int y = sc.nextInt();
		int prod = multilpy(x,y);
		System.out.println("Product : "+prod);

	}

}
