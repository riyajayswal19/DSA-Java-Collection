package apna;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {

       do{
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter num : ");
    	   int num = sc.nextInt();
    	    if(num % 10 == 0){
    	    	continue;
    	    }
    	    System.out.println("Number was :"+num); 
       }
       while(true);

	}

}
