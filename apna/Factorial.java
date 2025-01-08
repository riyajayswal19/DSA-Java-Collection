package apna;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		int fact = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int num = sc.nextInt();
//		for(int i = 1;i<=num;i++){
//			fact=fact*i;
//		}
//		System.out.println("Factorial: "+fact);
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
//	 Scanner sc = new Scanner(System.in);	
//	 int num;
//	 int i = 1;
//	 int fact = 1;
//	 System.out.println("Enter number : ");
//	  num = sc.nextInt();
//	 
//	 do{
//		 
//		  fact = fact*i;
//		  i++;
//		 
//	 }
//	 while(i<=num);
//	 System.out.println("Factorial: "+fact);
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		 int num;
		 int i = 1;
		 int fact = 1;
		 System.out.println("Enter number : ");
		 num = sc.nextInt();
		 
		 while(i<=num){
			 fact = fact*i;
			 i++;
		 }
		 System.out.println("Factorial: "+fact);
		
	}

}
