package funtionss;

import java.util.Scanner;

public class AverageOf3N {
	
	public static double average(double a,double b,double c) {
		
		double sum = a+b+c;
		double avg = sum/3;
		System.out.println("Average of given 3 numbers: "+avg);
		return avg;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		double a= sc.nextInt();
		System.out.println("Enter num2 : ");
		double b = sc.nextInt();
		System.out.println("Enter num3 : ");
		double c = sc.nextInt();
		
		average(a,b,c);

	}

}
