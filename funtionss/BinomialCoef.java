package funtionss;
import java.util.Scanner;

public class BinomialCoef {
	
		public static int factorial(int num) {
			int fact = 1;
			int i = 1;
			
			 while(i<=num){
			      fact = fact*i;
			      i++;
			 }
			 return fact;
		}
		
		
		public static int bincoef(int num,int r) {
			int n_fact = factorial(num);
			int r_fact = factorial(r);
			int nmr_fact = factorial(num-r);
			int binomialCoeff = n_fact/(r_fact * nmr_fact);
			
			return binomialCoeff;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			int num = sc.nextInt();
			System.out.println("Enter r : ");
			int r = sc.nextInt();
			int bincoe = bincoef(num,r);
			System.out.println("Binomai Coefficient : "+bincoe);
			 
		}

	}
