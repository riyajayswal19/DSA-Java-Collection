
// Write a program that reads a set of integers,and then prints the sum of the
 //even and odd integers
package apna;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		do{
			System.out.println("Enter number : ");
			 number = sc.nextInt();
			 
			  if(number %2 == 0){
			    
				 evenSum = evenSum + number;
			    
			  }else{
			    		 
				 oddSum = oddSum + number;
			    
			  }
			 
			 System.out.println("Enter 1 for continuue and 0 for exit ");
			 choice = sc.nextInt(); 
		} while(choice == 1);
		
			System.out.println("Even sum : "+ evenSum);
			System.out.println("Odd sum : "+oddSum);
			
	}

}
